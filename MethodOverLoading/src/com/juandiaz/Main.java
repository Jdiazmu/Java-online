package com.juandiaz;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Juan", 500);
        System.out.println("new Score is " + newScore);
    }

        public static int calculateScore(String playerName, int score) {
            System.out.println("Player " + playerName + " score " + score + " points");
            return score * 1000;
        }
    }

