import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        WordPlaybox.play("generate", 100, "dictonary.txt","hello-world.txt");
        WordPlaybox.play("analyze", "hello-world.txt");
    }
}
