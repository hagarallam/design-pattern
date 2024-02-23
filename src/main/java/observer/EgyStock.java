package observer;

import java.math.BigDecimal;

public class EgyStock extends Stock implements Observer{
    private BigDecimal phonePrice;
    private BigDecimal pcPrice ;

    private int observerId ;


    public EgyStock(Subject priceWebSite) {
        super(priceWebSite);
        this.observerId = ++OBSERVER_COUNT;
        super.getPriceWebSite().registerObserver(this);
        System.out.println("New Subscriber with an Id "+ this.observerId );


    }

    @Override
    public void update(BigDecimal phonePrice, BigDecimal pcPrice) {
        this.phonePrice = phonePrice;
        this.pcPrice = pcPrice;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Current prices in EgyStock{" +
                "phonePrice=" + phonePrice +
                ", pcPrice=" + pcPrice +
                ", observerId=" + observerId +
                '}';
    }
}
