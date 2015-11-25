package edu.pdx.acm.tennis;

import com.sun.tools.javac.util.Pair;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TennisGameTest {
  TennisGame game;

  @Before
  public void setUp() {
    game = new TennisGame();
  }

  @Test
  public void scoreIsZeroZeroAtStart() {
    assertThat(game.getScore(),
      equalTo(createScore(0, 0)));
  }

  @Test
  public void serverScoreIsFifteenZero() {
    game.serverScores();
    assertThat(game.getScore(),
      equalTo(createScore(15, 0)));
  }

  @Test
  public void returnerScoreIsZeroFifteen() {
    game.returnerScores();
    assertThat(game.getScore(),
      equalTo(createScore(0, 15)));
  }

  @Test
  public void serverAndReturnerBothScoreIsFifteenFifteen() {
    game.serverScores();
    game.returnerScores();
    assertThat(game.getScore(),
      equalTo(createScore(15, 15)));
  }

  @Test
  public void serverScoresTwiceIsThirtyZero() {
    game.serverScores();
    game.serverScores();
    assertThat(game.getScore(),
      equalTo(createScore(30, 0)));
  }

  @Test
  public void returnerScoresTwiceIsZeroThirty() {
    game.returnerScores();
    game.returnerScores();
    assertThat(game.getScore(),
      equalTo(createScore(0, 30)));
  }

  private Pair<Integer, Integer> createScore(int a, int b) {
    return new Pair<Integer, Integer>(a, b);
  }
}
