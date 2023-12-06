package com.stkwan98.day1;

import java.io.*;

public class Day1 {
    public void readFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int total = 0;
            String line;
            while((line = reader.readLine()) != null) {
                total += getLineValue(line);
            }
            System.out.println(total);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private int getLineValue(String line) {
        char[] digits = line.replaceAll("[^\\d+]", "").toCharArray();
        int firstDigit = Character.getNumericValue(digits[0]);
        int lastDigit = Character.getNumericValue(digits[digits.length - 1]);

        return Integer.parseInt(String.valueOf(firstDigit) + String.valueOf(lastDigit));
    }
}
