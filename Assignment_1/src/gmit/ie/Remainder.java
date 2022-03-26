package gmit.ie;

public class Remainder extends Operator{

    public Remainder() {
        super("%");
    }

    @Override
    public double operate(double operand1, double operand2) {
        return operand1 % operand2;
    }
}
