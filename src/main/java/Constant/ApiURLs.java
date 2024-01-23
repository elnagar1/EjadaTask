package Constant;


import Utilities.LoadProperties;

public class ApiURLs {

  public static final String baseUrl = LoadProperties.userData.getProperty("baseUrl");

  final public static String status =  "status";
  final public static String books =  "books";
  final public static String orders =  "orders";

}