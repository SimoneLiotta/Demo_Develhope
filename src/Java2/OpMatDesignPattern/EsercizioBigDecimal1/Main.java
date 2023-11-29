package Java2.OpMatDesignPattern.EsercizioBigDecimal1;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("2.5");
        BigDecimal num2 = new BigDecimal("3.461");

        BigDecimal finalResult = aritmeticOperation(num1, num2, Operandi.DIVISIONE).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("Risultato: " + finalResult);

    }

    public static BigDecimal aritmeticOperation(BigDecimal num1, BigDecimal num2, Operandi operazione) {
        BigDecimal result = null;
        switch (operazione) {
            case MOLTIPLICAZIONE:
                result = num1.multiply(num2);
                break;
            case ADDIZIONE:
                result = num1.add(num2);
                break;
            case SOTTRAZIONE:
                result = num1.subtract(num2);
                break;
            case MAX:
                result = num1.max(num2);
                break;
            case MIN:
                result = num1.min(num2);
                break;
            case DIVISIONE: {
                if (num2.compareTo(new BigDecimal("0.0")) == 0) {
                    throw new ArithmeticException("Non si puo dividere per 0");
                } else {
                    result = num1.divide(num2, new MathContext(5));
                }
                break;
            }
        }

        return result;
    }
}
