package optionals;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
        Object value = Optional.ofNullable(null).orElse("default value");
        Object value2 = Optional.ofNullable("Normal").orElse("default value");
        System.out.println(value);
        System.out.println(value2);
    }
}
