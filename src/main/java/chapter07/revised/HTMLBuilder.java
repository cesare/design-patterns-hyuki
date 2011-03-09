package chapter07.revised;

public class HTMLBuilder extends Builder {
    @Override
    public void makeTitle(String title) {
        buffer.append("<html><head><title>").append(title).append("</title></head><body>");
        buffer.append("<h1>").append(title).append("</h1>");
    }

    @Override
    public void makeString(String str) {
        buffer.append("<p>").append(str).append("</p>");
    }

    @Override
    public void makeItems(String[] items) {
        buffer.append("<ul>");
        for (String item : items) {
            buffer.append("<li>").append(item).append("</li>");
        }
        buffer.append("</ul>");
    }

    @Override
    public void close() {
        buffer.append("</body></html>");
    }
}
