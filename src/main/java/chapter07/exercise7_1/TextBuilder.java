package chapter07.exercise7_1;

public class TextBuilder implements Builder {
    private StringBuffer buffer = new StringBuffer();
    
    @Override
    public void makeTitle(String title) {
        buffer.append("========================================\n");
        buffer.append("Åw" + title + "Åx\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append('Å°' + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            buffer.append(" ÅE" + item + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("========================================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
