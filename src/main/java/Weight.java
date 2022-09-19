import exceptions.NegativeWeightException;

public class Weight {
    private final double weight;
    private final Measure measure;


    private Weight(double weight, Measure measure) throws NegativeWeightException {
        if (weight < 0)
            throw new NegativeWeightException();
        
        this.weight = weight;
        this.measure = measure;
    }

    public static Weight inKilogram(double value) throws NegativeWeightException{
        return new Weight(value , Measure.KILOGRAM);
    }

    public static Weight inGram(double value) throws NegativeWeightException{
        return new Weight(value , Measure.GRAM);
    }

    double convertToBase()
    {
        return measure.convertToBase(weight);
    }

}
