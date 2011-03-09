package chapter09.exercise9_3;

import chapter09.CountDisplay;
import chapter09.DisplayImpl;

public class IncrementalDisplay extends CountDisplay {

    public IncrementalDisplay(DisplayImpl impl) {
        super(impl);
    }
    
    public void incrementalDisplay(int times) {
        for (int i = 0; i < times; i++) {
            multiDisplay(i);
        }
    }
}
