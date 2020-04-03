package com.leonp967.exercicio.zenvia.jokenpo.solver;

import com.leonp967.exercicio.zenvia.jokenpo.model.JokenpoEnum;
import org.springframework.stereotype.Component;

@Component
public class ScissorsGameSolver implements GameSolver{

    @Override
    public JokenpoEnum solveWinner(JokenpoEnum opponent) {
        switch (opponent) {
            case ROCK:
                return JokenpoEnum.ROCK;
            case PAPER:
                return JokenpoEnum.SCISSORS;
            case SCISSORS:
                return JokenpoEnum.DRAW;
            default:
                throw new IllegalArgumentException("Feature not yet implemented into the game!");
        }
    }
}
