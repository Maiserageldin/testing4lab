
import org.junit.Test;

import static org.junit.Assert.*;

public class Evenandodd1Test {
    @Test
    public void case1(){
        Evenandodd1 NumberOne = new Evenandodd1();
        assertEquals("even",NumberOne.Evenandodd1(54));
    }

    @Test
    public void case2(){
        Evenandodd1 NumberTwo = new Evenandodd1();
        assertEquals("odd", NumberTwo.Evenandodd1(7));
    }

    @Test
    public void case3(){
        Evenandodd1 NumberThree = new Evenandodd1();
        assertEquals("even", NumberThree.Evenandodd1(-6));
    }

    @Test
    public void case4(){
        Evenandodd1 NumberFour = new Evenandodd1();
        assertEquals("even", NumberFour.Evenandodd1(0));
    }
}
