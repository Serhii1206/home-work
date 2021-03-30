import java.io.IOException;

public class Mainn {



   public static void main(String[] args) throws IOException {


UserService userService = new UserService();
AdminService adminService = new AdminService();
        Member user = new User();
        Member admin = new Admin();
        user.setName("Den");
        user.setSurName("Koval");
        user.setAge(27);
        user.setMail("Sirko120690@gmail.com");
        user.setMail("3535444334354");
        user.setPass("12321");
        user.setRole("User");
        System.out.println("Check User: "  + userService.check(user));
        System.out.print("Write user data: ");
        adminService.fillIn(user);
        userService.fillIn(user);
        System.out.println(user);
        System.out.println("Admin Service check user: "  +adminService.check(user));
        System.out.println("_________________________________________________________________________________________");

        admin.setName("Kate");
           admin.setName("Liza");
        admin.setSurName("Pavlenko");
        admin.setAge(41);
        admin.setMail("qwerty@kuka");
        admin.setPass("456852");
        admin.setRole("Admin");
        System.out.println("Check User: " + userService.check(admin));
        adminService.fillIn(admin);
        System.out.println("Admin Service check user: "  +adminService.check(admin));
        System.out.println(admin);


    }
}
