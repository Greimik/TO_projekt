package pl.greim;

public class Calculator {
    private Calculate calculateStrategy;

    public double calculate(double firstFactor, double secondFactor) {
        return calculateStrategy.calculate(firstFactor, secondFactor);
    }

    public void setCalculateStrategy(Calculate calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }
}
