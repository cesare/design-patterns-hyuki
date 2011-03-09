package chapter09.exercise9_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import chapter09.DisplayImpl;

public class FileDisplayImpl extends DisplayImpl {
    private String filename;
    private FileReader reader;
    
    public FileDisplayImpl(String filename) {
        this.filename = filename;
    }

    @Override
    public void rawOpen() {
        try {
            reader = new FileReader(filename);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
    }

    @Override
    public void rawPrint() {
        char[] buffer = new char[1024];
        
        try {
            PrintWriter writer = new PrintWriter(System.out);
            while (true) {
                int length = reader.read(buffer);
                if (length < 0) {
                    break;
                }
                writer.write(buffer, 0, length);
            }
            writer.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawClose() {
        try {
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
