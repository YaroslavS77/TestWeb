package learningJava;

import org.testng.annotations.Test;

public class JavaTest {

    int Age = 49;

    @Test
    public void runJavaTest(){
      int result = summ(65, 78);
        System.out.println(result);
    }

    public int summ(int firstVariable, int secondVariable){
        return firstVariable*secondVariable;
    }



}
