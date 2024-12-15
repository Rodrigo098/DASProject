package ISEC.DAS.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerDatabase {
    private static PlayerDatabase instance;
    private Map<Long, Player> players;

    private PlayerDatabase() {
        players = new HashMap<>();
    }

    public static synchronized PlayerDatabase getInstance() {
        if (instance == null) {
            instance = new PlayerDatabase();
        }
        return instance;
    }

    public Player getPlayer(Long id) {
        return players.get(id);
    }

    public void addPlayer(String name) {
        Player player = PlayerFactory.createPlayer(name );
        players.put(player.getId(), player);

    }

    public void removePlayer(Long id) {
        players.remove(id);
    }
    public List<Player> getPlayers() {
        return (List<Player>) players.values();
    }
}