import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileWriter;
import java.io.IOException;

public class MusicConverter {
    public static class Eval extends MusicBaseVisitor < String > {
        @Override
        public String visitInit(MusicParser.InitContext ctx) {

            String resultado = "{ \n";
            resultado += visit(ctx.prog()) + "\n}";

            try {
                FileWriter myWriter = new FileWriter("../scripts/notes.json");
                myWriter.write(resultado);
                myWriter.close();
                return "Um arquivo JSON foi gerado com sucesso.";
            } catch (IOException e) {
                e.printStackTrace();
                return "Erro ao gerar arquivo.";
            }

        }

        @Override
        public String visitProg(MusicParser.ProgContext ctx) {
            String n = "";
            int len = 1;
            int max = ctx.notes().size();
            for (MusicParser.NotesContext notesCtx: ctx.notes()) {
                if (len < max) {
                    n += "\t{" + visit(notesCtx) + "},\n";
                    len++;
                } else {
                    n += "\t{" + visit(notesCtx) + "}\n";
                }
            }
            return visit(ctx.metro()) + "\t\"notes\": [\n" + n + "]";
        }

        @Override
        public String visitMetro(MusicParser.MetroContext ctx) {
            return "\t\"metronome\":" + ctx.VALUE() + ", \n";
        }

        @Override
        public String visitNotes(MusicParser.NotesContext ctx) {
            return "\"chord\": \"" + ctx.NOTE().getText() + "\", " + "\"time\": " + ctx.TIME().getText();
        }
    }

    public static void main(String[] args) throws Exception {
        CharStream input;
        if (args.length > 0)
            input = CharStreams.fromFileName(args[0]);
        else
            input = CharStreams.fromStream(System.in);

        MusicLexer lexer = new MusicLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MusicParser parser = new MusicParser(tokens);
        ParseTree tree = parser.init();

        Eval eval = new Eval();

        System.out.println(eval.visit(tree));

    }

}