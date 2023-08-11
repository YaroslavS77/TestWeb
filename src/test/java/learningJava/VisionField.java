package learningJava;

import org.testng.annotations.Test;

public class VisionField {
    SecondJavaTest secondJavaTest = new SecondJavaTest();

    final int age = 55;
    int a = 48;
    int b = 43;

    @Test
    public void running(){
        System.out.println(secondJavaTest.age);
    }

    @Test
    public void secondRunning(){
        System.out.println(age);
    }
}
