package com.company;

public class Main {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Andreas", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("John", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Mary", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("George", highScorePosition);
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Alex", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
