import java.util.Set;

import static org.apache.commons.lang3.ArrayUtils.*;

public class Main {
    public static void main(String[] args) {
        User user = new User("Den", "id28500", "Den@mail.com",18);
        user.setName("Ivan");
        System.out.println(user.getAge());
        System.out.println(user);


        String[] phrase = {"I"};
        phrase = add(phrase, "love");
        phrase = add(phrase, "Java");
        for (String word : phrase) {
            System.out.println(word);
        }
        System.out.println();
    }
}
