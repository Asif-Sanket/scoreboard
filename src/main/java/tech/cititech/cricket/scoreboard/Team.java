package tech.cititech.cricket.scoreboard;

import java.util.List;

public class Team {
    private String teamName;
    private List<Player> players;

    public Team(String teamName, List<Player> players) {
        this.teamName = teamName;
        this.players = players;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public List<Player> getPlayers() {
        return this.players;
    }

}