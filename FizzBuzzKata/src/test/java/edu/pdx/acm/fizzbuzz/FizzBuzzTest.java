package edu.pdx.acm.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {
  @Test
  public void firstStudentSays1() {
    assertThat(FizzBuzz.speak(1), equalTo("1"));
  }

  @Test
  public void thirdStudentSaysFizz() {
    assertThat(FizzBuzz.speak(3), equalTo("Fizz"));
  }

  @Test
  public void fifthStudentSaysBuzz() {
    assertThat(FizzBuzz.speak(5), equalTo("Buzz"));
  }

  @Test
  public void ninthStudentSaysFizz() {
    assertThat(FizzBuzz.speak(9), equalTo("Fizz"));
  }

  @Test(expected=NotAStudentNumberException.class)
  public void negativeNumberThrows() {
    FizzBuzz.speak(-1);
  }

  @Test(expected=NotAStudentNumberException.class)
  public void moreThan100Throws() {
    FizzBuzz.speak(101);
  }

  @Test
  public void fifteenthStudentSaysFizzBuzz() {
    assertThat(FizzBuzz.speak(15), equalTo("FizzBuzz"));
  }

}
