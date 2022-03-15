package com.hevia.domain.models;

import com.hevia.domain.contracts.InterfaceObject;

public class Paper implements InterfaceObject {

    public String name = "Paper";

    public Paper() {  
    }

    public Paper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }    

    public String getObject(){
        return "Paper";
    }
}
