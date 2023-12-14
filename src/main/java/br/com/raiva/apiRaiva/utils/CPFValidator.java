package br.com.raiva.apiRaiva.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CPFValidator {

    public static boolean isValidCPF(String cpf) {
        String cleanedCPF = cpf.replaceAll("[^0-9]", "");

        if (cleanedCPF.length() != 11) {
            return false;
        }

        if (cleanedCPF.matches("(\\d)\\1{10}")) {
            return false;
        }

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (cleanedCPF.charAt(i) - '0') * (10 - i);
        }
        int firstDigit = 11 - (sum % 11);
        if (firstDigit > 9) {
            firstDigit = 0;
        }

        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (cleanedCPF.charAt(i) - '0') * (11 - i);
        }
        int secondDigit = 11 - (sum % 11);
        if (secondDigit > 9) {
            secondDigit = 0;
        }

        return (cleanedCPF.charAt(9) - '0' == firstDigit) && (cleanedCPF.charAt(10) - '0' == secondDigit);
    }
}
