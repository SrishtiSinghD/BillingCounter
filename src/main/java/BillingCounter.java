public class BillingCounter {

    private double total;

    public void add(Item item) {
        total += item.cost();
    }

    public double bill()
    {
        return total;
    }
}
