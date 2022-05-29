import org.junit.Test;

import static org.junit.Assert.*;

public class VasyaTest {
@Test
    public void isinequilbrium()
{
    Vasya v1 = new Vasya();
    assertEquals("it is not in equilibrium", v1.isequilibrium(3,-5,2));
}
@Test
    public void isnotinequilbrium()
    {
        Vasya v1 = new Vasya();
        assertEquals("it is not in equilibrium", v1.isequilibrium(4,1,7));
    }
    @Test
    public void isinequilbrium1()
    {
        Vasya v1 = new Vasya();
        assertEquals("it is in equilibrium", v1.isequilibrium(0,0,0));
    }
}