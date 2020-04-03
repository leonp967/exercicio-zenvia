package com.leonp967.exercicio.zenvia.jokenpo.solver;

import com.leonp967.exercicio.zenvia.jokenpo.model.JokenpoEnum;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ScissorsGameSolverTest {

    private static ScissorsGameSolver scissorsGameSolver;

    @BeforeAll
    public static void setUp() {
        scissorsGameSolver = new ScissorsGameSolver();
    }

    @Test
    public void scissorsShouldWin() {
        JokenpoEnum winner = scissorsGameSolver.solveWinner(JokenpoEnum.PAPER);

        assertThat(winner, is(JokenpoEnum.SCISSORS));
    }

    @Test
    public void rockShouldWin() {
        JokenpoEnum winner = scissorsGameSolver.solveWinner(JokenpoEnum.ROCK);

        assertThat(winner, is(JokenpoEnum.ROCK));
    }

    @Test
    public void shouldBeDraw() {
        JokenpoEnum winner = scissorsGameSolver.solveWinner(JokenpoEnum.SCISSORS);

        assertThat(winner, is(JokenpoEnum.DRAW));
    }

    @Test
    public void shouldThrowError() {
        Throwable error = assertThrows(IllegalArgumentException.class, () -> scissorsGameSolver.solveWinner(JokenpoEnum.DRAW));

        assertNotNull(error);
        assertThat(error.getMessage(), is("Feature not yet implemented into the game!"));
    }
}