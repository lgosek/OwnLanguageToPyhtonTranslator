package pl.edu.agh.compilers.translator;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import pl.edu.agh.compilers.gramatykaLexer;
import pl.edu.agh.compilers.gramatykaParser;

import java.io.IOException;

public class TranslatorMain {
    public static void main (String[] args) {
        CharStream inputStream = null;
        try {
            inputStream = CharStreams.fromFileName("/home/lukasz/Dokumenty/Kompilatory/Projekt/src/main/resources/sample");
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(inputStream == null)
            System.out.println("error");

        gramatykaLexer gramatykaLexer = new gramatykaLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(gramatykaLexer);
        gramatykaParser markupParser = new gramatykaParser(commonTokenStream);

        gramatykaParser.ProgramContext programContext = markupParser.program();
        TranslatorGramatykaVisitor visitor = new TranslatorGramatykaVisitor();
        String result = visitor.visit(programContext);

//        TODO write to file instead of sout
        System.out.println(result);
    }
}
