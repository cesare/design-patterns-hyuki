package chapter04.idcard;

import java.util.HashMap;
import java.util.Map;

import chapter04.framework.Factory;
import chapter04.framework.Product;

public class IndexedIDCardFactory extends Factory {
    private Map<Integer,String> indexedOwners = new HashMap<Integer,String>();
    private int currentIndex = 0;
    
    @Override
    protected Product createProduct(String owner) {
        return new IndexedIDCard(currentIndex++, owner);
    }

    @Override
    protected void registerProduct(Product product) {
        IndexedIDCard card = (IndexedIDCard)product;
        indexedOwners.put(card.getIndex(), card.getOwner());
    }
    
    public Map<Integer,String> getIndexedOwners() {
        return indexedOwners;
    }
}
