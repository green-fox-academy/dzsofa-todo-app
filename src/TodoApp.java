import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Path taskPath = Paths.get( "./Assets/tasks.txt" );
        Task myNewTask = null;

        if (args.length != 0) {
            if (args[0].equals( "-l" )) {
                Usage.writeLines( "./Assets/tasks.txt" );
            } else if (args[0].equals( "-a" )) {
                try {
                    List<String> valami = new ArrayList<>();
                    valami.add( args[1] );
                    Files.write( taskPath, valami, StandardOpenOption.APPEND );
                    System.out.println( "Added to the list." );
                } catch (IOException e) {
                    System.out.println( "Unable to write file: " + taskPath );
                }
                System.out.println( "Add task" );
            } else if (args[0].equals( "-r" )) {
                System.out.println( "Remove task" );
            } else if (args[0].equals( "-c" )) {
                System.out.println( "Complete task" );
            } else {
                System.out.println( "Unsupported argument\n" );
            }
        } else {
            Usage.writeLines( "./Assets/printusage.txt" );
        }



    }
}
