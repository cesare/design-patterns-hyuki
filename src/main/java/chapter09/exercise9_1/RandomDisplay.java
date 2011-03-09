package chapter09.exercise9_1;

import chapter09.CountDisplay;
import chapter09.DisplayImpl;

public class RandomDisplay extends CountDisplay {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }
    
    public void randomDisplay(int times) {
        multiDisplay(chooseCount(times));
    }
    
    private int chooseCount(int max) {
        return (int)(Math.random() * max);
    }
}
