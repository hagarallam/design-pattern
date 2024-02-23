package observer;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PriceWebSite implements Subject{

    private BigDecimal phonePrice = BigDecimal.ZERO ;
    private BigDecimal pcPrice = BigDecimal.ZERO ;

    ArrayList<Observer> observers ;

    public PriceWebSite(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(this.phonePrice,this.pcPrice);
        }
    }
    public void setPhonePrice(BigDecimal phonePrice) {
        this.phonePrice = phonePrice;
        notifyObserver();
    }



    public void setPcPrice(BigDecimal pcPrice) {
        this.pcPrice = pcPrice;
        notifyObserver();
    }
}
