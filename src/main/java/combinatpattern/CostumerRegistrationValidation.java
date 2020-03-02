package combinatpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static combinatpattern.CostumerRegistrationValidation.*;
import static combinatpattern.CostumerRegistrationValidation.ValidationResult.*;

public interface CostumerRegistrationValidation extends Function<Costumer, ValidationResult> {

    static CostumerRegistrationValidation isEmailValid() {
        return costumer -> costumer.getEmail().contains("@") ?
                SUCCESS : EMAIL_NOT_VALID;
    }

    static CostumerRegistrationValidation isPhoneNumberValid() {
        return costumer -> costumer.getPhone().startsWith("+0") ?
                SUCCESS : NUMBER_PHONE_NOT_VALID;
    }

    static CostumerRegistrationValidation isAdultValid() {
        return costumer -> Period.between(costumer.getDob(), LocalDate.now()).getYears() > 16 ?
                SUCCESS : ADULT_NOT_VALID;
    }

    default CostumerRegistrationValidation and(CostumerRegistrationValidation other) {
        return costumer -> {
            ValidationResult result = this.apply(costumer);
            return result.equals(SUCCESS) ? other.apply(costumer) : result;
        };
    }


    enum ValidationResult {
        SUCCESS,
        EMAIL_NOT_VALID,
        NUMBER_PHONE_NOT_VALID,
        ADULT_NOT_VALID,

    }
}
