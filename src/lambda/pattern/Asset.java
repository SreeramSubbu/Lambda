package lambda.pattern;

/**
 *
 * @author ramudu
 */
public class Asset {

    public enum AssetType {
        STOCK, BOND
    };
    public final AssetType type;
    private final int value;

    public Asset(AssetType type, int value) {
        this.type = type;
        this.value = value;
    }

    public AssetType getType() {
        return type;
    }

    public int getValue() {
        return value;
    }
}
