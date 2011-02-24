package chapter05.exercise5_2;

public class Triple {
    private static int INSTANCE_COUNT = 3;
    private static Triple[] triples = new Triple[INSTANCE_COUNT];
    static {
        for (int i = 0; i < INSTANCE_COUNT; i++) {
            triples[i] = new Triple();
        }
    }
    
    public static Triple getInstance(int id) {
        return triples[id];
    }
    
    private Triple() {
    }
}
