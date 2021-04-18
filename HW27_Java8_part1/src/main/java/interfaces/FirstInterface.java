package interfaces;

public interface FirstInterface {

    void print();

    void printOff();

    default void defaultMethodPrint(String string) {
        System.out.println("defaultMethodPrint1: " + string);
    }
    static void staticMethodPrint() {
        System.out.println("Static method1");
    }
}
