import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileWriter;
import java.io.IOException;

public class MusicConverter {
    public static void main(String[] args) throws Exception {
        CharStream input;
        if (args.length > 0)
            input = CharStreams.fromFileName(args[0]);
        else
            input = CharStreams.fromStream(System.in);

        ListLexer lexer = new ListLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ListParser parser = new ListParser(tokens);
        ParseTree tree = parser.prog();

        Eval eval = new Eval();

        System.out.println(eval.visit(tree));

    }

    public static class Eval extends MusicVisitor<String> {

        @Override
        public String visitInit(MusicParser.InitContext ctx){
            String result = ""
        }

        @Override
        public String visitProg(MusicParser.ProgContext ctx){

        }

        @Override
        public String visitNotes(MusicParser.NotesContext ctx){

        }

    }

}