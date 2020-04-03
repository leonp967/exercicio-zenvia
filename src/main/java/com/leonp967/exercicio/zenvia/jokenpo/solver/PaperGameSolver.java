package com.leonp967.exercicio.zenvia.jokenpo.solver;

import com.leonp967.exercicio.zenvia.jokenpo.model.JokenpoEnum;
import org.springframework.stereotype.Component;

@Component
public class PaperGameSolver implements GameSolver {

    @Override
    public JokenpoEnum solveWinner(JokenpoEnum opponent) {
        switch (opponent) {
            case ROCK:
                return JokenpoEnum.PAPER;
            case PAPER:
                return JokenpoEnum.DRAW;
            case SCISSORS:
                return JokenpoEnum.SCISSORS;
            default:
                throw new IllegalArgumentException("Feature not yet implemented into the game!");
        }
    }
}
