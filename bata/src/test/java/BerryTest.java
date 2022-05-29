import org.junit.Test;

import static org.junit.Assert.*;

    public class BerryTest {
        @Test
        public void piecesineven()
        {
            Berry b1 = new Berry();
            assertEquals("yes",b1.isEven(12));
        }
        @Test
        public void nopiecesinodd()
        {
            Berry b1 = new Berry();
            assertEquals("no",b1.isEven(0));
        }
        @Test
        public void piecesinnegative()
        {
            Berry b1 = new Berry();
            assertEquals("no",b1.isEven(-5));
        }
        @Test
        public void tooheavyberry()
        {
            Berry b1 = new Berry();
            assertEquals("no",b1.isEven(16));
        }
        @Test
        public void piecesinodd()
        {
            Berry b1 = new Berry();
            assertEquals("no",b1.isEven(5));
        }
}