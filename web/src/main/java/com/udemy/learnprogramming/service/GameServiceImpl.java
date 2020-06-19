package com.udemy.learnprogramming.service;

import com.udemy.learnprogramming.Game;
import com.udemy.learnprogramming.MessageGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

    // == fields ==
    private final Game game;
    private final MessageGenerator messageGenerator;

    // == constructors ==
    @Autowired
    public GameServiceImpl(Game game, MessageGenerator messageGenerator) {
        this.game = game;
        this.messageGenerator = messageGenerator;
    }

    // == overridden methods ==
    @Override
    public boolean isGameOver() {
        if (game.isGameLost() || game.isGameWon()) {
            return true;
        }
        return false;
    }

    @Override
    public String getMainMessage() {
        return messageGenerator.getMainMessage();
    }

    @Override
    public String getResultMessage() {
        return messageGenerator.getResultMessage();
    }

    @Override
    public void checkGame() {
        game.setGuess(7);
        game.check();
    }

    @Override
    public void reset() {
        game.reset();
    }
}
