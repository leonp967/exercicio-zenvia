package com.leonp967.exercicio.zenvia.jokenpo.manager;

import com.leonp967.exercicio.zenvia.jokenpo.model.JokenpoEnum;
import com.leonp967.exercicio.zenvia.jokenpo.solver.GameSolver;
import com.leonp967.exercicio.zenvia.jokenpo.solver.PaperGameSolver;
import com.leonp967.exercicio.zenvia.jokenpo.solver.RockGameSolver;
import com.leonp967.exercicio.zenvia.jokenpo.solver.ScissorsGameSolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class GameManager {

    private final PaperGameSolver paperGameSolver;
    private final RockGameSolver rockGameSolver;
    private final ScissorsGameSolver scissorsGameSolver;
    private static final Logger LOGGER = LoggerFactory.getLogger(GameManager.class);

    public GameManager(PaperGameSolver paperGameSolver, RockGameSolver rockGameSolver, ScissorsGameSolver scissorsGameSolver) {
        this.paperGameSolver = paperGameSolver;
        this.rockGameSolver = rockGameSolver;
        this.scissorsGameSolver = scissorsGameSolver;
    }

    public GameSolver getSolver(JokenpoEnum item) {
        switch (item) {
            case SCISSORS:
                return scissorsGameSolver;
            case ROCK:
                return rockGameSolver;
            case PAPER:
                return paperGameSolver;
            default:
                LOGGER.error("Player 1 chose an unexpected item: {}", item);
                throw new IllegalArgumentException("Feature not yet implemented into the game!");
        }
    }
}
