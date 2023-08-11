package engineeringClubProject.packageObjects;

import engineeringClubProject.tests.TestInit;
import engineeringClubProject.tests.TestJava;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ArrayListTest extends TestInit {
    TestJava testJava = new TestJava();
    @Test
    public void testArray(){
        ArrayList arrayList = new ArrayList();
        arrayList.add("");
    }
}
