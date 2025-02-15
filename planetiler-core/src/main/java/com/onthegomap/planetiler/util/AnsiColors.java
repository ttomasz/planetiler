package com.onthegomap.planetiler.util;

/** Utilities for styling terminal output. */
public class AnsiColors {
  private AnsiColors() {}

  private static final String COLOR_RESET = "\u001B[0m";
  private static final String FG_RED = "\u001B[31m";
  private static final String FG_GREEN = "\u001B[32m";
  private static final String FG_YELLOW = "\u001B[33m";
  private static final String FG_BLUE = "\u001B[34m";
  private static final String REVERSE = "\u001B[7m";
  private static final String BOLD = "\u001B[1m";

  private static String color(String fg, String string) {
    return fg + string + COLOR_RESET;
  }

  public static String red(String string) {
    return color(FG_RED, string);
  }

  public static String green(String string) {
    return color(FG_GREEN, string);
  }

  public static String yellow(String string) {
    return color(FG_YELLOW, string);
  }

  public static String blue(String string) {
    return color(FG_BLUE, string);
  }

  public static String redBackground(String string) {
    return color(REVERSE + BOLD + FG_RED, string);
  }

  public static String greenBackground(String string) {
    return color(REVERSE + BOLD + FG_GREEN, string);
  }

  public static String redBold(String string) {
    return color(BOLD + FG_RED, string);
  }

  public static String greenBold(String string) {
    return color(BOLD + FG_GREEN, string);
  }
}
