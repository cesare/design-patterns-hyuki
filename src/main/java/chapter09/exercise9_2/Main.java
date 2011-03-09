package chapter09.exercise9_2;

import chapter09.Display;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java chapter09.exercise9_2.Main filename");
            return;
        }
        
        String filename = args[0];
        Display d = new Display(new FileDisplayImpl(filename));
        
        d.display();
    }
}
