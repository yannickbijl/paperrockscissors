package org.ysbijl;

public class Game {
    String user, comp;

    public void Game(String user, String comp) {
        this.user = user;
        this.comp = comp;
    }

    public String scoreGame(String userMove, String compMove) {
        if (userMove.equals(compMove)){
            return "tie";
        } else if ((userMove.equals("rock") && compMove.equals("scissors")) ||
                   (userMove.equals("scissors") && compMove.equals("paper")) ||
                   (userMove.equals("paper") && compMove.equals("rock"))) { // Winning cases from user perspective
            return "win";
        }
        return "lose";
    }
}
