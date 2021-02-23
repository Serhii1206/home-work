package util;

import exception.UserExpectedError;
import exception.WrongFieldException;
import exception.WrongSumException;

public class Helper {
    final static int SIZE_CLIENT_ID = 10;
    final public static double AMOUNT_TO_TRANSFER = 1000;

    public static void checkSize(String clientAccountId) throws WrongFieldException {
        if (clientAccountId.length() != SIZE_CLIENT_ID) {
            throw new WrongFieldException();
        }
    }

    public static void getSum(double sum) throws WrongSumException {
        if (sum > AMOUNT_TO_TRANSFER) {
            throw new WrongSumException();
        }
    }

    public static void sendTransfer(String clientIdSender, String clientIdRecipient) throws UserExpectedError {
        if (!clientIdSender.equals(clientIdRecipient)) {
            throw new UserExpectedError();
        }
    }
}
