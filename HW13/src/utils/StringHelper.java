package utils;

import exceptions.StringFormatException;

public class StringHelper {

    public static String fromArrayToString(String myString, char[] array) throws StringFormatException {
        String tempString;
        if (array == null && array.length == 0)
            throw new NullPointerException("Array is null");

        myString = String.valueOf(array);

        if (myString.trim().isEmpty()) {
            throw new StringFormatException("String is null");
        } else {
            myString = myString.toUpperCase().trim();
            tempString = myString.toLowerCase().trim();
        }
        myString = myString.concat(" ").concat(tempString);

        int temp = myString.length() / 2;
        if (myString.length() % 2 == 0) {
            myString = myString.substring(0, temp - 1) + myString.substring(temp + 1);
        }
        else {

            myString = myString.substring(0, temp) + myString.substring(temp + 1);
        }
        return myString;
    }
}
