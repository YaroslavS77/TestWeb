package learningJava;

import org.testng.annotations.Test;

public class SecondJavaTest {
    int age = 55;

    @Test
    public void runSecondTest(){
        JavaTest javaTest = new JavaTest();
        System.out.println(javaTest.summ(8, 8));
    }
}
