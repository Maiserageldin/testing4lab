
    import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
    public class coffeeTest {
        @Test
        public void test1() {
            coffee c = new coffee();
            assertEquals("turn it on,please", c.addCoins(30));
        }
        @Test
        public void test2() {
            coffee c = new coffee();
            c.power = true;
            assertEquals("Error", c.UseCoffeeMachine());
        }
        @Test
        public void test3() {
            coffee c = new coffee();
            c.UseCoffeeMachine();
            c.StopTheMachine();
            assertEquals("turn it on,please", c.addCoins(30));
        }
        @Test
        public void test4() {
            coffee c = new coffee();
            c.UseCoffeeMachine();
            assertEquals("Thank you for purchasing coffee", c.addCoins(30));
        }
        @Test
        public void test5(){
            coffee c = new coffee();
            assertEquals("Power on" + "Lights on",c.UseCoffeeMachine());
            assertEquals("Thank you for purchasing coffee",c.addCoins(30));
            assertEquals("Lights off" + "Power off",c.StopTheMachine());
        }
        @Test
        public void test6(){
            coffee c = new coffee();
            assertEquals("turn it on,please",c.UseCoffee(2));
        }
        @Test
        public void test7(){
            coffee c = new coffee();
            assertEquals("Power on" + "Lights on",c.UseCoffeeMachine());
            assertEquals("Thank you for purchasing coffee",c.addCoins(30));
            assertEquals(3 + "Here you go the coffee",c.UseCoffee(3));
        }
        @Test
        public void test8(){
            coffee c = new coffee();
            assertEquals("Power on" + "Lights on",c.UseCoffeeMachine());
            assertEquals("Thank you for purchasing coffee",c.addCoins(30));
            assertEquals(1 + "Here you go the coffee",c.UseCoffee(1));
        }
    }
