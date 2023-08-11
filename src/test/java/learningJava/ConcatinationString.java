package learningJava;

import org.testng.annotations.Test;

public class ConcatinationString {
    @Test
    public void secontTestString(){
        String name = "Hello my name is Yaroslav";
        String addString = " and what is your name?";
        System.out.print(name + addString);
    }
}
