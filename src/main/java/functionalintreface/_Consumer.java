package functionalintreface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        // Java normal
        Costumer roman = new Costumer("Roman", "8989");
        getConsumer(roman);

        // Java function
        costumerConsumer.accept(roman);
        costumerConsumerV2.accept(roman, false);

    }

    // Java function
    private static Consumer<Costumer> costumerConsumer = costumer ->
            System.out.println("Hello " + costumer.name + " thanks regist you number " + costumer.numberPhone);

    private static BiConsumer<Costumer, Boolean> costumerConsumerV2 = (costumer, showPassword) ->
            System.out.println("Hello " + costumer.name + " thanks regist you number " +
                    (showPassword ? costumer.numberPhone : "********"));

    // Java normal
    public static void getConsumer(Costumer consumer) {
        System.out.println("Hello " + consumer.name + " thanks regist you number " + consumer.numberPhone);
    }

    static class Costumer {
        private final String name;
        private final String numberPhone;

        public Costumer(String name, String numberPhone) {
            this.name = name;
            this.numberPhone = numberPhone;
        }
    }
}
