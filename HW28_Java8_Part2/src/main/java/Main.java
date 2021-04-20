import functionalInterface.ConsumerInterface;
import functionalInterface.FunctionInterface;
import functionalInterface.PredicateInterface;
import functionalInterface.SupplierInterface;

public class Main {
    public static void main(String[] args) {

        PredicateInterface<Double> predicateInterface = doubleAmount -> doubleAmount > 1500;
        System.out.println(predicateInterface.salary(2000.0));
        System.out.println(predicateInterface.salary(500.0));


        ConsumerInterface<String> consumerInterface = string -> {
            char[] charArray = string.toCharArray();
            for (char i : charArray) {
                System.out.print(i);
            }
            System.out.println();
        };
        consumerInterface.stringToCharArray("Consumer interface done ");


        FunctionInterface<Integer, String> function = integer -> {
            String string;
            switch (integer) {
                case 1:
                    string = "one";
                    break;
                case 2:
                    string = "two";
                    break;
                case 3:
                    string = "three";
                    break;
                case 4:
                    string = "four";
                    break;
                case 5:
                    string = "five";
                    break;
                case 6:
                    string = "six";
                    break;
                case 7:
                    string = "seven";
                    break;
                case 8:
                    string = "eight";
                    break;
                case 9:
                    string = "nine";
                    break;
                case 10:
                    string = "ten";
                default:
                    string = "unknown";
            }
            return string;
        };
        System.out.println(function.getNumber(5));
        System.out.println(function.getNumber(11));

        SupplierInterface<Double> supplier = () -> Math.random();
        System.out.println(supplier.get());
        SupplierInterface<Double> supplier2 = () -> Math.sqrt(100);
        System.out.println(supplier2.get());
    }
}
