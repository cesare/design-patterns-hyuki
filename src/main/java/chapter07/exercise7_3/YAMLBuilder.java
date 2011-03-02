package chapter07.exercise7_3;

public class YAMLBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();
    
    @Override
    public void makeTitle(String title) {
        buffer.append("title: "+ title);
        appendNewline();
    }

    @Override
    public void makeString(String str) {
        buffer.append(str + ":");
        appendNewline();
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            buffer.append("  - " + item);
            appendNewline();
        }
    }

    @Override
    public void close() {
    }
    
    public String getResult() {
        return buffer.toString();
    }
    
    
    private void appendNewline() {
        buffer.append("\n");
    }
}
