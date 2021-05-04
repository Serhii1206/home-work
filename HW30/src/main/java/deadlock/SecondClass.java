package deadlock;


public class SecondClass {
    private FirstClass firstClass;
    public FirstClass getFirstClass() {
        return firstClass;
    }

    public void setFirstClass(FirstClass firstClass) {
        this.firstClass = firstClass;
    }
    public synchronized String getString() {
        return "String from Second Class";
    }
    public synchronized String getStringFromFirstClass() {
        return firstClass.getString();
    }

}
