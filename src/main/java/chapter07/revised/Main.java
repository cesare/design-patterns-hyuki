package chapter07.revised;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            return;
        }
        
        Builder builder = createBuilder(args[0]);
        if (builder == null) {
            usage();
            return;
        }
        build(builder);
    }
    
    private static Builder createBuilder(String name) {
        if (name.equals("plain")) {
            return new TextBuilder();
        }
        else if (name.equals("html")) {
            return new HTMLBuilder();
        }
        return null;
    }
    
    private static void build(Builder builder) {
        Director director = new Director(builder);
        director.construct();
        String result = builder.getResult();
        System.out.println(result);
    }
    public static void usage() {
        System.out.println("Usage: java Main plain  プレーンテキストで文書作成");
        System.out.println("       java Main html   HTMLで文書作成");
    }
}
