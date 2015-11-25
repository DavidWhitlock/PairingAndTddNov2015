package edu.pdx.acm.tennis;

import com.sun.tools.javac.util.Pair;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TennisGameTest {
  @Test
  public void scoreIsZeroZeroAtStart() {
    TennisGame game = new TennisGame();
    Pair<Integer,Integer> score = game.getScore();
    assertThat(score, equalTo(createScore(0,0)));
  }

  private Pair<Integer, Integer> createScore(int a, int b) {
    return new Pair<Integer, Integer>(a,b);
  }
}
