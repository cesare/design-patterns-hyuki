package chapter08.listfactory;

import chapter08.factory.Item;
import chapter08.factory.Tray;

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption).append("\n");
        buffer.append("<ul>\n");
        
        for (Item item : tray) {
            buffer.append(item.makeHTML());
        }
        
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        
        return buffer.toString();
    }

}
