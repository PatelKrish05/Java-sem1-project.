class Route {
    String fromCity;
    String toCity;

    Route(String from, String to) {
        fromCity = from;
        toCity = to;
    }

    void show() {
        System.out.println(fromCity + " -> " + toCity);
    }
}
