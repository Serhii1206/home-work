import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserService implements Service {


    @Override
    public boolean check(Member member) throws IOException {
        FileReader fileReader = new FileReader("F");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equals(member.getMail())){
                System.out.println(line);
                return true;

            }
            fileReader.close();
        }
        return false;
    }
    @Override
    public void fillIn(Member member) {
        System.out.println("This method is not allowed in the given service.");
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
