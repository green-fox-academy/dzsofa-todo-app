import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {

        if (args.length != 0) {
            if (args[0].equals( "-l" )) {
                Usage.writeLines( "./Assets/tasks.txt" );
            } else if (args[0].equals( "-a" )) {
                System.out.println( "Add task" );
//                Scanner sc = new Scanner( System.in );
//                args[1] = sc.next();
//                Files.write(Paths.get( "./Assets/tasks.txt" , args[1]));
            } else if (args[0].equals( "-r" )) {
                System.console().writer().println( "Remove task" );
            } else if (args[0].equals( "-c" )) {
                System.console().writer().println( "Complete task" );
            } else {
                System.out.println( "Unsupported argument\n" );
            }
        }
        Usage.writeLines( "./Assets/printusage.txt" );

    }
}
