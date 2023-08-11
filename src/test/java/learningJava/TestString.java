package learningJava;

import org.testng.annotations.Test;

public class TestString {
    @Test
    public void firstTestString(){
        String name = "My name is Yaroslav";
//        Виводить на екран кількість символів в рядку
        System.out.println(name.length());
//        Виводить на екран символ під пʼятим номером
        System.out.println(name.charAt(5));
//        Виводить на екран символи з четвертого по девʼятий
        System.out.println(name.substring(4, 9));
//        Виводить на екран вісім символів починаючи з кінця
        System.out.println(name.substring(name.length()-8));
//        Перевіряє рядок на наявність якогось слова або букви
        System.out.println(name.contains("is"));
    }
}
