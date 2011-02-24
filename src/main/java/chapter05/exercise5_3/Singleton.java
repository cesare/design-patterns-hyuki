package chapter05.exercise5_3;

public class Singleton {
    private static Singleton singleton = null;
    private Singleton() {
        System.out.println("�C���X�^���X�𐶐����܂����B");
    }
    
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized(singleton) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
