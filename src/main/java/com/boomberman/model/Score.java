package com.boomberman.model;

public class Score {
    private int player1Score;
    private int player2Score;

    public Score() {
        player1Score = 0;
        player2Score = 0;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public void setPlayer1Score(int score) {
        player1Score = score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public void setPlayer2Score(int score) {
        player2Score = score;
    }
}
