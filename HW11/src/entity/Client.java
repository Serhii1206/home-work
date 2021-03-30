package entity;

public class Client {
    private String clientId;
    private String surname;
    private String clientAccountId;
    private double sum;

    public Client(String clientId, String surname, String clientAccountId, double sum) {
        this.clientId = clientId;
        this.surname = surname;
        this.clientAccountId = clientAccountId;
        this.sum = sum;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getClientAccountId() {
        return clientAccountId;
    }

    public void setClientAccountId(String clientAccountId) {
        this.clientAccountId = clientAccountId;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId='" + clientId + '\'' +
                ", surname='" + surname + '\'' +
                ", clientAccountId='" + clientAccountId + '\'' +
                ", sum=" + sum +
                '}';
    }
}
