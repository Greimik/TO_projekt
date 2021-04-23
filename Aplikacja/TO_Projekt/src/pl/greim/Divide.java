package pl.greim;

public class Divide implements Calculate {
    @Override
    public double calculate(double firstFactor, double secondFactor) {
        return firstFactor / secondFactor;
    }
}
