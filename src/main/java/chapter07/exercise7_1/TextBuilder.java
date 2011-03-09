package chapter07.exercise7_1;

public class TextBuilder implements Builder {
    private StringBuffer buffer = new StringBuffer();
    
    @Override
    public void makeTitle(String title) {
        buffer.append("========================================\n");
        buffer.append("�w" + title + "�x\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append('��' + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            buffer.append(" �E" + item + "\n");
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