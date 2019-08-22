package calculators;

import java.util.Arrays;

public class ArrayCalculator {
    public static String multiplyArray(String firstNumber, String secondNumber) {
        int firstArraySize = firstNumber.length();
        int secondArraySize = secondNumber.length();
        int[] firstNumberArray = new int[firstArraySize];
        int[] secondNumberArray = new int[secondArraySize];
        int multiplysize = secondNumberArray.length;
        int size = firstNumberArray.length;
        StringBuilder result = new StringBuilder();
        for (int index = 0; index <= firstArraySize - 1; index++) {
            firstNumberArray[index] = Integer.parseInt(String.valueOf(firstNumber.charAt(index)));
        }
        for (int index = 0; index <= secondArraySize - 1; index++) {
            secondNumberArray[index] = Integer.parseInt(String.valueOf(secondNumber.charAt(index)));
        }

        int[] operationResult = new int[size + multiplysize - 1];
        for (int operation = 0; operation <= size - 1; operation++) {
            for (int arrayindex = 0; arrayindex <= multiplysize - 1; arrayindex++) {
                operationResult[arrayindex + operation] = operationResult[arrayindex + operation] +
                        (firstNumberArray[operation] * secondNumberArray[arrayindex]);
            }
        }
        reverse(operationResult);
        for (int index = 0; index <= operationResult.length - 1; index++) {
            if (operationResult[index] > 9 && index <= operationResult.length - 2) {
                int temp = operationResult[index] / 10;
                operationResult[index] = operationResult[index] - temp * 10;
                operationResult[index + 1] += temp;
            }
        }
        reverse(operationResult);
        Arrays.stream(operationResult).forEach(result::append);
        return result.toString();
    }

    private static void reverse(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
    }

}
