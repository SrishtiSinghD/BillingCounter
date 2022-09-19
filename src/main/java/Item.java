public class Item
{

    private final Price price;
    private final Weight weight;

    private Item(Weight weight, Price price) {
        this.weight = weight;
        this.price = price;
    }

    public static Item onion(Weight value)
    {
        return new Item(value,Price.ONION);
    }

    public static Item tomato(Weight value)
    {
        return new Item(value,Price.TOMATO);
    }

    public static Item kiwi(Weight value)
    {
        return new Item(value,Price.KIWI);
    }

    public static Item apple(Weight value)
    {
        return new Item(value,Price.APPLE);
    }

    public static Item salt(Weight value)
    {
        return new Item(value,Price.SALT);
    }

    public static Item rice(Weight value)
    {
        return new Item(value,Price.RICE);
    }

    public double cost()
    {
        return this.price.cost(this.weight.convertToBase());
    }

}
