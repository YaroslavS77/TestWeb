package com.RozetkaMarketPlace.TestAPI;

import com.RozetkaMarketPlace.TestAPI.API_Files.PayLoad;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComplexJsonParse {
    @Test
    public void JsonParse() {
        JsonPath js = new JsonPath(PayLoad.courcePrice());

        int count = js.getInt("courses.size()");
        System.out.println(count);

//        int getCoast = js.getInt("dashboard.purchaseAmount");
//        System.out.println(getCoast);
//
//        String getFirstCourse = js.getString("courses.title");
//        System.out.println(getFirstCourse);

//        for (int i = 0; i < count; i++){
//            String getAllCourses = js.getString("courses["+i+"].title");
//            String getAllCoasts = js.getString("courses["+i+"].price");
//            System.out.println(getAllCourses);
//            System.out.println(getAllCoasts);
//        }

        for (int i = 0; i < count; i++){
            String getAllCourses = js.getString("courses["+i+"].title");
            if(getAllCourses.equalsIgnoreCase("RPA"))
            {
                int copiesCorses = js.get("courses["+i+"].copies");
                System.out.println(copiesCorses);
                break;
            }
        }
    }

    @Test
    public void sumOfCourses(){
        JsonPath js = new JsonPath(PayLoad.courcePrice());
        int sum = 0;
        int count = js.getInt("courses.size()");

        for(int i = 0; i < count; i++){
            int getAllCoasts = js.getInt("courses["+i+"].price");
            int getAllCopies = js.getInt("courses["+i+"].copies");
            int amount = getAllCoasts * getAllCopies;
            System.out.println(amount);
            sum = sum + amount;
        }
        System.out.println(sum);

        int getPurchase = js.get("dashboard.purchaseAmount");
        Assert.assertEquals(sum, getPurchase, "sum isn't the same");
    }
}
