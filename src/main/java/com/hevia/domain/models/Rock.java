package com.hevia.domain.models;

import com.hevia.domain.contracts.InterfaceObject;

public class Rock implements InterfaceObject {

    public String name = "Rock";

    public Rock() {  
    }

    public Rock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }    

    public String getObject(){
        return "Rock";
    }
}