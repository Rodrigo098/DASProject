package ISEC.DAS.Game;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/games")
public class GameController {

    private GameDatabase gameDatabase;
    public GameController() {
       gameDatabase= GameDatabase.getInstance();
    }



    @PostMapping
    public void saveGame(@RequestBody Game game) {
        gameDatabase.saveGame(game);
    }

    @GetMapping("/{id}")
    public Game loadGame(@PathVariable Long id) {
        return gameDatabase.loadGame(id);
    }
}