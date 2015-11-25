package edu.pdx.acm.tennis;

import com.sun.tools.javac.util.Pair;

public class TennisGame {
  private int serverScore = 0;

  public Pair<Integer, Integer> getScore() {
    return new Pair<Integer, Integer>(serverScore, 0);
  }

  public void serverScores() {
    serverScore = 15;
  }
}
