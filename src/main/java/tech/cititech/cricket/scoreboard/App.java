package tech.cititech.cricket.scoreboard;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        List<Player> teamOnePlayers = new ArrayList<Player>();
        teamOnePlayers.add(new Player("Asif Ali"));
        teamOnePlayers.add(new Player("Sanket Jain"));
        teamOnePlayers.add(new Player("Virender Sehwag"));
        teamOnePlayers.add(new Player("Zaheer Khan"));
        teamOnePlayers.add(new Player("Yuvraj Singh"));
        teamOnePlayers.add(new Player("MS Dhoni"));
        teamOnePlayers.add(new Player("Suresh Raina"));
        teamOnePlayers.add(new Player("Ravindra Jadeja"));
        teamOnePlayers.add(new Player("Sachin Tendulkar"));
        teamOnePlayers.add(new Player("Virat Kohli"));
        teamOnePlayers.add(new Player("Rohit Sharma"));
        Team india = new Team("India", teamOnePlayers);

        List<Player> teamTwoPlayers = new ArrayList<Player>();
        teamTwoPlayers.add(new Player("Nasir Hussain"));
        teamTwoPlayers.add(new Player("Ian Bell"));
        teamTwoPlayers.add(new Player("Kevin Pertarson"));
        teamTwoPlayers.add(new Player("Marcus Trescothik"));
        teamTwoPlayers.add(new Player("Paul Collingwood"));
        teamTwoPlayers.add(new Player("Andrew Straus"));
        teamTwoPlayers.add(new Player("Eion Morgan"));
        teamTwoPlayers.add(new Player("James Anderson"));
        teamTwoPlayers.add(new Player("Steve Harmission"));
        teamTwoPlayers.add(new Player("Monty Panesar"));
        teamOnePlayers.add(new Player("Moeen Ali"));
        Team england = new Team("England", teamTwoPlayers);


    }
}
