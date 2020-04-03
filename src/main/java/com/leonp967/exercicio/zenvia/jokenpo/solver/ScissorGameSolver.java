package com.leonp967.exercicio.zenvia.jokenpo.solver;

import com.leonp967.exercicio.zenvia.jokenpo.model.JokenpoEnum;
import org.springframework.stereotype.Component;

@Component
public class ScissorGameSolver implements GameSolver{

    @Override
    public JokenpoEnum solve(JokenpoEnum opponent) {
        switch (opponent) {
            case ROCK:
                return JokenpoEnum.ROCK;
            case PAPER:
                return JokenpoEnum.SCISSOR;
            case SCISSOR:
                return JokenpoEnum.DRAW;
            default:
                throw new IllegalArgumentException("Feature not yet implemented into the game!");
        }
    }
}
