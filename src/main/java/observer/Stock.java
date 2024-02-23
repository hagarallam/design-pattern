package observer;

public abstract class Stock {

    public static int OBSERVER_COUNT = 0  ;

    private Subject priceWebSite;


    public Stock(Subject priceWebSite) {
        this.priceWebSite = priceWebSite;
    }

    public Subject getPriceWebSite() {
        return priceWebSite;
    }

}
