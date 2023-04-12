package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        try {
            Person person = new Person("Jan", null, 25, "1234567890");
            System.out.println(person);
        } catch (IncorrectAgeException | NameUndefinedException e) {
            System.out.println(e.getMessage());
        }

        try {
            Person person1 = new Person("Jan", "Kowalski", 25, "1234567890");
            System.out.println(person1);
            person1.setAge(-10);
            System.out.println(person1);
        } catch (IncorrectAgeException | NameUndefinedException e) {
            System.out.println(e.getMessage());
        }
    }
}

