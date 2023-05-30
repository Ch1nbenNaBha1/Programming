package Java.lib;

import Java.Code.SimpleCalculator;
import org.junit.*;

public class SimpleCalculatorTest {
    @Test
    void ADD() {
        assert SimpleCalculator.ADD(1, 2) == 3;
    }

    @Test
    void SUB() {
        assert SimpleCalculator.SUB(1, 2) == -1;
    }

    @Test
    void MUL() {
        assert SimpleCalculator.MUL(1, 2) == 2;
    }

    @Test
    void DIV() {
        assert SimpleCalculator.DIV(1, 2) == 0;
    }

    @Test
    void MOD() {
        assert SimpleCalculator.MOD(1, 2) == 1;
    }

    @Test
    void POW() {
        assert SimpleCalculator.POW(1, 2) == 1;
    }

}
