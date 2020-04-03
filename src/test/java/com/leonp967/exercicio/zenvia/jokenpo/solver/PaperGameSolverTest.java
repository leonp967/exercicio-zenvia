package com.leonp967.exercicio.zenvia.jokenpo.solver;

import com.leonp967.exercicio.zenvia.jokenpo.model.JokenpoEnum;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PaperGameSolverTest {

    private static PaperGameSolver paperGameSolver;

    @BeforeAll
    public static void setUp() {
        paperGameSolver = new PaperGameSolver();
    }

    @Test
    public void paperShouldWin() {
        JokenpoEnum winner = paperGameSolver.solveWinner(JokenpoEnum.ROCK);

        assertThat(winner, is(JokenpoEnum.PAPER));
    }

    @Test
    public void scissorsShouldWin() {
        JokenpoEnum winner = paperGameSolver.solveWinner(JokenpoEnum.SCISSORS);

        assertThat(winner, is(JokenpoEnum.SCISSORS));
    }

    @Test
    public void shouldBeDraw() {
        JokenpoEnum winner = paperGameSolver.solveWinner(JokenpoEnum.PAPER);

        assertThat(winner, is(JokenpoEnum.DRAW));
    }

    @Test
    public void shouldThrowError() {
        Throwable error = assertThrows(IllegalArgumentException.class, () -> paperGameSolver.solveWinner(JokenpoEnum.DRAW));

        assertNotNull(error);
        assertThat(error.getMessage(), is("Feature not yet implemented into the game!"));
    }
}