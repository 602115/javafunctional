package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("09009877300"));

        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValidPredicaate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicaate.test("0700000000"));
        System.out.println(isPhoneNumberValidPredicaate.test("09009877300"));

        System.out.println(
                "Is Phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicaate.and(containsNumber3).test("09009877300")
        );

        System.out.println(
                "Is Phone number valid and contains number 3 = " +
                        isPhoneNumberValidPredicaate.or(containsNumber3).test("07000000000")
        );
    }

    static boolean isPhoneNumberValid (String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicaate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

    // BiPredicate<T> is also an option
}
