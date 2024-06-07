package TarSetPackage;

import java.nio.file.Path;
import java.time.format.DateTimeFormatter;

public class DataManager {
    public static String RESOURCES = "C:\\Users\\gilma\\Desktop\\Java\\My projects\\TaskFiles\\tasks.csv";
    public static Path RESOURCES_PATH = Path.of(RESOURCES);
    public static DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("yyyy-MM-dd");
}
