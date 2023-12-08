package com.stkwan98.day1;

import java.io.*;
import java.util.Map;

public class Day1 {
    public void readFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int part1Total = 0;
            int part2Total = 0;
            String line;
            while((line = reader.readLine()) != null) {
                part1Total += getLineValue(line);
                part2Total += getLineValueWithLetters(line);
            }
            System.out.println("Day 1 Part 1 Total: " + part1Total); // 55208
            System.out.println("Day 1 Part 2 Total: " + part2Total); // 54578
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private int getLineValue(String line) {
        char[] digits = line.replaceAll("[^\\d+]", "").toCharArray();
        int firstDigit = digits[0] - '0';
        int lastDigit = digits[digits.length - 1] - '0';

        return firstDigit * 10 + lastDigit;
    }

    private int getLineValueWithLetters(String line) {
        Map<String, String> numbersMap = Map.of(
                "one", "one1one",
                "two", "two2two",
                "three", "three3three",
                "four", "four4four",
                "five", "five5five",
                "six", "six6six",
                "seven", "seven7seven",
                "eight", "eight8eight",
                "nine", "nine9nine"
        );

        String modifiedLine = line;
        for (Map.Entry<String, String> entry : numbersMap.entrySet()) {
            modifiedLine = modifiedLine.replace(entry.getKey(), entry.getValue());
        }

        return getLineValue(modifiedLine);
    }
}
