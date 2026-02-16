class Transport extends Route {
    String type;
    double price;
    boolean booked;

    Transport(String from, String to, String type, double price) {
        super(from, to);
        this.type = type;
        this.price = price;
    }

    void showTransport() {
        System.out.println(fromCity + " -> " + toCity + " | " + type + " | ₹" + price);
    }
}