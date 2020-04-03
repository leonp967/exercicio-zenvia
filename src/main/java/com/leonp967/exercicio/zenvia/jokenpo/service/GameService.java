package com.leonp967.exercicio.zenvia.jokenpo.service;

import com.leonp967.exercicio.zenvia.jokenpo.manager.GameManager;
import com.leonp967.exercicio.zenvia.jokenpo.model.JokenpoEnum;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    private final GameManager gameManager;

    public GameService(GameManager gameManager) {
        this.gameManager = gameManager;
    }

    public JokenpoEnum solveWinner(String firstPlay, String secondPlay) {
        var firstPlayEnum = JokenpoEnum.fromDescription(StringUtils.lowerCase(firstPlay));
        var secondPlayEnum = JokenpoEnum.fromDescription(StringUtils.lowerCase(secondPlay));

        var solver = gameManager.getSolver(firstPlayEnum);

        return solver.solveWinner(secondPlayEnum);
    }
}
