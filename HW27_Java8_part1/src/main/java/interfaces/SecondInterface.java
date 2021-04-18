package interfaces;

public interface SecondInterface extends FirstInterface{
    void print();

    void printOff();

    default void defaultMethodPrint(String string) {
        System.out.println("defaultMethodPrint3: " + string);
    }
    static void staticMethodPrint() {
        System.out.println("Static method3");
    }
}
