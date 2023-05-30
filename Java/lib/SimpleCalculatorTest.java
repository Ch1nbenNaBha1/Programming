package Java.lib;

import Java.Code.SimpleCalculator;
import org.junit.*;

public class SimpleCalculatorTest {
    @Test
    public void ADD() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assert simpleCalculator.ADD(1, 2) == 3;
    }

    @Test
    public void SUB() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        assert simpleCalculator.SUB(1, 2) == -1;
    }

    @Test
    public void MUL() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assert simpleCalculator.MUL(1, 2) == 2;
    }

    @Test
    public void DIV() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assert simpleCalculator.DIV(1, 2) == 0;
    }

    @Test
    public void MOD() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assert simpleCalculator.MOD(1, 2) == 1;
    }

    @Test
    public void POW() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        assert simpleCalculator.POW(1, 2) == 1;
    }

}
