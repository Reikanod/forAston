import java.util.*;

public class Start {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // тестовые данные
        ArrayList<String> courses = new ArrayList<>(List.of(
                "Зельеварение",
                "Магловедение",
                "Мать и Матиха",
                "Живноведение",
                "Растенелогия",
                "Гусский язык",
                "Землелогия",
                "Здравоведение"
        ));


        ArrayList<String> names = new ArrayList<>(List.of(
                "Умнолоб",
                "Мордоклюв",
                "Длинноух",
                "Вечноспин",
                "Звездосчет",
                "Златозуб",
                "Человолос",
                "Зряспин",
                "Доброум",
                "Всезнав",
                "Ядоплюв",
                "Штанголюб",
                "Котоглад"
        ));
        ArrayList<String> groups = new ArrayList<>(List.of(
                "Пыхтуны",
                "Спуны",
                "Добруны",
                "Силуны"
        ));

        // создание списка студентов и заполнение тестовыми данными
        Random random = new Random();
        int indexName;
        while (!names.isEmpty()) {
            indexName = random.nextInt(names.size());
            Student student = new Student(names.get(indexName), groups.get(random.nextInt(groups.size())), courses);
            names.remove(indexName);
            for (String course : courses) {
                student.setMark(course, random.nextInt(5) + 1);
            }
            students.add(student);
        }

        // проверяю вывод оценок и заполненность данных всех студентов
        for (Student student : students) {
            student.getMarks();
        }


    }
}
