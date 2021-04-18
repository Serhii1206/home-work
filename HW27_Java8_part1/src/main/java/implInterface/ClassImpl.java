package implInterface;

import interfaces.FourthInterface;
import interfaces.ThirdInterface;

public class ClassImpl implements ThirdInterface, FourthInterface {
    @Override
    public void print() {
        System.out.println("Print2");
    }

    @Override
    public void printOff() {
        System.out.println("Print off 2");
    }
}
