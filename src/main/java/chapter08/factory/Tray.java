package chapter08.factory;

import java.util.ArrayList;

public abstract class Tray extends Item {
    protected ArrayList<Item> tray = new ArrayList<Item>();
    
    public Tray(String caption) {
        super(caption);
    }
    
    public void add(Item item) {
        tray.add(item);
    }
}
