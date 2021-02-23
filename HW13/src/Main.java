import exceptions.StringFormatException;
import utils.ClientFieldsValidation;
import utils.StringHelper;

public class Main {
    public static void main(String[] args) throws StringFormatException {

        char[] myArray = {' ', 'i', 'L', 'o', 'V', 'e', 'j', 'A', 'v', 'A', ' '};
        String myString = null;
        System.out.println(StringHelper.fromArrayToString(myString, myArray));

        String myPhoneNumber = "+380931168671";
        ClientFieldsValidation.checkPhoneNumber(myPhoneNumber);

        String email = "Sobaka.Barabaka@gmail.com";
        ClientFieldsValidation.checkEmail(email);

        String date = "06.12.1990";
        System.out.println(ClientFieldsValidation.checkData(date));
    }
}
