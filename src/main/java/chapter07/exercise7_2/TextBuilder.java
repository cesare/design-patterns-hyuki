package chapter07.exercise7_2;

public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();
    
    @Override
    public void doMakeTitle(String title) {
        buffer.append("========================================\n");
        buffer.append("Åw" + title + "Åx\n");
        buffer.append("\n");
    }

    @Override
    public void doMakeString(String str) {
        buffer.append('Å°' + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void doMakeItems(String[] items) {
        for (String item : items) {
            buffer.append(" ÅE" + item + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void doClose() {
        buffer.append("========================================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
