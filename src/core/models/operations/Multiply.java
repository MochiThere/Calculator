
package core.models.operations;

import core.models.Operation;

public class Multiply extends Operation {

    public Multiply(double num1, double num2) {
        super(num1, num2);
        this.operator = "x";
    }
    
    @Override
    public double operate() {
        return num1 * num2;
    }
    
}
