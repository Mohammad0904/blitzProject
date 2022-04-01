package com.example.blitz;

import java.util.ArrayList;
import java.util.TreeMap;

public class Leaderboard {
    TreeMap<Integer, String> leaderboard = new TreeMap<Integer, String>();
    ArrayList<String> extraPlayers = new ArrayList<String>();
    ArrayList<Integer> extraScores = new ArrayList<Integer>();

    public String getLeaderboard () {
        String strLeaderboard = "";
        for (Integer i: leaderboard.keySet()) {
            strLeaderboard += "Player: " + leaderboard.get(i) + " Score: " + i;
            for (int l = 0; l < extraPlayers.size(); l++){
                if (Integer.valueOf(i) == extraScores.get(l)) {
                    strLeaderboard += "Player: " + extraPlayers.get(l) + " Score: " + extraScores.get(l);
                }
            }
        }
        return strLeaderboard;
    }

    public void addToLeaderboard (int score, String player) {
        if (!leaderboard.containsKey(score)){
            leaderboard.put (Integer.valueOf(score), player);
        } else {
            extraPlayers.add(player);
            extraScores.add(Integer.valueOf(score));
        }
    }

}
