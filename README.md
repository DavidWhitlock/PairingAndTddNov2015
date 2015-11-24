# PairingAndTddNov2015

Introducing Pair Programming and Test Driven Development to the Portland State University ACM.

## Who is this guy?

I'm David Whitlock and I teach the [Advanced Java Programming](http://web.cecs.pdx.edu/~whitlock/) course at Portland State University.  During the day, I lead Teams at [Tripwire](http://www.tripwire.com/) in downtown Portland.  I'm also a member of the Steering Committee for the [PCEP internship program](https://www.pdx.edu/computer-science/pcep-internship) at PSU.

## Learning about Pair Programming and TDD

In order to evolve and revolutionize _what_ we do as software engineers, we need to evolve and revolutionize _how_ we do it.  Two tools that we have to improve the design and implementation of the code that we write are pair programming and test driven development.
   * [This video](https://www.youtube.com/watch?v=rG_U12uqRhE) from North Carolina State University gives a good (albeit kind of cheesy) overview of pair programming and its benefits
   * [Uncle Bob Martin](https://vimeo.com/43734265), author of "[Clean Code](https://cleancoders.com/landing)", introduces TDD by building a simple application in Java using the JUnit unit testing framework.
   * Shameless plug: My Advanced Java Programming course covers [unit](http://web.cecs.pdx.edu/~whitlock/pdf/junit-2x2.pdf) [testing](https://www.youtube.com/watch?v=k1DE9H8EGNA&list=SPyM7S4CZk9WPrtC8AclCNxOBA8buEJdib) in week 1.

## Pair Programming and TDD in Action

To give you a better idea of what Pair Programming and TDD are all about, I'm going to pair with someone to develop a solution to the simple [FizzBuzz code kata](http://codingdojo.org/cgi-bin/index.pl?KataFizzBuzz).  My coding partner and I will implement it in Java using the [IntelliJ IDEA IDE](https://www.jetbrains.com/idea/), the [gradle](http://gradle.org/) build tool, and the [JUnit](http://junit.org/) and [hamcrest](http://hamcrest.org/JavaHamcrest/) testing libraries.  We'll publish our solution to a public [GitHub repository](https://github.com/DavidWhitlock/PairingAndTddNov2015) that you can clone or fork.  If you're not not familiar with git, you can [download the source code as a zip file](https://github.com/DavidWhitlock/PairingAndTddNov2015/archive/master.zip).

```
$ git clone git@github.com:DavidWhitlock/PairingAndTddNov2015.git
$ cd PairingAndTddNov2015/FizzBuzzKata
$ ./gradlew build
$ ./gradlew idea
```

Once we've seen a live performance of Pair Programming and TDD, everyone will have an opportunity to try pair programming and TDD for themselves.  In my GitHub repository there is the skeleton of a Java project that can be used to implement a program that calculates the [score of a game of tennis](http://codingdojo.org/cgi-bin/index.pl?KataTennis%5D).

```
$ cd PairingAndTddNov2015/TennisScoreKata
$ ./gradlew build
$ ./gradlew idea
```

## What do you think of Pair Programming and TDD?

I'm interested to hear your about your initial thoughts about and experiences with pair programming and TDD.  Let's conclude tonight's session with a discussion of what you've seen, what you like, and what you didn't like.

