package com.leonp967.exercicio.zenvia.jokenpo.solver;

import com.leonp967.exercicio.zenvia.jokenpo.model.JokenpoEnum;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RockGameSolverTest {

    private static RockGameSolver rockGameSolver;

    @BeforeAll
    public static void setUp() {
        rockGameSolver = new RockGameSolver();
    }

    @Test
    public void paperShouldWin() {
        JokenpoEnum winner = rockGameSolver.solveWinner(JokenpoEnum.PAPER);

        assertThat(winner, is(JokenpoEnum.PAPER));
    }

    @Test
    public void rockShouldWin() {
        JokenpoEnum winner = rockGameSolver.solveWinner(JokenpoEnum.SCISSORS);

        assertThat(winner, is(JokenpoEnum.ROCK));
    }

    @Test
    public void shouldBeDraw() {
        JokenpoEnum winner = rockGameSolver.solveWinner(JokenpoEnum.ROCK);

        assertThat(winner, is(JokenpoEnum.DRAW));
    }

    @Test
    public void shouldThrowError() {
        Throwable error = assertThrows(IllegalArgumentException.class, () -> rockGameSolver.solveWinner(JokenpoEnum.DRAW));

        assertNotNull(error);
        assertThat(error.getMessage(), is("Feature not yet implemented into the game!"));
    }
}