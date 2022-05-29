import static org.junit.Assert.*;
import org.junit.Test;

    public class MinimaxTest{

        @Test
        public void case1(){
            Minimax one = new Minimax();
            int []Array = {1,3,4,5,7,50,6,0,15,12,21};
            int []output = {0,50};
            assertArrayEquals( output , one.Minimax(Array));
        }
        @Test
        public void case2(){
            Minimax two = new Minimax();
            int []Array = {1,3,4,5,7,50,6,0,15,12,21,-7,500};
            int []output = {-7,500};
            assertArrayEquals(output,two.Minimax(Array) );
        }
        @Test
        public void case3() {
            Minimax three = new Minimax();
            int[] Array = {20, 120, 116, 1021, 7, 187, 96, 2, 2479};
            int[] output = {2, 2479};
            assertArrayEquals(output, three.Minimax(Array));
        }
        @Test
        public void case4() {
            Minimax four = new Minimax();
            int[] Array = {1,8,19,2,21,54,20,10,11,8};
            int[] output = {1, 54};
            assertArrayEquals(output, four.Minimax(Array));
        }

        @Test
        public void case5(){
            Minimax five = new Minimax();
            int []Array = {1};
            int []output = {1,1};
            assertArrayEquals(output, five.Minimax(Array));
        }

    }

