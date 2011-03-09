package chapter08.tablefactory;

import chapter08.factory.Item;
import chapter08.factory.Page;

public class TablePage extends Page {

    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>").append(title).append("</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>").append(title).append("</h1>");
        buffer.append("<table>\n");
        
        for (Item item : content) {
            buffer.append(item.makeHTML());
        }
        
        buffer.append("</table>\n");
        buffer.append("<hr /><address>").append(author).append("</address>");
        buffer.append("</body></html>\n");
        
        return buffer.toString();
    }
}
