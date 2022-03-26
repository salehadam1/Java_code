package gmit.ie;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculator calc1 = new Calculator(4,3,"*");
        Double result = calc1.operate();
        System.out.println(result);
    }
}
