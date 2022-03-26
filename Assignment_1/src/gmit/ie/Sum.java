package gmit.ie;

public class Sum extends Operator{

    public Sum() {
        super("+");
    }

    @Override
    public double operate(double operand1, double operand2) {
        return operand1 * operand2;
    }
}
