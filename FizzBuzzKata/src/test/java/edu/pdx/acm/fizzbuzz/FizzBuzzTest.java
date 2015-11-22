package edu.pdx.acm.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {

  @Test
  public void echo1is1() {
    assertThat(FizzBuzz.echo(1), equalTo(1));
  }

}
