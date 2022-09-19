public enum Measure {
    KILOGRAM(1),
    GRAM(0.001);

    private final double conversionFactor;

    Measure(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    double convertToBase(double value)
    {
        return this.conversionFactor * value;
    }
}
