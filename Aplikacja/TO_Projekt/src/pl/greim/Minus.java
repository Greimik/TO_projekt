package pl.greim;

public class Minus implements Calculate {
    @Override
    public double calculate(double firstFactor, double secondFactor) {
        return firstFactor - secondFactor;
    }
}
