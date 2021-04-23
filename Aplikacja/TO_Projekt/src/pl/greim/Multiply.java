package pl.greim;

public class Multiply implements Calculate {
    @Override
    public double calculate(double firstFactor, double secondFactor) {
        return firstFactor * secondFactor;
    }
}
