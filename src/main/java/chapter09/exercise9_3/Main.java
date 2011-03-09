package chapter09.exercise9_3;

public class Main {
    public static void main(String[] args) {
        IncrementalDisplay d1 = new IncrementalDisplay(new CharDisplayImpl('<', '*', '>'));
        IncrementalDisplay d2 = new IncrementalDisplay(new CharDisplayImpl('|', '#', '-'));
        
        d1.incrementalDisplay(4);
        d2.incrementalDisplay(7);
    }
}
