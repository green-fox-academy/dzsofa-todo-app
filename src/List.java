import java.nio.file.Files;
import java.util.ArrayList;

public class List {
    private ArrayList<Task> tasks;

    public List() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add( task );
    }



    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < tasks.size(); i++) {
            result += (i + 1) + ". " + tasks.get( i ) + "\n";
        }
        return result;
    }
}
