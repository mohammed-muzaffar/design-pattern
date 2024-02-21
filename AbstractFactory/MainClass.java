
public class MainClass {

    public static void main(String[] args) {
        Factory europeFactory = new EuropeRegion();
        europeFactory.countryRegion("UK");

        Factory asiaFactory = new AsiaRegion();
        asiaFactory.countryRegion("india");
    }
}
