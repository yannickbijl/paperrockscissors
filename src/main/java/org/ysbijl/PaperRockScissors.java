package org.ysbijl;

public class PaperRockScissors {
    public static void main(String[] args) {
        final String[] choices = new String[] {"rock", "paper", "scissors"};

        Player user = new Player();
        Player comp = new Player();

        user.setMove("rock");
        comp.setMove(comp.selectRandomMove(choices));

        Game singleGame = new Game();
        String state = singleGame.scoreGame(user.getMove(), comp.getMove());
    }


}