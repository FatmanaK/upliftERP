package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
  /*  private static FileInputStream file;
    private static Properties property;

    static {
        try {
            file = new FileInputStream("configuration.properties");
            property=new Properties();
            property.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){

        return  property.getProperty(key);
    }
*/
  private  static Properties properties=new Properties();
    static {
        String path = "src/configuration.properties";
        try{
            FileInputStream fileInputStream=new FileInputStream(path);
            properties.load(fileInputStream);
            fileInputStream.close();
        }catch(IOException e){
            System.out.println("Properties file not found " );
        }
    }
    public  static  String  getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }
}
