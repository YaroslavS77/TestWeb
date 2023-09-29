package com.RozetkaMarketPlace.SecondApiTest;

public class ApiResources {
    public static String addBookJson(String isbn, String aisle){
        String payLoad = "{\n" +
                "\"name\":\"Learn Appium Automation with Java\",\n" +
                "\"isbn\":\""+isbn+"\",\n" +
                "\"aisle\":\""+aisle+"\",\n" +
                "\"author\":\"John foer\"\n" +
                "}";
        return payLoad;
    }
}
