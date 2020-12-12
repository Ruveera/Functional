package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println("09000400");

        System.out.println(isPhoneNumberValidPredicate.test("07700000"));

        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3)
                .test("090000"));

        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3)
                .test("093000"));
    }

    static boolean isPhoneNumberValid (String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
