import java.util.*;

public class Start {
    public static void main(String[] args) {
        // тестовые данные
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

        // Создание списка студентов и заполнение тестовыми данными
        Random random = new Random();
        int indexName;
        while (!names.isEmpty()) {
            indexName = random.nextInt(names.size());
            Student student = new Student(
                    names.get(indexName),
                    Hogwarts.getGroups().get(random.nextInt(Hogwarts.getGroups().size())),
                    Hogwarts.getCourses(),
                    Hogwarts.getEducationYears().get(random.nextInt(Hogwarts.getEducationYears().size()))
            );
            names.remove(indexName);

            for (String course : student.getCourses()) {
                student.setMark(course, random.nextInt(5) + 1);
            }
            Hogwarts.addStudent(student);
        }

        // проверяю заполненность данных студентов. Одного достаточно
        for (Student student : Hogwarts.getStudents()) {
            student.printMarks();
            break;
        }

        // Проверяю добавление студента
        System.out.println("\nВсего студентов: " + Hogwarts.getStudents().size());
        Student student = new Student(
                "Магослав",
                Hogwarts.getGroups().get(random.nextInt(Hogwarts.getGroups().size())),
                Hogwarts.getCourses(),
                4
                );
        Hogwarts.addStudent(student);
        System.out.println("Добавили " + student.getName() + "a\n" + "Всего студентов: " + Hogwarts.getStudents().size());

        // Проверяю отчисления
        System.out.println("\nВсего студентов: " + Hogwarts.getStudents().size());
        Hogwarts.excludeStupid();
        System.out.println("Удалили глупышей");
        System.out.println("Всего студентов: " + Hogwarts.getStudents().size());

        // Проверяю метод перевода на следующий курс
        Student stud =  Hogwarts.getStudents().get(random.nextInt(Hogwarts.getStudents().size()));
        System.out.println("\nСлучайно выбран: " + stud.getName());
        System.out.println("Его курс: " + stud.getEducationYear());
        System.out.println("Переводим его на следующий курс");
        Hogwarts.transferStudentNextYear(stud);
        System.out.println("Теперь его курс: " + stud.getEducationYear());

        // Выводим всех студентов и их курс
        System.out.println("\nВсе студенты:");
        Hogwarts.printStudents();
    }
}
