package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    int quotient;
    int remainder;
    String result;
    public void division(int var1,int var2) {
        try {
            quotient = var1 / var2;
            remainder = var1 % var2;
            result = String.valueOf(quotient) + " R : " + remainder;
        } catch (ArithmeticException e) {
            result = "Divison by zero is not possible.";
        }
    }
    public String DivResult(){
        return result;
    }
    // TODO -- start your code here
}
