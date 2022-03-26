package gmit.ie;

public abstract class Operator implements Mathematical_Operation{
    public final String operator;

    public Operator() {
        this("+");
    }

    public  Operator(String operator) {
        this.operator = operator;
    }
    @Override
    public boolean matches(String toCheckFor) {
        return this.operator.equals(toCheckFor);
    }
    @Override
    public double operate(double operand1, double operand2) {
        return operand1 + operand2;
    }
}
