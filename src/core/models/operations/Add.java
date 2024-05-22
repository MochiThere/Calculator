
package core.models.operations;

import core.models.Operation;

public class Add extends Operation {

    public Add(double num1, double num2) {
        super(num1, num2);
        this.operator = "+";
    }
    
    @Override
    public double operate() {
        return num1 + num2;
    }
    
}
