import java.util.*;

public class Student {
    private String name;
    private String group;
    private ArrayList<String> courses;
    private HashMap<String, Integer> marks;


    public Student(String name, String group, ArrayList<String> courses) {
        this.name = name;
        this.group = group;
        this.courses = courses;
        this.marks = new HashMap<>();
        for (String course : courses) {
            this.marks.put(course, 0);
        }
    }

    public HashMap<String, Integer> getMarks() {
        System.out.println("\nОценки " + this.name + "a:");
        for (Map.Entry<String, Integer> entry : this.marks.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        return this.marks;
    }
    public void setMark(String course, int mark) {
        for (Map.Entry<String, Integer> entry : this.marks.entrySet()) {
            if (Objects.equals(entry.getKey(), course)) {
                entry.setValue(mark);
            }
        }
    }
}
