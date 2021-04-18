import implInterface.ClassImpl;
import implInterface.ClassImpl2;
import interfaces.FirstInterface;
import interfaces.FourthInterface;
import interfaces.SecondInterface;
import interfaces.ThirdInterface;
import util.OptionalHelper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ClassImpl classImpl = new ClassImpl();
        classImpl.defaultMethodPrint("defaultMethodPrint");
        classImpl.print();
        classImpl.printOff();

        ClassImpl2 classImpl2 = new ClassImpl2();
        classImpl2.defaultMethodPrint("defaultMethodPrint 2");
        classImpl2.print();
        classImpl2.printOff();

        FirstInterface.staticMethodPrint();
        SecondInterface.staticMethodPrint();
        ThirdInterface.staticMethodPrint();
        FourthInterface.staticMethodPrint();
//
//        System.out.println(OptionalHelper.getOptionalMethod("Serhii@mail.com"));
//        System.out.println(OptionalHelper.getOptionalMethod(""));

        OptionalHelper.validEmail("serj12@mail.com");
        OptionalHelper.validEmail("serjmail.com");
        OptionalHelper.validEmail("");

    }
}
