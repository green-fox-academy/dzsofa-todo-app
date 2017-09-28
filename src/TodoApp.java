import java.nio.file.Paths;

public class TodoApp {
    public static void main(String[] args) {

        if (args[0].equals( "-l" )) {
            Usage.writeLines( "/home/dzsofa/greenfox/dzsofa-todo-app/Assets/tasks.txt" );
        } else if (args[0].equals( "-a" )) {
            System.console().writer().println("Add task");
        } else if (args[0].equals( "-r" )) {
            System.console().writer().println("Remove task");
        } else if (args[0].equals( "-c" )) {
            System.console().writer().println("Complete task");
        }
        else {
            Usage.writeLines( "/home/dzsofa/greenfox/dzsofa-todo-app/Assets/printusage.txt" );
        }
    }
}
