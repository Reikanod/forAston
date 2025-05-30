import java.util.HashMap;
import java.util.Map;

public class TeleBook {
    private static HashMap<Integer, Person> book = new HashMap<>();

    public static void addPerson(Person person) {
        for (int i = 1; i < book.size() + 2; i++) {
            if (!book.containsKey(i)) {
                book.put(i, person);
                break;
            }
        }
    }

    // Геттер
    public static HashMap<Integer, Person> getBook() {
        return book;
    }

    // Получить всех людей с такой фамилией
    public static HashMap<Integer, Person> getPersons(String last_name) {
        HashMap<Integer, Person> persons = new HashMap<>();
        for (Map.Entry<Integer, Person> entry : book.entrySet()) {
            if (entry.getValue().getLastName().equals(last_name)) {
                persons.put(entry.getKey(), entry.getValue());
            }
        }
        return persons;
    }
    // Печатаем полученные имена
    public static void printPeople(HashMap<Integer, Person> persons) {
        for (Map.Entry<Integer, Person> entry : persons.entrySet()) {
            System.out.println("ID: " + entry.getKey() +
                    " Фамилия: " + entry.getValue().getLastName() +
                    " Телефон: " + entry.getValue().getPhone());
        }
    }
}
