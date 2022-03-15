package com.hevia.domain.models;

import com.hevia.domain.contracts.InterfaceObject;

public class Scissors implements InterfaceObject {

    public String name = "Scissors";

    public Scissors() {  
    }

    public Scissors(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }    

    public String getObject(){
        return "Scissors";
    }
}