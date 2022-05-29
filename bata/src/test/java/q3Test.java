import org.testng.annotations.Test;
import static org.junit.Assert.*;

    public class q3Test {

        @org.testng.annotations.Test
        public void case1(){
            q3 one = new q3();
            String inputs = "abadacaad";
            String output = "Current state: Normal_Display, Time  Date: 1 - 1 - 2000  Time: 00:00";
            assertEquals( output , one.q3(inputs));
        }

        @org.testng.annotations.Test
        public void case2(){
            q3 two = new q3();
            String inputs = "cbababababa";
            String output = "Current state: Normal_Display, Time  Date: 2 - 2 - 2001  Time: 01:01";
            assertEquals( output , two.q3(inputs));
        }

        // Case3 and Case4 - ADUP testing
        @org.testng.annotations.Test
        public void case3(){
            q3 three = new q3();
            String inputs = "cbbabbbaaaa";
            String output = "Current state: Normal_Display, Time  Date: 1 - 1 - 2000  Time: 03:02";
            assertEquals( output , three.q3(inputs));
        }

        @Test
        public void case4(){
            q3 four = new q3();
            String inputs = "caabbabbbbabbba";
            String output = "Current state: Normal_Display, Time  Date: 3 - 5 - 2003  Time: 00:00";
            assertEquals( output , four.q3(inputs));
        }
    }

