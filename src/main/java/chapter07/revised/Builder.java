package chapter07.revised;

public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
    
    protected StringBuffer buffer = new StringBuffer();

    public String getResult() {
        return buffer.toString();
    }
}
