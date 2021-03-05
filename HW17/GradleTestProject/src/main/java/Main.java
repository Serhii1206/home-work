import emtity.User;
import org.apache.commons.lang3.StringUtils;
import javax.jws.soap.SOAPBinding;
public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Ivan");
        user.setUserId("id2545780");
        user.setAge(25);
        System.out.println(user.getName());
        System.out.println(user);

        System.out.println("-----------------------------------------");
        String string = "welcome to www.hillel-school.com";
        int charNum = StringUtils.countMatches(string, 'w');
        int charNum2 = StringUtils.countMatches(string, 'l');
        int stringNum = StringUtils.countMatches(string, "com");
        System.out.println("w - " + charNum);
        System.out.println("l - " + charNum2);
        System.out.println("com - " + stringNum);
    }
}
