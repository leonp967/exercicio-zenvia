package com.leonp967.exercicio.zenvia.jokenpo.service;

import com.leonp967.exercicio.zenvia.jokenpo.manager.GameManager;
import com.leonp967.exercicio.zenvia.jokenpo.model.JokenpoEnum;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    private final GameManager gameManager;
    private static final Logger LOGGER = LoggerFactory.getLogger(GameService.class);

    public GameService(GameManager gameManager) {
        this.gameManager = gameManager;
    }

    public JokenpoEnum solveWinner(String firstPlay, String secondPlay) {
        LOGGER.info("Game started with player 1 choosing {} and player 2 choosing {}", firstPlay, secondPlay);
        var firstPlayEnum = JokenpoEnum.fromDescription(StringUtils.lowerCase(firstPlay));
        var secondPlayEnum = JokenpoEnum.fromDescription(StringUtils.lowerCase(secondPlay));

        var solver = gameManager.getSolver(firstPlayEnum);

        return solver.solveWinner(secondPlayEnum);
    }
}
