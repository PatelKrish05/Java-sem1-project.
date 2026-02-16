class Hotel {
    String name;
    double dayPrice;
    double nightPrice;

    Hotel(String name, double dayPrice, double nightPrice) {
        this.name = name;
        this.dayPrice = dayPrice;
        this.nightPrice = nightPrice;
    }

    void show() {
        System.out.println(name + " | Day ₹" + dayPrice + " | Night ₹" + nightPrice);
    }
}