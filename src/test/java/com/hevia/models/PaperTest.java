package com.hevia.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.hevia.domain.models.Paper;
import org.junit.jupiter.api.Test;

public class PaperTest {

    @Test

    public void isScissors() {

        Paper paper = new Paper();
        String result = paper.getName();
        assertEquals("Paper", result);
    }
}