package com.hevia.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.hevia.domain.contracts.InterfaceObject;
import com.hevia.domain.models.ObjectFactory;
import com.hevia.domain.models.Paper;
import com.hevia.domain.models.Rock;
import com.hevia.domain.models.Scissors;

import org.junit.jupiter.api.Test;

public class ObjectFactoryTest {
    

    @Test

    public void factoryCreateRock(){
    
        ObjectFactory factory = new ObjectFactory();
        InterfaceObject object = factory.createObject("Rock");

        assertEquals(true, object instanceof Rock );
    }

    @Test

    public void factoryCreatePaper(){
    
        ObjectFactory factory = new ObjectFactory();
        InterfaceObject object = factory.createObject("Paper");

        assertEquals(true, object instanceof Paper );
    }
    
    @Test
    
    public void factoryCreateScissors(){
    
        ObjectFactory factory = new ObjectFactory();
        InterfaceObject object = factory.createObject("Scissors");

        assertEquals(true, object instanceof Scissors );
    }
    



    
}
