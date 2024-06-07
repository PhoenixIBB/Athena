package TarSetPackage;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class ImportManager {

    public List<Task> readData() throws IOException {

        List<Task> tasks = new ArrayList<>();
        char priority;
        char priorityNumber;
        String name;
        String date;
        boolean completeness;
        int taskNumber = 0;

        Path path= Paths.get(DataManager.RESOURCES);

        List<String> lines = Files.readAllLines(path);

        for (String line : lines) {

            String[] columns = line.split(",");

            priority = columns[0].charAt(0);
            priorityNumber = columns[1].charAt(0);
            name = columns[2];
            date = columns[3];
            completeness = columns[4].matches("true");
            taskNumber++;

            Task task = new Task(priority, priorityNumber, name, date, completeness, taskNumber);

            tasks.add(task);
        }

        return tasks;
    }
}