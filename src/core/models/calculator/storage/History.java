
package core.models.calculator.storage;

import core.models.Operation;
import java.util.ArrayList;


public class History {
    
    private ArrayList<Operation> operations;
    private static final History instance = new History();
    
    private History ( ){
        operations = new ArrayList<>();
        System.out.println("Created History");
    }

    public static History getInstance() {
        System.out.println("Called");
        return instance;
    }
    
    public ArrayList<Operation> getOperations() {
        return operations;
    }
    
    public void addOperation( Operation op ){
        Operation actual = op.clone();
        operations.add(actual);
    }
    
    public Operation getOperation( int index ){
        return this.operations.get(index);
    }
    
    
}
