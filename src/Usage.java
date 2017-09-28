import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Usage {
    public static void main(String[] args) {
        Path usagePath = Paths.get("./printusage.txt");
        try {
            System.console().writer().println(Files.readAllLines(usagePath));
            System.console().writer().println();
        } catch (IOException e) {
            e.printStackTrace();
        }
//            List<String> userMan = Files.readAllLines(usagePath);
//            System.console().writer().println(userMan);
    }
}


