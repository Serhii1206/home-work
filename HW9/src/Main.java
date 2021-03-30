import java.util.*;

public class Main {
    public static void main(String[] args) {

        InitializationData initializationData = new InitializationData();
        Information information = new Information();

        initializationData.create(information);
        System.out.println(information.getAliases().size() + "" + information.getMails().size() + "" + information.getMailAliasMap().size());
        ArrayList<Number> list = new ArrayList<>();
        System.out.println("Fill with thirty unique values: " + initializationData.create(information));
        list.add(12);
        list.add(27);
        list.add(1);
        list.add(2);
        list.add(27);
        System.out.println(fill(list, information));
        for (int i = 0; i < information.getAliases().size(); i++) {
            System.out.println(information.getAliases().get(i));
        }
        for (Iterator iterator = information.getMails().iterator();
             iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
        System.out.println(information.getMailAliasMap());
        information.add("Bob", "Bob@mail.com");
        System.out.println(information.getMailAliasMap());
        System.out.println(information.getMails());
    }

    private static Information fill(List<? extends Number> list, Information information) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (!information.getMailAliasMap().containsKey(list.get(i).toString() + "Den@mail.com")) {
                information.getMailAliasMap().put(list.get(i).toString() + "Den@mail.com", list.get(i).toString());
            }
            information.getAliases().add(list.get(i).toString() + "Den");
            information.getMails().add(list.get(i).toString() + "Den@mail.com");
        }
        return information;
    }
}