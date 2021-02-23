package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClientFieldsValidation {
    private static final String PHONE_NUMBER_PATTERN = "^\\+([3][8][0])\\d{9}";


    public static boolean checkPhoneNumber(String phoneNumber) {
        boolean result = phoneNumber.matches(PHONE_NUMBER_PATTERN);
        if (result == true) {
            System.out.println(phoneNumber.concat(" - ").concat(" Phone Number is valid"));
        } else {
            System.out.println(phoneNumber.concat(" - ").concat(" This phone number - invalid"));
        }
        return result;
    }

    public static boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher input = pattern.matcher(email);
        if (input.matches() == true) {
            System.out.println(email.concat(" - ").concat("Email is valid"));
        } else {
            System.out.println(email.concat(" - ").concat(" Invalid email"));
        }
        return input.matches();
    }

    public static String checkData(String date){
          Pattern pattern = Pattern.compile("^[0-3]?[0-9].[0-3]?[0-9].(?:[0-9]{2})?[0-9]{2}$");
        Matcher input = pattern.matcher(date);
        boolean bool = input.matches();
        String result;
        if (bool) {
            result = date.concat(" - is valid");
        }else {
            result = date.concat(" - is invalid");
        }
        return result;
    }
}
