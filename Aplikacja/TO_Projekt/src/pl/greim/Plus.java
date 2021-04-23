package pl.greim;

public class Plus implements Calculate {
    @Override
    public double calculate(double firstFactor, double secondFactor) {
        return firstFactor + secondFactor;
    }
}
