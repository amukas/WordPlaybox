import java.io.IOException;

public class WordPlaybox {
    public static void play(String action, Integer count, String dictionary, String output) throws IOException {
        if (action == "generate") {
            FileGenerator.generate(count, dictionary, output);
        }
        else {
            System.out.println("Working only with action name: generate");
        }
    }

    public static void play(String action, String input) throws IOException {
        if (action == "analyze") {
            FileAnalyzer.analyze(input);
        }
        else {
            System.out.println("Working only with action name: analyze");
        }
    }
}
