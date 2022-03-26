package gmit.ie;

public class Calculator{

    private final double operand1;
    private final double operand2;

    // The current operator
    private final Operator operator;

    // All possible operations
    private final Division division = new Division();
    private final Multiplication multiplication = new Multiplication();
    private final Subtraction subtraction = new Subtraction();
    private final Sum sum = new Sum();
    private final Remainder remainder = new Remainder();


    public Calculator(double operand1, double operand2, String operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;

        if (subtraction.matches(operator)) {
            this.operator = subtraction;
        } else if (multiplication.matches(operator)) {
            this.operator = multiplication;
        } else if (division.matches(operator)) {
            this.operator = division;
        }
        else if (remainder.matches(operator)) {
            this.operator = remainder;
        }
        else if (sum.matches(operator)) {
            this.operator = sum;
        } else {
            this.operator = sum;
        }
    }

    public double operate() {
        return operator.operate(operand1, operand2);
    }
}
