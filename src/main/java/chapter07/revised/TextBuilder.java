package chapter07.revised;

public class TextBuilder extends Builder {

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

}
