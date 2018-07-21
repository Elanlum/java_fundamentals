package task2;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

@FieldDefaults (level = AccessLevel.PRIVATE, makeFinal = true)
public class SimpleResourceBundle {
    Map<String, String> properties;

    public SimpleResourceBundle(Map<String,String> properties) {
        this.properties = properties;
    }

    public static SimpleResourceBundle getInstance(String sourcefile) throws NoPropertiesFileException, NoValidatePropertiesFileException {
        Map<String, String> properties = new HashMap<>();
        File propertiesFile = new File(sourcefile);
        if(!propertiesFile.exists()){
            throw new NoPropertiesFileException(String.format("No such properties file in required directory", sourcefile));
        }
        if(!sourcefile.endsWith(".properties")){
            throw new NoValidatePropertiesFileException("File should end with *.properties");
        }
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(propertiesFile)))){
            while (true){
                String line = bufferedReader.readLine();
                if(line == null){
                    break;
                }
                String[] keyValueArray = line.split("=", 2);
                properties.put(keyValueArray[0].trim(), keyValueArray[1].trim());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new SimpleResourceBundle(properties);
    }

    public String getValue(String key){
        if(!properties.containsKey(key)){
            throw new NoSuchElementException("There is no such key in properties file");
        }
        return properties.get(key);
    }

    public Set<String> getKeySet(){
        return properties.keySet();
    }
}
