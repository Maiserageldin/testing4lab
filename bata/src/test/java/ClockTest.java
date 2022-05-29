
import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ClockTest extends TestCase {
    Clock1 x;
    String y;
    @Nested
    class bottomUp {
        @BeforeEach
        public void init() {
            x = new Clock1();
        }
        @Test
        public void Driver1(){
            y = x.enter('a');
            System.out.println("todays date is "+ y);
            assertEquals("todays date is "+ y,"todays date is "+ x.e +"-"+x.d +"-"+x.c);
        }
        @Test
        public void Driver2(){
            y = x.enter('a');
            y = x.enter('a');
            System.out.println("it is "+ y);
            assertEquals("it is "+ y,"it is "+ x.b +":"+x.a);
        }
        @Test
        public void Driver3(){
            Clock1 x = new Clock1();
            String[][] times = new String[5][2];
            x.enter('c');
            for(int i = 0 ; i < 5 ; i ++) {
                System.out.print(x.s3);
                times[i][0] = (x.ShowDate() + " " + x.ShowTime());
                x.enter('b');
                x.enter('a');
                times[i][1] = (x.ShowDate() + " " + x.ShowTime());
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(times[i][j] + " ");
                }
                System.out.println();
            }}
        @AfterEach
        public void delete(){
            x=null ;
        }
    }
}