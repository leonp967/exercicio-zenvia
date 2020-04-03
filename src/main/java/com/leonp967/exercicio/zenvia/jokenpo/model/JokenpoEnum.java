package com.leonp967.exercicio.zenvia.jokenpo.model;

import java.util.Arrays;

public enum JokenpoEnum {

    SCISSOR("scissor"),
    PAPER("paper"),
    ROCK("rock"),
    DRAW("draw");

    String description;

    JokenpoEnum(String description) {
        this.description = description;
    }

    public static JokenpoEnum fromDescription(String description) {
        return Arrays.stream(values()).filter(joken -> joken.description.equals(description)).findFirst().orElse(null);
    }
}
