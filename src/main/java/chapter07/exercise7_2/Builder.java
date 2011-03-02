package chapter07.exercise7_2;

public abstract class Builder {
    private boolean titleMade = false;
    
    public final void makeTitle(String title) {
        if (titleMade) {
            throw new RuntimeException("attempted to make title twice.");
        }
        doMakeTitle(title);
        titleMade = true;
    }
    
    public final void makeString(String str) {
        if (! titleMade) {
            throw new RuntimeException("title has not been made yet.");
        }
        doMakeString(str);
    }
    
    public final void makeItems(String[] items) {
        if (! titleMade) {
            throw new RuntimeException("title has not been made yet.");
        }
        doMakeItems(items);
    }
    
    public final void close() {
        if (! titleMade) {
            throw new RuntimeException("title has not been made yet.");
        }
        doClose();
    }
    
    public abstract void doMakeTitle(String title);
    public abstract void doMakeString(String str);
    public abstract void doMakeItems(String[] items);
    public abstract void doClose();
}
