package chapter02.exercise2_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class FileProperties implements FileIO {
    private Properties properties;
    
    public FileProperties() {
        properties = new Properties();
    }
    
    @Override
    public void readFromFile(String filename) throws IOException {
        InputStream is = new FileInputStream(filename);
        properties.load(is);
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        String header = "written by FileProperties";
        OutputStream os = new FileOutputStream(filename);
        properties.store(os, header);
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public void getValue(String key) {
        properties.getProperty(key);
    }
}
