package interfaces;

public interface ThirdInterface   {
    void print();

    void printOff();

    default void defaultMethodPrint(String string) {
        System.out.println("defaultMethodPrint4: " + string);
    }
    static void staticMethodPrint() {
        System.out.println("Static method4");
    }
}
