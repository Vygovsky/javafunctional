package imperative;

import java.util.List;

import static imperative.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Jone", MALE),
                new Person("Marina", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alica", FEMALE),
                new Person("Tom", MALE));
    }

}
