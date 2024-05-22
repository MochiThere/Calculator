
package core.models.calculator;

import core.models.Operation;
import core.models.calculator.storage.History;


public class Calculator {
    
    private Operation operator;

    public Calculator() {
        
    }

    public void setOperator(Operation operator) {
        this.operator = operator;
    }
    
    public double execute( double a, double b ){
        // Actualizar los valores para la ejecucion
        this.operator.setNum1(a);
        this.operator.setNum2(b);
        
        // Realizar la operacion y agregarla al historial
        double result =  this.operator.operate();
        History history = History.getInstance();
        history.addOperation(operator);
        
        return result;
    }
    
}
