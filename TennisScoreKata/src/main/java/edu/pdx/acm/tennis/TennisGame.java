package edu.pdx.acm.tennis;

import com.sun.tools.javac.util.Pair;

public class TennisGame {
  private int serverScore = 0;
  private int returnerScore = 0;

  public Pair<Integer, Integer> getScore() {
    return new Pair<Integer, Integer>(serverScore, returnerScore);
  }

  public void serverScores() {
    serverScore = incrementScore(serverScore);
  }

  public void returnerScores() {
    returnerScore = incrementScore(returnerScore);
  }

  private int incrementScore(int score) {
    if (score == 0) {
      score = 15;
    } else if (score == 15) {
      score = 30;
    }

    return score;
  }
}
