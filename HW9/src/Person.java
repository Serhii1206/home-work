//public class Person {
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", balanse=" + balanse +
//                '}';
//    }
//
//    public Person(String name, double balanse) {
//        this.name = name;
//        this.balanse = balanse;
//    }
//
//    private String name;
//    private double balanse;
//
//    public double getBalanse() {
//        return balanse;
//    }
//
//    public void withdraw(double amount) {
//        if (this.balanse < amount){
//
//                throw new NotEnoyghMoneyException("Недостаточно средств!");
//        }
//        else {
//            this.balanse -=amount;
//        }
//    }
//}
