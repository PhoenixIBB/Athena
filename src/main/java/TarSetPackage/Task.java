package TarSetPackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {

    // Заметки:
    // В дальнейшем нужно добавить присвоение номера последовательности выполнения и алгоритм сортировки, который будет их сортировать по возрастанию
    // Примерное время на выполнение план и факт
    // Авторасчет, успеешь или нет и сколько времени вообще займут все дела в сумме

    // Поля класса
    private int taskNumber;
    // приоритет задачи
    private char taskPriority;
    // цифра приоритета
    private char taskPriorityNumber;
    // имя задачи
    private String taskName;
    // статус выполнения задачи
    private boolean taskCompleteness;
    // планируемая дата выполнения. Здесь мы просто создали переменную типа LocalDate, но не объект. Затем с помощью метода parse будет создан объект и присвоен этой переменной
    private LocalDate taskDate;



    // Основные методы
    // Конструктор полный:
    Task (char firstField, char secondField, String thirdField, String fourthField, boolean fifthField, int taskNumber) {
        this.taskPriority = firstField;
        this.taskPriorityNumber = secondField;
        this.taskName = thirdField;
        // Класс для форматирования даты по заданному паттерну:
        this.taskDate = LocalDate.parse(fourthField, DataManager.DATE_PATTERN);
        this.taskCompleteness = fifthField;
    }

    // Далее сеттеры
    // Метод редактирования одной задачи целиком
    public void changeTask (char firstField, char secondField, String thirdField, String fourthField, boolean fifthField) {
        switch (firstField) {
            case 'A': this.taskPriority = firstField; break;
            case 'B': this.taskPriority = firstField; break;
            case 'C': this.taskPriority = firstField; break;
            case 'D': this.taskPriority = firstField; break;
            default: break;
        }
        this.taskPriorityNumber = secondField;
        this.taskName = thirdField;
        this.taskDate = LocalDate.parse(fourthField, DataManager.DATE_PATTERN);
        this.taskCompleteness = fifthField;
    }
    // Метод редактирования одной задачи без приоритетов
    public void changeTask (String thirdField, String fourthField, boolean fifthField) {
        this.taskName = thirdField;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        this.taskDate = LocalDate.parse(fourthField, formatter);
        this.taskCompleteness = fifthField;
    }
    // Метод редактирования одной задачи без даты
    public void changeTask (char firstField, char secondField, String thirdField, boolean fifthField) {
        switch (firstField) {
            case 'A': this.taskPriority = firstField; break;
            case 'B': this.taskPriority = firstField; break;
            case 'C': this.taskPriority = firstField; break;
            case 'D': this.taskPriority = firstField; break;
            default: break;
        }
        this.taskPriorityNumber = secondField;
        this.taskName = thirdField;
        this.taskCompleteness = fifthField;
    }
    // Метод редактирования одной задачи без комплитнесса
    public void changeTask (char firstField, char secondField, String thirdField, String fourthField) {
        switch (firstField) {
            case 'A': this.taskPriority = firstField; break;
            case 'B': this.taskPriority = firstField; break;
            case 'C': this.taskPriority = firstField; break;
            case 'D': this.taskPriority = firstField; break;
            default: break;
        }
        this.taskPriorityNumber = secondField;
        this.taskName = thirdField;
        this.taskDate = LocalDate.parse(fourthField, DataManager.DATE_PATTERN);
    }
    // Метод редактирования одной задачи приоритета и имени
    public void changeTask (char firstField, char secondField, String thirdField) {
        switch (firstField) {
            case 'A': this.taskPriority = firstField; break;
            case 'B': this.taskPriority = firstField; break;
            case 'C': this.taskPriority = firstField; break;
            case 'D': this.taskPriority = firstField; break;
            default: break;
        }
        this.taskPriorityNumber = secondField;
        this.taskName = thirdField;
    }
    // Метод редактирования одной задачи только приоритета
    public void changeTask (char firstField, char secondField) {
        switch (firstField) {
            case 'A': this.taskPriority = firstField; break;
            case 'B': this.taskPriority = firstField; break;
            case 'C': this.taskPriority = firstField; break;
            case 'D': this.taskPriority = firstField; break;
            default: break;
        }
        this.taskPriorityNumber = secondField;
    }
    // Метод редактирования одной задачи только имени
    public void changeTask (String thirdField) {
        this.taskName = thirdField;
    }
    // Метод редактирования одной задачи только комплитнесс и из списка и из окна редактирования
    public void changeTask(boolean fifthField){
        this.taskCompleteness = fifthField;
    }
    // Метод редактирования одной задачи только комплитнесс и из списка и из окна редактирования
    public void setTaskCompleteness(boolean fifthField){
        this.taskCompleteness = fifthField;
    }

    // Далее геттеры
    public char getTaskPriority () { return taskPriority; }
    public int getTaskPriorityNumber () { return taskPriorityNumber; }
    public String getTaskName () { return taskName; }
    public boolean getTaskCompleteness() { return taskCompleteness; }
    public LocalDate getTaskDate() { return taskDate; }

    public String showTaskInfo () { return taskPriority + String.valueOf(taskPriorityNumber) + "\n" + taskName + "\n" + taskDate + "\n" + taskCompleteness; }

    @Override
    public String toString() {
        return "Task:" +
                "taskPriority=" + taskPriority +
                ", taskPriorityNumber: " + taskPriorityNumber +
                ", taskName: '" + taskName + '\'' +
                ", taskCompleteness: " + taskCompleteness +
                ", taskDate: " + taskDate;
    }
}





