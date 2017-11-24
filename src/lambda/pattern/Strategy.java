package lambda.pattern;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author ramudu
 */
public class Strategy {

    public static int totalAsset(final List<Asset> assets, final Predicate<Asset> selector) {
        return assets.stream()
                .filter(selector)
                .mapToInt(Asset::getValue)
                .sum();
    }

}
