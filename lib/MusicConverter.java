import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileWriter;
import java.io.IOException;

public class MusicConverter {
    public static class Eval extends MusicBaseVisitor<String> {
        @Override
        public String visitInit(MusicParser.InitContext ctx) {

            String resultado = "{\n" + visit(ctx.prog()) + "\n}";

            try {
                FileWriter myWriter = new FileWriter("temp/output.json");
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
            return visit(ctx.metro()) + visit(ctx.notes(0));
        }

        @Override
        public String visitMetro(MusicParser.MetroContext ctx) {
            return "\"metronome:\"" + visit(ctx.VALUE());
        }

        @Override
        public String visitNotes(MusicParser.NotesContext ctx) {
            return "{ \n" + "\"chord\": " + ctx.NOTE().getText() + ",\n" + "\"time\": " + ctx.TIME().getText() + "\n }";
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
        ParseTree tree = parser.prog();

        Eval eval = new Eval();

        System.out.println(eval.visit(tree));

    }

}