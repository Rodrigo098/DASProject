package ISEC.DAS.Player;

public class PlayerFactory {
    static long id = 0;
    public static Player createPlayer(String name) {
        Player player = new Player(id++,name);
        player.setName(name);
        return player;
    }
}
