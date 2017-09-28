import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Usage {
      public static void writeLines(Path usagePath) {
        usagePath = Paths.get( "/home/dzsofa/greenfox/dzsofa-todo-app/Assets/printusage.txt" );
        try {
            List<String> allLines = Files.readAllLines( usagePath );
            for (String lines : allLines) {
                System.console().writer().print(lines);
                System.console().writer().println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


