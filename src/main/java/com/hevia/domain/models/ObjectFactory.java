package com.hevia.domain.models;

import com.hevia.domain.contracts.InterfaceObject;

public class ObjectFactory {

    public ObjectFactory(){
    }

    public InterfaceObject createObject(String Object){

        if(Object == null){
           return null;
        }		

        if(Object.equals("Paper")){
           return new Paper(); 
        } 
        
        if(Object.equals("Rock"))
        {
           return new Rock();  
        } 

        if(Object.equals("Scissors")){
           return new Scissors();
        }
        
        return null;
     }
}
