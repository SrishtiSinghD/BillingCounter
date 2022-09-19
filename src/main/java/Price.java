public enum Price {
    ONION(20),
    TOMATO(30),
    KIWI(200),
    APPLE(50),
    SALT(10000),
    RICE(34.5);

    private final double price;

    Price(double i) {
        price = i;
    }

    double cost(double value){return this.price * value;}
}

