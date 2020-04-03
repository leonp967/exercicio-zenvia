package com.leonp967.exercicio.zenvia.jokenpo;

import com.leonp967.exercicio.zenvia.jokenpo.config.AppConfig;
import com.leonp967.exercicio.zenvia.jokenpo.model.JokenpoEnum;
import com.leonp967.exercicio.zenvia.jokenpo.service.GameService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameInitializer {

    private final GameService gameService;

    public GameInitializer() {
        var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        gameService = applicationContext.getBean(GameService.class);
    }

    public static void main(String[] args) {
        var initializer = new GameInitializer();
        System.out.println("Game result: " + initializer.play("paper", "rock"));
    }

    public JokenpoEnum play(String playerOne, String playerTwo) {
        return gameService.solvePlay(playerOne, playerTwo);
    }
}
