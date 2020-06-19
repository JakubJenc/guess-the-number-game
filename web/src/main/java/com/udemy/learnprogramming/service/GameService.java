package com.udemy.learnprogramming.service;

public interface GameService {

    boolean isGameOver();

    String getMainMessage();

    String getResultMessage();

    void checkGame();

    void reset();
}
