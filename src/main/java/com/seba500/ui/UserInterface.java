package com.seba500.ui;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserInterface {
  public static void main(String[] args) {
    System.out.println("It Works :)");
    logger.trace("We've just greeted the user!");
    logger.debug("We've just greeted the user!");
    logger.info("We've just greeted the user!");
    logger.warn("We've just greeted the user!");
    logger.error("We've just greeted the user!");
    logger.fatal("We've just greeted the user!");
  }
}