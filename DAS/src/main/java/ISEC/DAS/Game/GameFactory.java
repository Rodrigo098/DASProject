package ISEC.DAS.Game;

import ISEC.DAS.Player.Player;

public class GameFactory {
    public static Game createGame(Player whitePlayer, Player blackPlayer) {
        Game game = new Game();
        game.setWhitePlayer(whitePlayer);
        game.setBlackPlayer(blackPlayer);
        game.setState("start"); // estado inicial I guess
        return game;
    }
}
