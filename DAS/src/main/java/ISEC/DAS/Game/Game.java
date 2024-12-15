package ISEC.DAS.Game;

import ISEC.DAS.Player.Player;

public class Game {

    private Long id;


    private Player whitePlayer;


    private Player blackPlayer;

    private String state;

    public Player getWhitePlayer() {
        return whitePlayer;
    }

    public void setWhitePlayer(Player whitePlayer) {
        this.whitePlayer = whitePlayer;
    }

    public Player getBlackPlayer() {
        return blackPlayer;
    }

    public void setBlackPlayer(Player blackPlayer) {
        this.blackPlayer = blackPlayer;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(long l) {
        this.id = l;
    }
}
