package edu.pdx.acm.tennis;

import com.sun.tools.javac.util.Pair;

public class TennisGame {
  private int serverScore = 0;
  private int returnerScore = 0;

  public Pair<Integer, Integer> getScore() {
    return new Pair<Integer, Integer>(serverScore, returnerScore);
  }

  public void serverScores() {
    serverScore = 15;
  }

  public void returnerScores() {
    returnerScore = 15;
  }
}
