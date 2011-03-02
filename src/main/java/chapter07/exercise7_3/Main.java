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
            System.out.println(filename + "���쐬����܂����B");
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
        System.out.println("Usage: java Main plain  �v���[���e�L�X�g�ŕ����쐬");
        System.out.println("       java Main html   HTML�ŕ����쐬");
        System.out.println("       java Main yaml   YAML�ŕ����쐬");
    }
}
