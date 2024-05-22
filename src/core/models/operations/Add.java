
package core.models.operations;

import core.models.Operation;

public class Add extends Operation {

    public Add() {
        this.operator = "+";
    }
    
    @Override
    public double operate() {
        return num1 + num2;
    }
    
}
