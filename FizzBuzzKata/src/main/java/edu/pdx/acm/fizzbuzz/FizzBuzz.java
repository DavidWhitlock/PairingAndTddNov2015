package edu.pdx.acm.fizzbuzz;

public class FizzBuzz {
  public static String speak(int studentNumber) {
    if (studentNumber < 1 || studentNumber > 100) {
      throw new NotAStudentNumberException();
    }

    if (studentNumber % 3 == 0 && studentNumber % 5 == 0) {
      return "FizzBuzz";

    } else if (studentNumber % 3 == 0) {
      return "Fizz";

    } else if (studentNumber % 5 == 0) {
      return "Buzz";
    }
    return Integer.toString(studentNumber);
  }
}
