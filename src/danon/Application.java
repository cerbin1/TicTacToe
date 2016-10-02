package danon;

public class Application {
    public static void main(String[] args) {
        // introduce(new Bartek());
        introduce(new Daniel());
        //  introduce(new Popek());
        //  introduce(new Eminem());
    }

    static void introduce(Person person) {
        System.out.println(person.getGreeting());
        System.out.println(String.format("Mam %d lat", person.getAge()));
    }
}