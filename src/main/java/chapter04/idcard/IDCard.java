package chapter04.idcard;

import chapter04.framework.Product;

public class IDCard extends Product {
    private String owner;
    
    IDCard(String owner) {
        System.out.println(owner + "のカードを作ります。");
        this.owner = owner;
    }
    
    @Override
    public void use() {
        System.out.println(owner + "のカードを使います。");
    }
    
    public String getOwner() {
        return owner;
    }
}
