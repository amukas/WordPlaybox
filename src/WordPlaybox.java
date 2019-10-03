import java.io.IOException;

public class WordPlaybox {
    //try to avoid using static, it make your code hard to test (and many-many more reasons, google for more)
    public static void play(String action, Integer count, String dictionary, String output) throws IOException { // `throws IOException` makes no sense here, it should be handled in FileGenerator
        // never use `==` to compare strings. use equals instead
        // for example "generate".equals(action)
        // think why I written "generate".equals(action), not action.equals("generate")
        if (action == "generate") {
            FileGenerator.generate(count, dictionary, output);
        }
        else {
            //better to throw exception
            System.out.println("Working only with action name: generate");
        }
    }

    public static void play(String action, String input) throws IOException { // `throws IOException` makes no sense here, it should be handled in FileGenerator
        // never use `==` to compare strings. use equals instead
        if (action == "analyze") {
            FileAnalyzer.analyze(input);
        }
        else {
            //better to throw exception
            System.out.println("Working only with action name: analyze");
        }
    }
}
