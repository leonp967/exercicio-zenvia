package com.leonp967.exercicio.zenvia.jokenpo.solver;

import com.leonp967.exercicio.zenvia.jokenpo.model.JokenpoEnum;

public interface GameSolver {
    JokenpoEnum solveWinner(JokenpoEnum opponent);
}
