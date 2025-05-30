import java.util.*;

public class Start {
    public static void main(String[] args) {
        // Заполнение тестовых данных
        ArrayList<String> last_names= new ArrayList<>(List.of(
                "Игогов",
                "Сидров",
                "Сидров",
                "Пивов",
                "Китов"
        ));
        ArrayList<String> phones= new ArrayList<>(List.of(
                "+7789456123",
                "+8789456123",
                "+9789456123",
                "+6789456123"
        ));

        Random rand = new Random();
        for (String name : last_names) {
            Person person = new Person(name, phones.get(rand.nextInt(phones.size())));
            TeleBook.addPerson(person);
        }

        // Получаем всех людей в справочнике
        System.out.println("Вся книга");
        TeleBook.printPeople(TeleBook.getBook());
        // Получаем человека с конкретной фамилией

        String lastName = "Сидров";
        System.out.println("\nЛюди с фамилией " + lastName);
        TeleBook.printPeople(TeleBook.getPersons(lastName));
    }
}
