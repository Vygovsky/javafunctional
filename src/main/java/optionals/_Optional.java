package optionals;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {

        Optional.ofNullable("jone@email").ifPresent(
                email -> System.out.println("Send email " + email));
       /* Optional.ofNullable(null).ifPresentOrElse(
                email -> System.out.println("Send email " + email),
                ()-> System.out.println("Cannot email"));*/
        Object value = Optional.ofNullable(null).orElse("default value");
        Object value2 = Optional.ofNullable("Normal").orElse("default value");
        System.out.println(value);
        System.out.println(value2);
    }
}
