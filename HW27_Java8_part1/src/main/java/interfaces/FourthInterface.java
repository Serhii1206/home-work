package interfaces;

public interface FourthInterface extends ThirdInterface {
    void print();

    void printOff();

    default void defaultMethodPrint(String string) {
        System.out.println("defaultMethodPrint2: " + string);
    }
    static void staticMethodPrint() {
        System.out.println("Static method2");
    }
}
