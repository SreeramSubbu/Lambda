package lambda.pattern;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author ramudu
 */
public class StrategyTest {

    public StrategyTest() {
    }

    @Test
    public void testTotalAsset() {
        List<Asset> assets = Arrays.asList(new Asset(Asset.AssetType.STOCK, 100), new Asset(Asset.AssetType.STOCK, 200), new Asset(Asset.AssetType.BOND, 20));
        System.out.println(Strategy.totalAsset(assets, asset -> asset.getType() == Asset.AssetType.STOCK));
        System.out.println(Strategy.totalAsset(assets, asset -> asset.getType() == Asset.AssetType.BOND));
    }

}
