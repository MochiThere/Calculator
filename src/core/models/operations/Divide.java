
package core.models.operations;

import core.models.Operation;

public class Divide extends Operation {

    public Divide() {
        this.operator = "/";
    }
    
    @Override
    public double operate() {
        return num1 / num2;
    }
    
}
