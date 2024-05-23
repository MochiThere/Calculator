package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.Operation;
import core.models.calculator.Calculator;
import core.models.calculator.storage.History;
import core.models.operations.Add;
import core.models.operations.Divide;
import core.models.operations.Multiply;
import core.models.operations.Potency;
import core.models.operations.Substract;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class OperationController {

    private static final Operation add = new Add();
    private static final Operation subs = new Substract();
    private static final Operation mult = new Multiply();
    private static final Operation divide = new Divide();
    private static final Operation potency = new Potency();

    private static final Calculator calc = Calculator.getInstance();
    private static double lastResult;

    public static Response exec_add(String number1, String number2) {
        try {
            double num1, num2;

            // Check if any field is empty
            if (number1.equals("") || number2.equals("")) {
                return new Response("Syntax Error\n- Note: [Look again :D, there may be an empty field] ", Status.BAD_REQUEST);
            }
            // Check number of decimals
            if (!checkDecimals(number1) || !checkDecimals(number2)) {
                return new Response("Syntax Error\n - Note: [Please verify the number of decimals]", Status.BAD_REQUEST);
            }
            // Check if any field contains a letter or couldn't be parsed
            try {
                num1 = Double.parseDouble(number1);
                num2 = Double.parseDouble(number2);

                calc.setOperator(add);
                lastResult = calc.execute(num1, num2);
                return new Response("Succesfully Operated", Status.OK);

            } catch (NumberFormatException e) {
                return new Response("Syntax Error\n- Note: [Remember decimal numbers might use '.' not ',']\n- Note: [Check again for any unexpected letter]", Status.BAD_REQUEST);
            }

        } catch (Exception e) {
            return new Response("Unexpected Error", Status.BAD_REQUEST);
        }
    }

    public static Response exec_subs(String number1, String number2) {
        try {
            double num1, num2;

            // Check if any field is empty
            if (number1.equals("") || number2.equals("")) {
                return new Response("Syntax Error\n- Note: [Look again :D, there may be an empty field] ", Status.BAD_REQUEST);
            }
            if (!checkDecimals(number1) || !checkDecimals(number2)) {
                return new Response("Syntax Error\n - Note: [Please verify the number of decimals]", Status.BAD_REQUEST);
            }
            // Check if any field contains a letter or couldn't be parsed
            try {
                num1 = Double.parseDouble(number1);
                num2 = Double.parseDouble(number2);

                calc.setOperator(subs);
                lastResult = calc.execute(num1, num2);
                return new Response("Succesfully Operated", Status.OK);

            } catch (NumberFormatException e) {
                return new Response("Syntax Error\n- Note: [Remember decimal numbers might use '.' not ',']\n- Note: [Check again for any unexpected letter]", Status.BAD_REQUEST);
            }

        } catch (Exception e) {
            return new Response("Unexpected Error", Status.BAD_REQUEST);
        }
    }

    public static Response exec_multiply(String number1, String number2) {
        try {
            double num1, num2;

            // Check if any field is empty
            if (number1.equals("") || number2.equals("")) {
                return new Response("Syntax Error\n- Note: [Look again :D, there may be an empty field] ", Status.BAD_REQUEST);
            }
            if (!checkDecimals(number1) || !checkDecimals(number2)) {
                return new Response("Syntax Error\n - Note: [Please verify the number of decimals]", Status.BAD_REQUEST);
            }
            // Check if any field contains a letter or couldn't be parsed
            try {
                num1 = Double.parseDouble(number1);
                num2 = Double.parseDouble(number2);

                calc.setOperator(mult);
                lastResult = calc.execute(num1, num2);
                return new Response("Succesfully Operated", Status.OK);

            } catch (NumberFormatException e) {
                return new Response("Syntax Error\n- Note: [Remember decimal numbers might use '.' not ',']\n- Note: [Check again for any unexpected letter]", Status.BAD_REQUEST);
            }

        } catch (Exception e) {
            return new Response("Unexpected Error", Status.BAD_REQUEST);
        }
    }

    public static Response exec_div(String number1, String number2) {
        try {
            double num1, num2;

            // Check if any field is empty
            if (number1.equals("") || number2.equals("")) {
                return new Response("Syntax Error\n- Note: [Look again :D, there may be an empty field] ", Status.BAD_REQUEST);
            }
            if (!checkDecimals(number1) || !checkDecimals(number2)) {
                return new Response("Syntax Error\n - Note: [Please verify the number of decimals]", Status.BAD_REQUEST);
            }
            // Check if any field contains a letter or couldn't be parsed
            try {
                num1 = Double.parseDouble(number1);
                num2 = Double.parseDouble(number2);

                if (num2 == 0) {
                    return new Response("Math Error\n- Note: [Division by 0 is indeterminated]", Status.BAD_REQUEST);
                }
                calc.setOperator(divide);
                lastResult = calc.execute(num1, num2);
                return new Response("Succesfully Operated", Status.OK);

            } catch (NumberFormatException e) {
                return new Response("Syntax Error\n- Note: [Remember decimal numbers might use '.' not ',']\n- Note: [Check again for any unexpected letter]", Status.BAD_REQUEST);
            }

        } catch (Exception e) {
            return new Response("Unexpected Error", Status.BAD_REQUEST);
        }
    }

    public static Response exec_potency(String number1, String number2) {
        try {
            double num1, num2;

            // Check if any field is empty
            if (number1.equals("") || number2.equals("")) {
                return new Response("Syntax Error\n- Note: [Look again :D, there may be an empty field] ", Status.BAD_REQUEST);
            }

            if (!checkDecimals(number1)) {
                return new Response("Syntax Error\n - Note: [Please verify the number of decimals]", Status.BAD_REQUEST);
            }

            if (number2.contains(".")) {
                return new Response("System Error\n - Note: [Division by double not supported]", Status.NOT_IMPLEMENTED);
            }

            // Check if any field contains a letter or couldn't be parsed
            try {
                num1 = Double.parseDouble(number1);
                num2 = Double.parseDouble(number2);

                if (num2 == 0) {
                    lastResult = 1;
                    return new Response("Succesfully Operated", Status.OK);
                } else if (num2 < 0) {
                    return new Response("System Error\n - Note: [Division by negative numbers not supported]", Status.NOT_IMPLEMENTED);
                }
                calc.setOperator(potency);
                lastResult = calc.execute(num1, num2);
                return new Response("Succesfully Operated", Status.OK);

            } catch (NumberFormatException e) {
                return new Response("Syntax Error\n- Note: [Remember decimal numbers might use '.' not ',']\n- Note: [Check again for any unexpected letter]", Status.BAD_REQUEST);
            }

        } catch (Exception e) {
            return new Response("Unexpected Error", Status.BAD_REQUEST);
        }
    }

    public static boolean checkDecimals(String floatnumber) {
        int indexComma = floatnumber.indexOf('.');

        if (indexComma == -1) {
            return true;
        } else {
            return (floatnumber.length() - indexComma - 2 < 3);
        }
    }

    public static Response update(JList list) {
        try {
            ArrayList<Operation> operationHistory = History.getInstance().getOperations();
            
            if ( operationHistory.isEmpty() ){
                return new Response("Event Error\n - Note: [It appeals to be no elements in the history]", Status.BAD_REQUEST);
            }
            
            Collections.reverse(operationHistory);
            DefaultListModel model = new DefaultListModel();
            model.addAll(operationHistory);
            list.setModel(model);
            
            return new Response("Sucessfully loaded operations history", Status.OK);

        } catch (Exception e) {
            return new Response("Unexpected Error", Status.BAD_REQUEST);
        }
    }

    public static double getLastResult() {
        return lastResult;
    }

}
