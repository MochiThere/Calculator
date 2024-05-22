
package core.models;


public abstract class Operation {
    
    protected double num1;
    protected double num2;
    protected String operator;

    public Operation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return String.format(" %.3f %s %-3f = %-3f ", num1, operator, num2, operate());
    }
    
    
    public abstract double operate();
    
}
