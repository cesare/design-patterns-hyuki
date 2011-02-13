package chapter02.exercise2_2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String prefix = args.length > 0 ? args[0] : null;
        FileIO f = new FileProperties();
        try {
            f.readFromFile(getPath(prefix, "file.txt"));
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile(getPath(prefix, "newfile.txt"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static String getPath(String prefix, String filename) {
        return new String(prefix + "/" + filename);
    }
}
