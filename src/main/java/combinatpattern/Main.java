package combinatpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Costumer costumer = new Costumer(
                "Alica",
                "alica@gmail.com",
                "+0254565",
                LocalDate.of(2000, 2, 1));


        //System.out.println(new CostumerValidService().isValid(costumer));

        CostumerRegistrationValidation.isEmailValid()
                .and(CostumerRegistrationValidation.isPhoneNumberValid())
                .and(CostumerRegistrationValidation.isAdultValid())
                .apply(costumer);

    }


}
