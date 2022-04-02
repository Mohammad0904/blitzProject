package com.example.blitz;

import java.util.Random;

public class Compare {
    int answer; int result;

    public static double parseDouble(String s) {
        double d = Double.parseDouble(s);
        return d;
    }

    public static int convertToInt(double d) {
        int guess = (int) d;
        return guess;
    }

    public static int generateEasyRandomNumber() {
        Random easyRandom = new Random();
        int answer = easyRandom.nextInt(10) + 1;
        System.out.println("THE RANDOM NUMBER WAS ----- " + answer);
        return answer;
    }

    public static int generateMediumRandomNumber() {
        Random mediumRandom = new Random();
        int answer = mediumRandom.nextInt(50) + 1;
        System.out.println("THE RANDOM NUMBER WAS ----- " + answer);
        return answer;
    }

    public static int generateHardRandomNumber() {
        Random hardRandom = new Random();
        int answer = hardRandom.nextInt(100) + 1;
        System.out.println("THE RANDOM NUMBER WAS ----- " + answer);
        return answer;
    }

    public static boolean comparison(int answer, int result) {
        boolean guessed;
        if (answer == result) {
            guessed = true;
        }
        else {
            guessed = false;
        }
        return guessed;
    }

    public static String format(double given) {
        String str = String.format("%.2f", given);
        return str;
    }
}
