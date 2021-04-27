import entity.Printer;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //1
        Stream.empty()
                .sorted()
                .distinct()
                .forEach(System.out::println);

        //2
        List<Integer> list = List.of(1, 1, 4, 3, 4, 2, 5, 9);
        Stream stream = list.stream();
        stream
                .distinct()
                .sorted()
                .forEach(System.out::println);

        //3
        Stream<String> stringStream = Stream.of("Hello world");
        System.out.println(stringStream.collect(Collectors.toList()));

        //4
        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(1, "Monday");
        integerStringMap.put(2, "Tuesday");
        integerStringMap.put(3, "Wednesday");
        integerStringMap.put(4, "Thursday");
        integerStringMap.put(5, "Friday");
        integerStringMap.put(6, "Saturday");
        integerStringMap.put(7, "Sunday");
        Stream<Map.Entry<Integer, String>> entryStream = integerStringMap.entrySet().stream();
        entryStream.collect(Collectors.toList()).forEach(System.out::println);

        //5
        List<String> list1 = List.of("10", "3", "8", "6", "10", "2", "4", "5", "10", "9");
        list1.stream()
                .skip(1)
                .limit(8)
                .map(Integer::parseInt)
                .filter(x -> x % 2 == 0)
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //6
        Stream<Integer> integerStream = Stream.of(55, 74, 55, 52, 55, 55, 78, 102, 0);
        Optional<Integer> optionalInteger = integerStream
                .parallel()
                .sorted()
                .filter(x -> x > 50)
                .findFirst();
        System.out.println(optionalInteger);

        //7
        Printer printer = new Printer("Epson");
        Stream.of("Canon", "HP")
                .map(Printer::new)
                .map(Printer::getName)
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(ArrayList::new))
                .forEach(printer::print);
        System.out.println(printer.toString());
    }
}
