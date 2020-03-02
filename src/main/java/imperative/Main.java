package imperative;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList =Arrays.asList(
                new Person("Jone", MALE),
                new Person("Marina", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alica", FEMALE),
                new Person("Tom", MALE)
        );


        System.out.println("// Imperative approach");
        List<Person> gender = new ArrayList<>();
        for (Person person : personList) {
            if (FEMALE.equals(person.getGender())) {
                gender.add(person);
            }
        }

        for (Person listFemale : gender) {
            System.out.println(listFemale);
        }

        //Declarative approach

        System.out.println("// Declarative approach");

        // Predicate boolean operation

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.getGender());
        personList.stream()
                .filter(personPredicate)
                .forEach(System.out::println);



        List<Person> female2 = personList.stream()
                .filter(person -> FEMALE.equals(person.getGender()))
                .collect(Collectors.toList());
        female2.forEach(System.out::println);

    }
}
