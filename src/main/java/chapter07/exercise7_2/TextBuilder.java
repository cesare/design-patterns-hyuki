package chapter07.exercise7_2;

public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();
    
    @Override
    public void doMakeTitle(String title) {
        buffer.append("========================================\n");
        buffer.append("『" + title + "』\n");
        buffer.append("\n");
    }

    @Override
    public void doMakeString(String str) {
        buffer.append('■' + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void doMakeItems(String[] items) {
        for (String item : items) {
            buffer.append(" ・" + item + "\n");
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
