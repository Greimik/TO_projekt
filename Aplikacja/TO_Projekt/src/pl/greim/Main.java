package pl.greim;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double firstFactor = 10;
        double secondFactor = 5;

        calculator.setCalculateStrategy(new Plus());
        System.out.println(calculator.calculate(firstFactor, secondFactor));

        calculator.setCalculateStrategy(new Minus());
        System.out.println(calculator.calculate(firstFactor, secondFactor));

        calculator.setCalculateStrategy(new Divide());
        System.out.println(calculator.calculate(firstFactor, secondFactor));

        calculator.setCalculateStrategy(new Multiply());
        System.out.println(calculator.calculate(firstFactor, secondFactor));
    }
}
