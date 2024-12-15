package ISEC.DAS.Game;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class GameDatabase {
    private final Map<Long, Game> storage = new HashMap<>();
    private final AtomicLong idGenerator = new AtomicLong();

    private static GameDatabase instance;

    public static GameDatabase getInstance() {
        if (instance == null) {
            instance = new GameDatabase();
        }
        return instance;
    }

    public  void saveGame(Game game) {
        if (game.getId() == null) {
            game.setId(idGenerator.incrementAndGet());
        }
        storage.put(game.getId(), game);


    }

    public  Game loadGame(Long id) {
        if (storage.containsKey(id)) {
            return storage.get(id);
        }
        return new Game();
    }

}
