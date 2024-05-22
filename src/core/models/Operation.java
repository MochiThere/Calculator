
package core.models;


public abstract class Operation {
    
    protected double num1;
    protected double num2;
    protected String operator;

    public Operation() {
    }
    
    public abstract double operate();

    @Override
    public String toString() {
        return String.format(" %.3f %s %.3f = %.3f ", num1, operator, num2, operate());
    }
    
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    
    
}
