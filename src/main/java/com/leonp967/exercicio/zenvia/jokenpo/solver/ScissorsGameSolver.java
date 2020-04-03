package com.leonp967.exercicio.zenvia.jokenpo.solver;

import com.leonp967.exercicio.zenvia.jokenpo.model.JokenpoEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ScissorsGameSolver implements GameSolver{

    private static final Logger LOGGER = LoggerFactory.getLogger(ScissorsGameSolver.class);

    @Override
    public JokenpoEnum solveWinner(JokenpoEnum opponent) {
        LOGGER.info("Solving game between SCISSORS and {}", opponent);
        switch (opponent) {
            case ROCK:
                return JokenpoEnum.ROCK;
            case PAPER:
                return JokenpoEnum.SCISSORS;
            case SCISSORS:
                return JokenpoEnum.DRAW;
            default:
                LOGGER.error("Player 2 chose an unexpected item: {}", opponent);
                throw new IllegalArgumentException("Feature not yet implemented into the game!");
        }
    }
}
