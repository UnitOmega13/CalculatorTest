package calculators;

import java.math.BigInteger;

public class BigIntCalculator {
    public static String multiplyBigInteger(BigInteger firstNumber, BigInteger secondNumber){
        return String.valueOf(firstNumber.multiply(secondNumber));
    }
}
