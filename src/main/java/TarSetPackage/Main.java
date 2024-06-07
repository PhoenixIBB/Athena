package TarSetPackage;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main (String[] args) throws IOException {
        ImportManager importManager = new ImportManager();
        List<Task> tasks = importManager.readData();



        ExportManager exportManager = new ExportManager(tasks);
        exportManager.recordData();
        System.out.println(tasks);
    }
}
