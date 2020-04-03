package com.leonp967.exercicio.zenvia.jokenpo.manager;

import com.leonp967.exercicio.zenvia.jokenpo.model.JokenpoEnum;
import com.leonp967.exercicio.zenvia.jokenpo.solver.GameSolver;
import com.leonp967.exercicio.zenvia.jokenpo.solver.PaperGameSolver;
import com.leonp967.exercicio.zenvia.jokenpo.solver.RockGameSolver;
import com.leonp967.exercicio.zenvia.jokenpo.solver.ScissorsGameSolver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isA;
import static org.mockito.Mockito.spy;

class GameManagerTest {

    private static GameManager gameManager;
    private static PaperGameSolver paperGameSolver;
    private static RockGameSolver rockGameSolver;
    private static ScissorsGameSolver scissorsGameSolver;

    @BeforeAll
    public static void setUp() {
        paperGameSolver = spy(PaperGameSolver.class);
        rockGameSolver = spy(RockGameSolver.class);
        scissorsGameSolver = spy(ScissorsGameSolver.class);
        gameManager = new GameManager(paperGameSolver, rockGameSolver, scissorsGameSolver);
    }

    @Test
    public void shouldReturnPaperGameSolver() {
        GameSolver result = gameManager.getSolver(JokenpoEnum.PAPER);

        assertThat(result, isA(PaperGameSolver.class));
    }

    @Test
    public void shouldReturnRockGameSolver() {
        GameSolver result = gameManager.getSolver(JokenpoEnum.ROCK);

        assertThat(result, isA(RockGameSolver.class));
    }

    @Test
    public void shouldReturnScissorGameSolver() {
        GameSolver result = gameManager.getSolver(JokenpoEnum.SCISSORS);

        assertThat(result, isA(ScissorsGameSolver.class));
    }
}