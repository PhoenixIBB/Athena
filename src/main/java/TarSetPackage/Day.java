package TarSetPackage;
import java.time.DayOfWeek;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;

public class Day {
    private LocalDate dateOfDay;
    private DayOfWeek dayOfWeek;
    private Map<Integer, Task> tasksOfDay;


    public Day (LocalDate date) {
        this.dateOfDay = date;
        this.tasksOfDay = new HashMap<Integer, Task>();
    }
    public Day (LocalDate date, DayOfWeek weekDay) {
        this.dateOfDay = date;
        this.dayOfWeek = weekDay;
        this.tasksOfDay = new HashMap<Integer, Task>();
    }


    public void addTask (Task task) {
        int i = tasksOfDay.size() + 1;
        tasksOfDay.put(i, task);
    }

    public Day getDay () { return (Day) tasksOfDay; }

    public void showMeAll () {
            for (Map.Entry<Integer, Task> entry : tasksOfDay.entrySet()) {
                System.out.println();
                System.out.println("Задача №" + entry.getKey() + ": \n" + entry.getValue().showTaskInfo());
        }
    }












}
