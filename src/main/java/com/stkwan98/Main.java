package com.stkwan98;

import com.stkwan98.day1.Day1;

import java.io.IOException;

public class Main {
    public static final String DAY_1_INPUT_PATH = "src/main/resources/input.txt";
    public static void main(String[] args) {
        executeDay1();
    }

    private static void executeDay1() {
        Day1 day1 = new Day1();
        day1.readFile(DAY_1_INPUT_PATH);
    }
}