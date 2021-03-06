package tech.cititech.cricket.scoreboard;

public class Player {
    private String name;
    private boolean isInjured;

    public Player(String name) {
        this(name, false);
    }

    public Player(String name, boolean isInjured) {
        this.name = name;
        this.isInjured = isInjured;
    }

    public String getName() {
        return this.name;
    }

    public boolean isIsInjured() {
        return this.isInjured;
    }
}
