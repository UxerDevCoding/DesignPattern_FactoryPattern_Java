package com.hevia.app;
import com.hevia.domain.models.ObjectFactory;

public class Game {
    
public String playGame(String playerOne, String playerTwo) {

    
    ObjectFactory factory = new ObjectFactory();
    String playerOneObject = factory.createObject(playerOne).getObject();
    String playerTwoObject = factory.createObject(playerTwo).getObject();
    
    String winner = this.checkWinner(playerOneObject, playerTwoObject);
    return winner;

}

public String checkWinner(String playerOne, String playerTwo) {

    
    if (playerOne == "Rock" && playerTwo == "Scissors") {
        return "Rock win";
    }
    
    if (playerOne == "Scissors" && playerTwo == "Rock") {
        return "Rock win";
    }
    
    if (playerOne == "Rock" && playerTwo == "Paper") {
        return "Paper win";
    }
    
    if (playerOne == "Paper" && playerTwo == "Rock") {
        return "Paper win";
    }
   
    if (playerOne == "Scissors" && playerTwo == "Paper") {
        return "Scissors win";
    }
    
    if (playerOne == "Paper" && playerTwo == "Scissors") {
        return "Scissors win";
    }

    return "draw";
}
}
