package com.boast;

import java.util.Random;

public class Buyer {
    private String firstName;
    private String secondName;
    private String thirdName;
    private String address;
    private Long creditCardNumber;
    private Long bankAccountNumber;

    public Buyer() {
        firstName = RandomString.getFirstName();
        secondName = RandomString.getSecondName();
        thirdName = RandomString.getThirdName();
        address = RandomString.getAddress();
        creditCardNumber = Math.abs(new Random().nextLong()) % 1000;//9999_9999_9999_9999L;
        bankAccountNumber = Math.abs(new Random().nextLong()) % 999999999999999999L;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public String getAddress() {
        return address;
    }

    public Long getCreditCardNumber() {
        return creditCardNumber;
    }

    public Long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public String toString() {
        String result = firstName + " " + secondName + " " + thirdName + " " + address;
        result += "\nCredit Card Number: " + creditCardNumber + " Bank Account Number: " + bankAccountNumber;
        return result;
    }
}
