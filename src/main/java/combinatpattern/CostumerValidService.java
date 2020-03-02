package combinatpattern;

import java.time.LocalDate;
import java.time.Period;

public class CostumerValidService {

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+0");
    }

    private boolean isAdultValid(LocalDate date) {
        return Period.between(date, LocalDate.now()).getYears() > 16;
    }

    public boolean isValid(Costumer costumer) {
        return isEmailValid(costumer.getEmail())
                && isPhoneNumberValid(costumer.getPhone())
                && isAdultValid(costumer.getDob());
    }
}
