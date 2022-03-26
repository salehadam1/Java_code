package gmit.ie;

public class Multiplication extends Operator{

    public Multiplication() {
        super("*");
    }

    @Override
    public double operate(double operand1, double operand2) {
        return operand1 * operand2;
    }
}
