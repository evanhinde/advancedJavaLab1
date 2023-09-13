package com.example.advancedjavalab1;

import java.util.Arrays;
import java.util.List;

public class Player {
    //variables
    private String playerName;
    private int playerNumber;
    private String team;
    private boolean isPitcher;
    private String position;

    //constructors

    //getters and setters
    public Player(String playerName, int playerNumber, String team, boolean isPitcher, String position) {
        setPlayerName(playerName);
        setPlayerNumber(playerNumber);
        setTeam(team);
        setIsPitcher(isPitcher);
        setPosition(position);
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        if(playerName.isBlank()) {
            throw new IllegalArgumentException("Player name cannot be empty");
        } else {
            this.playerName = playerName;
        }
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        if(playerNumber <=0) {
            throw new IllegalArgumentException("Player must have number above zero");
        }
        this.playerNumber = playerNumber;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        List<String> validTeams = findTeams();
        if(validTeams.contains(team)) {
            this.team = team;
        } else {
            throw new IllegalArgumentException("Must select team from list of: " + validTeams);
        }
    }

    public static List<String> findTeams() {
        return Arrays.asList("New York Yankees", "Toronto Blue Jays", "Boston Red Sox", "Tampa Bay Rays", "Baltimore Orioles");
    }

    public boolean isPitcher() {
        return isPitcher;
    }

    public void setIsPitcher(boolean pitcher) {
        isPitcher = pitcher;
    }



    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        List<String> validPitcherPositions = findPitcherPositions();
        List<String> validPositionPlayerPositions = findPositionPlayerPositions();
        if(isPitcher = true) {
            if (validPitcherPositions.contains(position)) {
                this.position = position;
            } else {
                throw new IllegalArgumentException("Position for pitcher must be from list of: " + validPitcherPositions);
            }
        } else {
            if (validPositionPlayerPositions.contains(position)) {
                this.position = position;
            } else {
                throw new IllegalArgumentException("Position for position player must be from list of: " + validPositionPlayerPositions);
            }
        }
    }

    public static List<String> findPitcherPositions() {
        return Arrays.asList("SP", "RP");
    }

    public static List<String> findPositionPlayerPositions() {
        return Arrays.asList("C", "1B", "2B", "3B", "SS", "OF", "DH");
    }

    //toString
    @Override
    public String toString() {
        return "You have created " + playerName + ", number " + playerNumber + ", a " + position + " who plays for the " + team;
    }
}
