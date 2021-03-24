package entity;

import lombok.Data;

@Data
public class Accounts {
    private int id;
    private int client_Id;
    private String number;
    private double value;
}
