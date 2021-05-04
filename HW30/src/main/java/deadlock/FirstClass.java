package deadlock;

public class FirstClass {
    private SecondClass secondClass;

    public SecondClass getSecondClass() {

        return secondClass;
    }

    public void setSecondClass(SecondClass secondClass) {
        this.secondClass = secondClass;
    }

    public synchronized String getString() {
        return "String from First Class";
    }
    public synchronized String getStringFromSecondClass() {
        return secondClass.getString();
    }
}
