package chapter07.exercise7_3;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            return;
        }
        
        if (args[0].equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        }
        else if (args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.getResult();
            System.out.println(filename + "が作成されました。");
        }
        else if (args[0].equals("yaml")) {
            YAMLBuilder builder = new YAMLBuilder();
            Director director = new Director(builder);
            director.construct();
            String result = builder.getResult();
            System.out.println(result);
        }
        else {
            usage();
        }
    }
    
    public static void usage() {
        System.out.println("Usage: java Main plain  プレーンテキストで文書作成");
        System.out.println("       java Main html   HTMLで文書作成");
        System.out.println("       java Main yaml   YAMLで文書作成");
    }
}
