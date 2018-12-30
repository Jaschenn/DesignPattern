package com.jasmine.观察者模式;

import java.util.ArrayList;
import java.util.List;

public class Stocks {
    private int currentPrice = 0;
    private List<Shareholder> shareholders = new ArrayList<Shareholder>();
    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
        this.shareholdersNotify(this.currentPrice);
    }
    public void attach(Shareholder shareholder){
        shareholders.add(shareholder);
    }
    public void detach(Shareholder shareholder){
        shareholders.remove(shareholder);
    }
    public void shareholdersNotify(int currentPrice){
        for (Shareholder s :
                shareholders) {
            if(currentPrice<0){
                s.afterDecrease();
            }else {
                s.afterRise();
            }

        }
    }
}
