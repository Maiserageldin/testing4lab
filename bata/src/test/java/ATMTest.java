import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ATMTest extends TestCase {
    ATM a;
    Take c;
    String d;
    Insert b;

    @BeforeEach
    public void init() {
        a = new ATM();
        b = new Insert();
        c = new Take();
    }
    class getMoney {
        double insert(double y){
            if(y>0)
                return y;
            else
                return 0;
        }
    }
    @Test
    public void stub1(){
        getMoney y = new getMoney();
        a.Run(2,y.insert(0.0));
        assertEquals(a.balance,0.0);
    }
    @Test
    public void stub2(){
        getMoney y = new getMoney();
        double z = c.withdraw(2000,y.insert(5000));
        assertEquals(z,3000.0);
    }
    @Test
    public void stub3(){
        getMoney y = new getMoney();
        double z = b.deposit(2000,y.insert(5000));
        assertEquals(z,7000.0);
    }
    @AfterEach
    public void clean(){
        a =null ;
    }
}

