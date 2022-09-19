import exceptions.NegativeWeightException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BillingCounterTest
{
    @Test
    void shouldAddItemToTheCart() throws NegativeWeightException {
        BillingCounter counter = new BillingCounter();

        counter.add(Item.onion(Weight.inGram(200)));
        counter.add(Item.apple(Weight.inKilogram(1)));
        counter.add(Item.rice(Weight.inKilogram(3)));

        assertEquals(313.50, counter.bill(), 0.001);
    }
}
