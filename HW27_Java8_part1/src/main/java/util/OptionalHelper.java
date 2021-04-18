package util;

import java.io.IOException;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OptionalHelper {

   public static final String EMAIL_VALIDATOR =  "\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*.\\w{2,4}";

public static Optional validEmail(String email) {

    if (email == null || email.isEmpty() || !Pattern.matches(EMAIL_VALIDATOR,email)) {
        System.out.println(email + " Invalid email");
        return Optional.empty();
    }
    System.out.println(email + " Email is valid ");
    return Optional.of(email);
}
}
