import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileGenerator {

    public static void generate(Integer wordsCount, String dictionaryFilePath, String outputFilePath) throws IOException {
        List<String> dictonaryWords = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(dictionaryFilePath));
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
            if (i < wordsCount - 1) {
                writer.newLine();
            }
        }
        writer.close();
    }
}