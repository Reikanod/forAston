public class Person {
    private String lastName;
    private String phone;

    public Person(String lastName, String phone) {
        this.lastName = lastName;
        this.phone = phone;
    }

    // Геттеры
    public String getLastName() {
        return lastName;
    }
    public String getPhone() {
        return phone;
    }
}
