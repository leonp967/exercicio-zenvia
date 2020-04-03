package com.leonp967.exercicio.zenvia.jokenpo.solver;

import com.leonp967.exercicio.zenvia.jokenpo.model.JokenpoEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class PaperGameSolver implements GameSolver {

    private static final Logger LOGGER = LoggerFactory.getLogger(PaperGameSolver.class);

    @Override
    public JokenpoEnum solveWinner(JokenpoEnum opponent) {
        LOGGER.info("Solving game between PAPER and {}", opponent);
        switch (opponent) {
            case ROCK:
                return JokenpoEnum.PAPER;
            case PAPER:
                return JokenpoEnum.DRAW;
            case SCISSORS:
                return JokenpoEnum.SCISSORS;
            default:
                LOGGER.error("Player 2 chose an unexpected item: {}", opponent);
                throw new IllegalArgumentException("Feature not yet implemented into the game!");
        }
    }
}
