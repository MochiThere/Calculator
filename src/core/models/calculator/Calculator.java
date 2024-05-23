
package core.models.calculator;

import core.models.Operation;
import core.models.calculator.storage.History;


public class Calculator {
    
    private Operation operator;
    private static final Calculator instance = new Calculator();

    private Calculator() {
        
    }

    public void setOperator(Operation operator) {
        this.operator = operator;
    }
    
    public double execute( double a, double b ){
        // Refresh the numbers 
        this.operator.setNum1(a);
        this.operator.setNum2(b);
        
        // Do the operation and then add it to the history
        double result =  this.operator.operate();
        History history = History.getInstance();
        history.addOperation(operator);
        
        for (Operation op : history.getOperations()) {
            System.out.println(op);
        }
        
        return result;
    }
    
    
    
    public static Calculator getInstance() {
        return instance;
    }
    
}
