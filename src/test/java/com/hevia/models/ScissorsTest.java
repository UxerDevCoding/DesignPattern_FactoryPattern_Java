package com.hevia.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.hevia.domain.models.Scissors;
import org.junit.jupiter.api.Test;


public class ScissorsTest {

    @Test

    public void isScissors() {

        Scissors scissors = new Scissors();
        String result = scissors.getName();
        assertEquals("Scissors", result);
    }
    
}