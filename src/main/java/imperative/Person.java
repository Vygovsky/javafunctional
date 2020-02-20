package imperative;

public class Person {

    private final String name;
    private final Gender gender;

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Person(String name, Gender gender) {

        this.name = name;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return gender == person.gender;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        return result;
    }
}
