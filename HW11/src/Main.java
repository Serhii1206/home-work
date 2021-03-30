import entity.Client;
import exception.UserExpectedError;
import exception.WrongFieldException;
import exception.WrongSumException;
import service.TransactionService;
import util.Helper;

import java.util.Scanner;

import static util.Helper.AMOUNT_TO_TRANSFER;

public class Main {
    public static void main(String[] args) {


        Client client = new Client("GA1.1.904", "Pavlenko", "AC5504", 1200.00);
        Client client2 = new Client("GA2.1.309", "Voznenko", "AC5555", 900.00);
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите идентификатор аккаунта клиента 1");
            client.setClientAccountId(scanner.nextLine());
            try {
                Helper.checkSize(client.getClientAccountId());
                System.out.println("Идентификатор Аккаунта клиента 1 принят: \n" + client.getClientAccountId());
                break;
            } catch (WrongFieldException wrongFieldException) {
                System.err.println("Данные введены не корректно, введите значение снова");
            }
        }
        while (!client.equals(client.getClientAccountId()));

        System.out.println("________________________________________");
        do {
            System.out.println("Введите идентификатор аккаунта клиента 2");
            client2.setClientAccountId(scanner.nextLine());
            try {
                Helper.checkSize(client2.getClientAccountId());
                System.out.println("Идентификатор Аккаунта клиента 2 принят: \n" + client.getClientAccountId());
                break;
            } catch (WrongFieldException wrongFieldException) {
                System.err.println("Данные введены не корректно, введите значение снова");
            }
        }
        while (!client2.equals(client2.getClientAccountId()));

        System.out.println("________________________________________");

        do {
            System.out.println("Введите сумму не более 1000");
            client.setSum(scanner.nextDouble());
            try {
                Helper.getSum(client.getSum());
                break;
            } catch (WrongSumException e) {
                System.err.println("Данные введены не корректно, введите значение снова");
            }
        }
        while (client.getSum() > AMOUNT_TO_TRANSFER);

        System.out.println("________________________________________");
        TransactionService.transferOfMoney(client, client2.getClientAccountId());
        System.out.println("Перевод средств был успешный.");

    }
}
