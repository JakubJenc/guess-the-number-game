package com.udemy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class MessageGeneratorImpl implements MessageGenerator {

    // == constants ==
    private static final Logger log = LoggerFactory.getLogger(GameImpl.class);

    // == fields ==
    @Autowired
    private GameImpl game;

    // == init ==
    @PostConstruct
    public void init() {
        log.info("game = {}", game);
    }

    // == public methods ==
    @Override
    public String getMainMessage() {
        return "Number is between " + game.getSmallest() + " and " + game.getLargest() + ". Can you guess it?";
    }

    @Override
    public String getResultMessage() {

        if(game.isGameWon()){
            return "Yay, you guessed it! The number was " + game.getNumber();
        }
        if(game.isGameLost()){
            return "Too bad. The number was " + game.getNumber();
        }
        if(!game.isValidNumberRange()){
            return "Invalid number range";
        }
        if(game.getRemainingGuesses() == game.getGuessCount()){
            return "What is your first guess?";
        }
        else {
            String direction = "Lower";

            if(game.getGuess() < game.getNumber()){
                direction="Higher";
            }
            return direction + "! You have " + game.getRemainingGuesses() + " guesses left";
        }
    }
}
