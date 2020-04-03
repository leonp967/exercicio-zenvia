package com.leonp967.exercicio.zenvia.jokenpo.solver;

import com.leonp967.exercicio.zenvia.jokenpo.model.JokenpoEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class RockGameSolver implements GameSolver {

    private static final Logger LOGGER = LoggerFactory.getLogger(RockGameSolver.class);

    @Override
    public JokenpoEnum solveWinner(JokenpoEnum opponent) {
        LOGGER.info("Solving game between ROCK and {}", opponent);
        switch (opponent) {
            case ROCK:
                return JokenpoEnum.DRAW;
            case PAPER:
                return JokenpoEnum.PAPER;
            case SCISSORS:
                return JokenpoEnum.ROCK;
            default:
                LOGGER.error("Player 2 chose an unexpected item: {}", opponent);
                throw new IllegalArgumentException("Feature not yet implemented into the game!");
        }
    }
}
