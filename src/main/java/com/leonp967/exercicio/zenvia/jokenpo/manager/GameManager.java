package com.leonp967.exercicio.zenvia.jokenpo.manager;

import com.leonp967.exercicio.zenvia.jokenpo.model.JokenpoEnum;
import com.leonp967.exercicio.zenvia.jokenpo.solver.GameSolver;
import com.leonp967.exercicio.zenvia.jokenpo.solver.PaperGameSolver;
import com.leonp967.exercicio.zenvia.jokenpo.solver.RockGameSolver;
import com.leonp967.exercicio.zenvia.jokenpo.solver.ScissorGameSolver;
import org.springframework.stereotype.Component;

@Component
public class GameManager {

    private final PaperGameSolver paperGameSolver;
    private final RockGameSolver rockGameSolver;
    private final ScissorGameSolver scissorGameSolver;

    public GameManager(PaperGameSolver paperGameSolver, RockGameSolver rockGameSolver, ScissorGameSolver scissorGameSolver) {
        this.paperGameSolver = paperGameSolver;
        this.rockGameSolver = rockGameSolver;
        this.scissorGameSolver = scissorGameSolver;
    }

    public GameSolver getSolver(JokenpoEnum item) {
        switch (item) {
            case SCISSOR:
                return scissorGameSolver;
            case ROCK:
                return rockGameSolver;
            case PAPER:
                return paperGameSolver;
            default:
                throw new IllegalArgumentException("Feature not yet implemented into the game!");
        }
    }
}
