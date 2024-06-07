package TarSetPackage;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.DayOfWeek;

public class OperActions {
    public static void main (String[] args) {
        // Путь
        String filePath = "C:\\Users\\gilma\\Desktop\\Java\\My projects\\Files\\tasks.xml";
        boolean flag = true;
        boolean flag2 = true;
        Scanner scan = new Scanner(System.in);
        char firstField;
        char secondField;
        String thirdField;
        String fourthField;
        boolean fifthField;
        LocalDate dayDate;


        // Добавить управление типа добавить или вывести. Ещё добавить или хватит? Сканнеры на поля задач. Ну и в итоге нужно добраться до xml-иерархии хранения планов
        System.out.println("Пожалуйста, введите дату.");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        dayDate = LocalDate.parse("01.01.2023", formatter);
        DayOfWeek dayOfWeek = dayDate.getDayOfWeek();
        Day day = new Day(dayDate, dayOfWeek);

        do {
        System.out.println("\nЧто вы хотите сделать? \n• Просмотреть список задач (1) \n• Добавить задачу (2) \n• Редактировать задачу (3) \n• Удалить задачу (4) \n• Завершить программу (5)");
        int choose = scan.nextInt();
            switch (choose) {
                case 1:
                    day.showMeAll();
                    break;
                case 2:
                    do {
                        System.out.println("Введите приоритет.");
                        firstField = scan.next().charAt(0);
                        System.out.println("Введите цифру, соответствующую приоритету.");
                        secondField = scan.next().charAt(0);
                        scan.nextLine();
                        System.out.println("Введите описание задачи.");
                        thirdField = scan.nextLine();
                        System.out.println("Введите желаемую дату выполнения задачи в формате XX.YY.ZZZZ.");
                        fourthField = scan.nextLine();
                        System.out.println("Задача уже выполнена?");
                        fifthField = scan.nextBoolean();
                        scan.nextLine();
                        int sixthField = 0;
                        // Блок создания задачи
                        Task task = new Task(firstField, secondField, thirdField, fourthField, fifthField, sixthField);
                        day.addTask(task);
                        scan.nextLine();
                        System.out.println("Хотите добавить ещё одну задачу? (Д/Н)");
                        String answer = scan.nextLine();
                        if (answer.equals("Н")) {
                            flag = false;
                        }
                    } while (flag);
                    break;
                case 5:
                    flag2 = false;
            }
        } while (flag2);
        scan.close();
    }
}
