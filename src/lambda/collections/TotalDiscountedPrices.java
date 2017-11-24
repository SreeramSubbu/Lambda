package lambda.collections;

import java.util.ArrayList;

/**
 *
 * @author ramudu
 */
public class TotalDiscountedPrices {

    ArrayList<Double> prices;

    public void TotalDiscountedPrices(ArrayList<Double> prices) {
        this.prices = prices;

    }

    public Double calculatedPrice() {
        return this.prices.stream()
                .filter(price -> price.compareTo(20.0) > 0)
                .map(price -> price * 0.9)
                .reduce(0.0, Double::sum);

    }

}
