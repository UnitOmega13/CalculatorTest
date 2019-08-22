import calculators.ArrayCalculator;
import calculators.BigIntCalculator;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

class CalculatorTest {

    @Test
    void main() {
        String s =  "15935748623571594862";
        String s2 =  "123456789123456789987654321987564321";
        BigInteger bigIntegerFirst = new BigInteger(s2);
        BigInteger bigIntegerSecond = new BigInteger(s);
        System.out.println(BigIntCalculator.multiplyBigInteger(bigIntegerFirst, bigIntegerSecond));
        System.out.println(ArrayCalculator.multiplyArray(s2, s));
    }
}