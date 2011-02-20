package chapter04.exercise4_2;

import chapter04.framework.Factory;
import chapter04.framework.Product;
import chapter04.idcard.IndexedIDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IndexedIDCardFactory();
        Product card1 = factory.create("����_");
        Product card2 = factory.create("�Ƃނ�");
        Product card3 = factory.create("�����Ԏq");
        card1.use();
        card2.use();
        card3.use();
    }
}
