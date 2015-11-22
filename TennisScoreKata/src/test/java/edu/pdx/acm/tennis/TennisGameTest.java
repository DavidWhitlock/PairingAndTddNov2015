package edu.pdx.acm.tennis;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TennisGameTest {

  @Test
  public void echo1is1() {
    assertThat(TennisGame.echo(1), equalTo(1));
  }

}
