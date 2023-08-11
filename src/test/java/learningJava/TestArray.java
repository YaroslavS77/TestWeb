package learningJava;

import org.testng.annotations.Test;

public class TestArray {
    @Test
    public void firstTestArray(){
        int[] array = {45, 64, 23, 32, 43, 47};
        System.out.println(array[3]);
//        Щоб замінити якесь число в масиві, використовуємо наступний приклад:
        array[3] = 45;
        System.out.println(array[3]);
//        Щоб створити пустий масив на певну кількість місць, пишемо наступну команду:
        int[] clearArray = new int[10];
    }
}
