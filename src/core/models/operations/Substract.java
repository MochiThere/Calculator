
package core.models.operations;

import core.models.Operation;

public class Substract extends Operation {

    public Substract() {
        this.operator = "-";
    }
    
    @Override
    public double operate() {
        return num1 - num2;
    }
    
}
