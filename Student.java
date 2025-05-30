import java.util.*;

public class Student {
    private static HashSet<Integer> studentIdList = new HashSet<>(); // занятые стуентами id
    private int studentID; // id студента
    private String name;
    private String group;
    private ArrayList<String> courses;
    private HashMap<String, Integer> marks;
    private int educationYear;

    // Конструктор
    public Student(String name, String group, ArrayList<String> courses, int edYear) {
        this.name = name;
        this.group = group;
        this.courses = courses;
        this.marks = new HashMap<>();
        this.educationYear = edYear;
        for (String course : courses) {
            this.marks.put(course, 0);
        }

        // Находим свободный ID, добавляем в studentIdList его айдишник и присваиваем его студенту
        for (int i = 1; i <= studentIdList.size() + 2; i++) {
            if (studentIdList.contains(i)) {
                continue;
            } else {
                studentIdList.add(i);
                this.studentID = i;
                break;
            }
        }
    }

    // Геттеры
    public int getEducationYear() {
        return this.educationYear;
    }
    public int getStudentID() {
        return this.studentID;
    }
    public HashMap<String, Integer> getMarks() {
        return this.marks;
    }
    public String getName() {
        return  this.name;
    }
    public ArrayList<String> getCourses() {
        return this.courses;
    }

    // Сеттеры
    public void setEducationYear(int year) {
        this.educationYear = year;
    }
    public void setMark(String course, int mark) {
        for (Map.Entry<String, Integer> entry : this.marks.entrySet()) {
            if (Objects.equals(entry.getKey(), course)) {
                entry.setValue(mark);
            }
        }
    }

    // Остальные
    // Получить средний балл студента
    public double avrGrade() {
        double sum = 0;
        for (Integer mark: this.getMarks().values()) {
            sum += mark;
        }
        return sum / this.getMarks().size();
    }
    // Распечатать оценки
    public void printMarks() {
        System.out.println("\nОценки " + this.name + "a:");
        for (Map.Entry<String, Integer> entry : this.marks.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
