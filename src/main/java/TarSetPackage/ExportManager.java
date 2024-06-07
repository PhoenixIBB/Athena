package TarSetPackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ExportManager {

    private List<Task> tasks = new ArrayList<>();
    private StringBuilder line;

    public ExportManager (List<Task> tasks) { this.tasks = tasks; }

    public void recordData() throws IOException {



        for (Task task : tasks) {
            String objectTask = task.getTaskPriority() + "," + task.getTaskPriorityNumber() + "," + task.getTaskName() + "," + task.getTaskDate() + "," + task.getTaskCompleteness();
            Files.write(DataManager.RESOURCES_PATH, objectTask.getBytes());
        }



    }



}
