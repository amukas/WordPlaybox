import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileAnalyzer {

    public static void analyze(String inputFileSrc) throws IOException {
        Map<String, Integer> wordsWithCount = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(inputFileSrc)); // do you need to close reader?
        String currentLine;

        while ((currentLine = reader.readLine()) != null) {
//            System.out.println(currentLine);
            if (wordsWithCount.get(currentLine) != null) { // it is hard to read if you extract `wordsWithCount.get(currentLine) != null` to a variable it make code more readable
                wordsWithCount.put(currentLine, wordsWithCount.get(currentLine) + 1); // can you optimize your code, so that you call `wordsWithCount.get` one time?
            }
            else {
                wordsWithCount.put(currentLine, 1);
            }
        }


        for (Map.Entry<String, Integer> entry : wordsWithCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("No of map elements: " + wordsWithCount.size());
    }
}
