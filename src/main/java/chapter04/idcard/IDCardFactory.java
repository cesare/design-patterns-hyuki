package chapter04.idcard;

import java.util.ArrayList;
import java.util.List;

import chapter04.framework.Factory;
import chapter04.framework.Product;

public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<String>();
    
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
    
    public List<String> getOwners() {
        return owners;
    }
}
