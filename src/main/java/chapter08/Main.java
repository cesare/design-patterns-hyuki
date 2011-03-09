package chapter08;

import chapter08.factory.Factory;
import chapter08.factory.Link;
import chapter08.factory.Page;
import chapter08.factory.Tray;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java chapter08.Main class.name.of.ConcreteFactory");
            System.out.println("Example1: java chapter08.Main listfactory.ListFactory");
            System.out.println("Example2: java chapter08.Main tablefactory.TableFactory");
            return;
        }
        
        Factory factory = Factory.getFactory(args[0]);
        
        Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
        Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp");
        
        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");
        
        Tray traynews = factory.createTray("新聞");
        traynews.add(asahi);
        traynews.add(yomiuri);
        
        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);
        
        Tray traysearch = factory.createTray("サーチエンジン");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);
        
        Page page = factory.createPage("LinkPage", "結城浩");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
