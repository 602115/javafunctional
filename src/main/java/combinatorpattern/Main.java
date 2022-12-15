package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Truls",
                "trulshaukeland@gmail.com",
                "+4791165321",
                LocalDate.of(1999,06,12)
        );
//        System.out.println(new CustomerValidatorService().isValid(customer));

        // if calid we can store customer in database(db)

        //Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);
        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
