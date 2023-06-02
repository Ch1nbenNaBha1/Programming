
package lib;

import Java.Code.SimpleCalculator;
import org.junit.*;

public class SimpleCalculatorTest {
    @Test
    public void ADD() {
        new SimpleCalculator();
        assert SimpleCalculator.ADD(1, 2) == 3;
    }

    @Test
    public void SUB() {
        assert SimpleCalculator.SUB(1, 2) == -1;
    }

    @Test
    public void MUL() {
        assert SimpleCalculator.MUL(1, 2) == 2;
    }

    @Test
    public void DIV() {
        assert SimpleCalculator.DIV(1, 2) == 0;
    }

    @Test
    public void MOD() {
        assert SimpleCalculator.MOD(1, 2) == 1;
    }

    @Test
    public void POW() {

        assert SimpleCalculator.POW(1, 2) == 1;
    }

}
