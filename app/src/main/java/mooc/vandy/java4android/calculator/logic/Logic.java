package mooc.vandy.java4android.calculator.logic;

import android.widget.Switch;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }


    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;

    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        switch (operation){
            case ADDITION:Add a=new Add();
                a.Addition(argumentOne,argumentTwo);
                mOut.print(a.AddResult());
                break;
            case SUBTRACTION:Subtract s=new Subtract();
                s.difference(argumentOne,argumentTwo);
                mOut.print(s.SubResult());
                break;
            case MULTIPLICATION:Multiply m=new Multiply();
                m.multiply(argumentOne,argumentTwo);
                mOut.print(m.MulResult());
                break;
            case DIVISION:Divide d=new Divide();
                d.division(argumentOne,argumentTwo);
                mOut.print(d.DivResult());
                break;
            default:mOut.print("INVALID CHOICE");
        }
    }
}
