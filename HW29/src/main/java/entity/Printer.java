package entity;

public class Printer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Printer(String name) {
        this.name = name;
    }



    public void print(String string) {
        System.out.println("Hello word");
    }
    @Override
    public String toString() {
        return "Printer{" +
                "name='" + name + '\'' +
                '}';
    }
}
