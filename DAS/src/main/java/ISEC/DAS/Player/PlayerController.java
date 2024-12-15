package ISEC.DAS.Player;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private PlayerDatabase playerDatabase;

    public PlayerController() {
        this.playerDatabase = PlayerDatabase.getInstance();
    }

    @GetMapping("/{id}")
    public Player getPlayer(@PathVariable Long id) {
        return playerDatabase.getPlayer(id);
    }

    @PostMapping
    public void addPlayer(@RequestBody String name) {
        playerDatabase.addPlayer(name);
    }

    @DeleteMapping("/{id}")
    public void removePlayer(@PathVariable Long id) {
        playerDatabase.removePlayer(id);
    }

    @GetMapping
    public List<Player> getPlayers() {
        return playerDatabase.getPlayers();
    }
}