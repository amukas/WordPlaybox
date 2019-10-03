import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileGenerator {

    //why Integer, not int? please google what is the difference and when to use what (+ google about Boxing/Unboxing)
    public static void generate(Integer wordsCount, String dictionaryFilePath, String outputFilePath) throws IOException {
        List<String> dictonaryWords = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(dictionaryFilePath)); // do we need to close reader? why?
        String currentLine;
        Random r = new Random();

        while ((currentLine = reader.readLine()) != null) {
            dictonaryWords.add(currentLine);
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
        for (int i = 0; i < wordsCount; i++) {
            int nextRandomIndex = Math.abs(r.nextInt() % dictonaryWords.size());
            String nextRandomWord = dictonaryWords.get(nextRandomIndex);
            writer.write(nextRandomWord);
            if (i < wordsCount - 1) { // `i < wordsCount - 1` is hard to read, if you extract to a variable it will make your code clearer
                writer.newLine();
            }
        }
        writer.close(); // what if exception is thrown? in the loop above, will this close be executed? how can you fix it?
    }
}