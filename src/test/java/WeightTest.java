import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class WeightTest
{
    @Test
    void shouldNotBeWeightWhenValueIsNegative()
    {
        assertThrows(Exception.class, () -> Weight.inGram(-1));
    }


}
