package com.example;

/**
* Class greeter.
*/
public class Greeter {

  /**
  * Constructeur javadoc test jenkins.
  */
  public Greeter() {

  }
  /**
 * @param someone - someone ceva ?
 * @return string
 */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
