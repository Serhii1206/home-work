import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AdminService implements Service{
    @Override
    public boolean check(Member member) throws IOException {
        FileReader fileReader = new FileReader("F");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()){
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
    public void fillIn(Member member) throws IOException {
        FileWriter fileWriter = new FileWriter("f2.txt",true);
        fileWriter.write(String.valueOf(member));
        fileWriter.close();



    }
}
