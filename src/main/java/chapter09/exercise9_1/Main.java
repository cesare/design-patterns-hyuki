package chapter09.exercise9_1;

import chapter09.StringDisplayImpl;

public class Main {
    public static void main(String[] args) {
        RandomDisplay d = new RandomDisplay(new StringDisplayImpl("Hello, Universe."));
        
        d.display();
        d.randomDisplay(5);
    }
}
