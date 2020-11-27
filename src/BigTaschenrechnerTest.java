import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.math.BigInteger;

public class BigTaschenrechnerTest {

    @Test
    public void TestFakultaetNegativeValue(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> BigTaschenrechner.fakultaet(-1));
    }

   @Test
    public void TestFakultaetZeroValue(){
        Assertions.assertEquals(BigInteger.ONE, BigTaschenrechner.fakultaet(0));
    }

    @Test
    public void TestFakultaetOneValue(){
        Assertions.assertEquals(BigInteger.valueOf(1), BigTaschenrechner.fakultaet(1));
    }

    @Test
    public void TestFakultaetFourValue(){
        Assertions.assertEquals(BigInteger.valueOf(24), BigTaschenrechner.fakultaet(4));
    }

    @Test
    public void TestFakultaetTwentyFiveValue(){
        Assertions.assertEquals(BigInteger.valueOf(3628800), BigTaschenrechner.fakultaet(10));
    }
}
