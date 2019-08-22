import calculators.ArrayCalculator;
import calculators.BigIntCalculator;

import java.math.BigInteger;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int argument;
        ArrayCalculator arrayCalculator = new ArrayCalculator();
        Scanner scanner = new Scanner(System.in);
        argument = scanner.nextInt();
        switch (argument){
            case 1:
                BigInteger firstNumber = scanner.nextBigInteger();
                BigInteger secondNumber = scanner.nextBigInteger();
                System.out.println(BigIntCalculator.multiplyBigInteger(firstNumber,secondNumber));
                break;
            case 2:
                String firstNumberInString = scanner.next();
                String secondNumberInString = scanner.next();
                System.out.println(arrayCalculator.multiplyArray(firstNumberInString, secondNumberInString));
                break;
            default:
                System.out.println("Sorry argument is wrong.");
        }
    }
}
