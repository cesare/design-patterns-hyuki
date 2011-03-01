package chapter06;

import chapter06.framework.Manager;
import chapter06.framework.Product;

public class Main {
    public static void main(String[] args) {
        Manager manager = prepare();
        
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        
        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        
        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }
    
    private static Manager prepare() {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);
        
        return manager;
    }
}
