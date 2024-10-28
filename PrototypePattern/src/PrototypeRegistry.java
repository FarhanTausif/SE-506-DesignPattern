import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private final Map<String, Product> cache = new HashMap<>();

    public PrototypeRegistry(){

    }

    public void addPrototype(String key, Product product){
        cache.put(key, product);
    }
    public Product getPrototype(String key) {
        return cache.get(key).clone();
    }
}
