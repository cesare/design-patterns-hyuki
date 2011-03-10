package chapter04.exercise4_2;

import chapter04.framework.Factory;
import chapter04.framework.Product;
import chapter04.idcard.IndexedIDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IndexedIDCardFactory();
        Product card1 = factory.create("結城浩");
        Product card2 = factory.create("とむら");
        Product card3 = factory.create("佐藤花子");
        card1.use();
        card2.use();
        card3.use();
    }
}
