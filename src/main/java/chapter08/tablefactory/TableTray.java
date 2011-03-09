package chapter08.tablefactory;

import chapter08.factory.Item;
import chapter08.factory.Tray;

public class TableTray extends Tray {

    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<td>");
        buffer.append("<table width=\"100\" border=\"1\"><tr>");
        buffer.append("<td colspan=\"").append(tray.size()).append("\"><b>").append(caption).append("</b></td>");
        buffer.append("</tr>\n");
        buffer.append("<tr>\n");
        
        for (Item item : tray) {
            buffer.append(item.makeHTML());
        }
        
        buffer.append("</tr></table>");
        buffer.append("</td>");
        
        return buffer.toString();
    }
}
