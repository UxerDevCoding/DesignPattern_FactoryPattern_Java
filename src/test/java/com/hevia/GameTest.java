package com.hevia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.hevia.app.Game;
import com.hevia.domain.models.ObjectFactory;

import org.junit.jupiter.api.Test;

public class GameTest {

    @Test

    public void rockWinScissors(){
        Game game = new Game();
        ObjectFactory factory = new ObjectFactory();
        String result = game.playGame(factory.createObject("Rock").getObject(), factory.createObject("Scissors").getObject());

        assertEquals("Rock win", result);
    }

    @Test

    public void paperWinRock(){
        Game game = new Game();
        ObjectFactory factory = new ObjectFactory();
        String result = game.playGame(factory.createObject("Paper").getObject(), factory.createObject("Rock").getObject());

        assertEquals("Paper win", result);
    }

    @Test

    public void paperWinRockReverse(){
        Game game = new Game();
        ObjectFactory factory = new ObjectFactory();
        String result = game.playGame(factory.createObject("Rock").getObject(), factory.createObject("Paper").getObject());

        assertEquals("Paper win", result);
    }

    @Test

    public void scissorsWinPaper(){
        Game game = new Game();
        ObjectFactory factory = new ObjectFactory();
        String result = game.playGame(factory.createObject("Scissors").getObject(), factory.createObject("Paper").getObject());

        assertEquals("Scissors win", result);
    }
    
    @Test

    public void scissorsWinPaperReverse(){
        Game game = new Game();
        ObjectFactory factory = new ObjectFactory();
        String result = game.playGame(factory.createObject("Paper").getObject(), factory.createObject("Scissors").getObject());

        assertEquals("Scissors win", result);
    }
    
    
}

