package com.boast.random;

import java.util.Random;

public class RandomString {

    private static final String[] firstNames = {"Andrea", "Britney", "Christina", "Deborah", "Elaine", "Faith", "Gabrielle", "Hannah", "Ida", "Julia", "Kristen", "Leslie", "Wendy"};
    private static final String[] secondNames = {"SMITH", "JOHNSON", "KENNEDY", "JONES", "BROWN", "DAVIS", "MILLER", "Hannah", "KING", "MOORE", "TAYLOR", "KELLY", "KELLEY"};
    private static final String[] address = {"Pr. Peremohy", "Kosmonavta Komarova ave.", "Hrushevsky st.", "L. Tolstogo str.", "Volodymyrska St.", "Berlynskoho Street"};

    public static String getFirstName() {
        return firstNames[new Random().nextInt(firstNames.length)];
    }

    public static String getSecondName() {
        return secondNames[new Random().nextInt(secondNames.length)];
    }

    public static String getThirdName() {
        return secondNames[new Random().nextInt(secondNames.length)];
    }

    public static String getAddress() {
        return address[new Random().nextInt(address.length)] + " " + (new Random().nextInt(90) + 1);
    }
}