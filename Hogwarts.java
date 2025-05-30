import java.util.ArrayList;
import java.util.List;

public class Hogwarts {
    private static ArrayList<Student> students = new ArrayList<>();
    private static ArrayList<String> courses = new ArrayList<>(List.of(
            "Зельеварение",
            "Магловедение",
            "Мать и Матиха",
            "Живноведение",
            "Растенелогия",
            "Гусский язык",
            "Землелогия",
            "Здравоведение"
    ));
    private static ArrayList<String> groups = new ArrayList<>(List.of(
            "Пыхтуны",
            "Спуны",
            "Добруны",
            "Силуны"
    ));
    private static ArrayList<Integer> educationYears = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

    // Геттеры
    public static ArrayList<String> getGroups() {
        return groups;
    }
    public static ArrayList<String> getCourses() {
        return courses;
    }
    public static ArrayList<Integer> getEducationYears() {
        return educationYears;
    }
    public static ArrayList<Student> getStudents() {
        return students;
    }
    // Сеттеры

    // Добавить студента
    public static void addStudent(Student student) {
        students.add(student);
    }
    // Удалить студента
    public static void removeStudent(Student student) {
        students.remove(student.getStudentID());
    }
    // Отчисляет всех студентов со средней оценкой < 3
    public static void excludeStupid() {
        double averageGrade = 3;
        ArrayList<Student> stupids = new ArrayList<>();
        for (Student student : students) {
            if (student.avrGrade() < averageGrade) {
                stupids.add(student);
            }
        }
        students.removeAll(stupids);
    }
    // Перевести студента на следующий год при оценке 3+
    public static void transferStudentNextYear(Student student) {
        double avrGrade = 3;
        if (student.avrGrade() >= avrGrade) {
            student.setEducationYear(student.getEducationYear() + 1);
        }
    }
    // Вывести всех студентов и их курс
    public static void printStudents() {
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getEducationYear() + " курс");
        }
    }
    // Все студенты на текущем курсе
    public static void printStudentsOnEducationYear(int year) {
        for (Student student : students) {
            if (student.getEducationYear() == year) {
                System.out.println(student.getName());
            }
        }
    }
}
