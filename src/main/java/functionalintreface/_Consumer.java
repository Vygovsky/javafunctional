package functionalintreface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        // Java normal
        getConsumer(new Costumer("Roman", "8989"));

        // Java function
        costumerConsumer.accept(new Costumer("Roman", "8989"));
    }

        // Java function
    static Consumer<Costumer> costumerConsumer = costumer ->
            System.out.println("Hello " + costumer.name + " thanks regist you number " + costumer.numberPhone);

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
