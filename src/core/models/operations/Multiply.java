
package core.models.operations;

import core.models.Operation;

public class Multiply extends Operation {

    public Multiply() {
        this.operator = "x";
    }
    
    @Override
    public double operate() {
        return num1 * num2;
    }
    
}
