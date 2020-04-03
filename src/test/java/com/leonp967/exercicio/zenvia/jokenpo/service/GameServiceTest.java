package com.leonp967.exercicio.zenvia.jokenpo.service;

import com.leonp967.exercicio.zenvia.jokenpo.manager.GameManager;
import com.leonp967.exercicio.zenvia.jokenpo.model.JokenpoEnum;
import com.leonp967.exercicio.zenvia.jokenpo.solver.PaperGameSolver;
import com.leonp967.exercicio.zenvia.jokenpo.solver.RockGameSolver;
import com.leonp967.exercicio.zenvia.jokenpo.solver.ScissorsGameSolver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

class GameServiceTest {

    private static GameService gameService;
    private static GameManager gameManager;

    @BeforeAll
    public static void setUp() {
        gameManager = mock(GameManager.class);
        gameService = new GameService(gameManager);
    }

    @Test
    public void scissorsShouldWin() {
        given(gameManager.getSolver(JokenpoEnum.SCISSORS)).willReturn(new ScissorsGameSolver());

        JokenpoEnum winner = gameService.solveWinner("scissors", "paper");

        assertThat(winner, is(JokenpoEnum.SCISSORS));
    }

    @Test
    public void rockShouldWin() {
        given(gameManager.getSolver(JokenpoEnum.ROCK)).willReturn(new RockGameSolver());

        JokenpoEnum winner = gameService.solveWinner("rock", "scissors");

        assertThat(winner, is(JokenpoEnum.ROCK));
    }

    @Test
    public void paperShouldWin() {
        given(gameManager.getSolver(JokenpoEnum.PAPER)).willReturn(new PaperGameSolver());

        JokenpoEnum winner = gameService.solveWinner("paper", "rock");

        assertThat(winner, is(JokenpoEnum.PAPER));
    }

    @Test
    public void shoudlBeDraw() {
        given(gameManager.getSolver(JokenpoEnum.SCISSORS)).willReturn(new ScissorsGameSolver());

        JokenpoEnum winner = gameService.solveWinner("scissors", "scissors");

        assertThat(winner, is(JokenpoEnum.DRAW));
    }

}