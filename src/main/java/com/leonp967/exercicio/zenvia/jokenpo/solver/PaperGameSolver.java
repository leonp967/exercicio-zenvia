package com.leonp967.exercicio.zenvia.jokenpo.solver;

import com.leonp967.exercicio.zenvia.jokenpo.model.JokenpoEnum;
import org.springframework.stereotype.Component;

@Component
public class PaperGameSolver implements GameSolver {

    @Override
    public JokenpoEnum solve(JokenpoEnum opponent) {
        switch (opponent) {
            case ROCK:
                return JokenpoEnum.PAPER;
            case PAPER:
                return JokenpoEnum.DRAW;
            case SCISSOR:
                return JokenpoEnum.SCISSOR;
            default:
                throw new IllegalArgumentException("Feature not yet implemented into the game!");
        }
    }
}
