package com.leonp967.exercicio.zenvia.jokenpo.solver;

import com.leonp967.exercicio.zenvia.jokenpo.model.JokenpoEnum;
import org.springframework.stereotype.Component;

@Component
public class RockGameSolver implements GameSolver {

    @Override
    public JokenpoEnum solveWinner(JokenpoEnum opponent) {
        switch (opponent) {
            case ROCK:
                return JokenpoEnum.DRAW;
            case PAPER:
                return JokenpoEnum.PAPER;
            case SCISSORS:
                return JokenpoEnum.ROCK;
            default:
                throw new IllegalArgumentException("Feature not yet implemented into the game!");
        }
    }
}
