
package core.models.operations;

import core.models.Operation;


public class Potency extends Operation{

    @Override
    public double operate() {
        
        double acum = 1;
        
        for (int i = 0; i < num2; i++) {
            acum = acum * num1;
        }
        
        return acum;
    }
    
    public Potency(){
        this.operator = "^";
    }

}
