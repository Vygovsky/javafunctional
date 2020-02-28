package functionalintreface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
      /*  System.out.println(getPhoneValid("03855"));
        System.out.println(getPhoneValid("04800"));
        System.out.println(numberPhone.test("03855"));
        System.out.println(numberPhone.test("03755"));*/

        System.out.println("Is phone contain number 7 \n"+numberPhone.and(contains7).test("03835"));
        System.out.println("Is phone contain number 7 \n"+numberPhone.or(contains7).test("07857"));

   //     System.out.println(contains7.test("08685"));

    }

    private static boolean getPhoneValid(String phoneNumber) {
        return phoneNumber.startsWith("038") && phoneNumber.length() == 5;
    }

    //can accept 1 argument
    private static Predicate<String> numberPhone = number -> number.startsWith("038") && number.length() == 5;

    private static Predicate<String> contains7 = number -> number.contains("7");
}
