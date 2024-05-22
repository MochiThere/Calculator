
package core.models.calculator.storage;

import core.models.Operation;
import java.util.ArrayList;


public class History {
    
    private ArrayList<Operation> operations;
    private static History instance;
    
    private History ( ){
        this.operations = new ArrayList<>();
    }

    public static History getInstance() {
        return instance;
    }
    
    public ArrayList<Operation> getOperations() {
        return operations;
    }
    
    public void addOperation( Operation op ){
        this.operations.add(op);
    }
    
    public Operation getOperation( int index ){
        return this.operations.get(index);
    }
    
    
}
