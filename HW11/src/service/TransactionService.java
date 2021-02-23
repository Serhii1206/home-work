package service;

import entity.Client;
import exception.UserExpectedError;
import util.Helper;

public class TransactionService {

    public static void transferOfMoney(Client client, String clientAccountId) throws UserExpectedError {

        Helper.sendTransfer(client.getClientAccountId(), clientAccountId);
    }
}
