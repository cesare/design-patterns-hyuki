package chapter06.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String, Product> showcase = new HashMap<String, Product>();
    
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }
    
    public Product create(String protoname) {
        Product p = showcase.get(protoname);
        return p.createClone();
    }
}
