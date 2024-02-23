package observer;

import java.math.BigDecimal;

public class Main {


    public static void main(String[] args) {
        PriceWebSite priceWebSite = new PriceWebSite();
        Observer egyObserver = new EgyStock(priceWebSite);


        priceWebSite.setPhonePrice(BigDecimal.valueOf(1000));
        priceWebSite.setPcPrice(BigDecimal.valueOf(1500));

        Observer ksaObserver = new KsaStock(priceWebSite);

        priceWebSite.setPhonePrice(BigDecimal.valueOf(2000));
        priceWebSite.setPcPrice(BigDecimal.valueOf(3000));

        priceWebSite.unRegisterObserver(ksaObserver);


        priceWebSite.setPhonePrice(BigDecimal.valueOf(50));
        priceWebSite.setPcPrice(BigDecimal.valueOf(50));

    }
}
