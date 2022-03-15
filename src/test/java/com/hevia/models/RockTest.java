package com.hevia.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.hevia.domain.models.Rock;
import org.junit.jupiter.api.Test;


public class RockTest {

    @Test

    public void isRock() {

        Rock rock = new Rock();
        String result = rock.getName();
        assertEquals("Rock", result);
    }
}