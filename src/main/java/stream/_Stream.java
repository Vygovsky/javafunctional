package stream;

import imperative.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Gender.FEMALE;
import static imperative.Gender.MALE;

public class _Stream {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Jone", MALE),
                new Person("Marina", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alica", FEMALE),
                new Person("Tom", MALE)
        );
        personList.stream()
                .map(person -> person.getGender())
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println();
        personList.stream()
                .map(Person::getName)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println();
        personList.stream()
                .map(Person::getName)
                .mapToInt(String::length)
                .forEach(System.out::println);
    }
}
