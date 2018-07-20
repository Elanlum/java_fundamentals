package task2;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;
import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import java.io.*;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Log4j2
@ThreadSafe
public class SimplePropertiesBundle {

    private final Lock lock = new ReentrantLock();

    @GuardedBy("lock")
    Map<String, String> properties;

    public SimplePropertiesBundle() {
        properties = new HashMap<>();
    }

    public void getPropertiesFromFile(String sourceFile) throws NoPropertiesFileException, NoKeyPropertiesFileException {
        if (lock.tryLock()) {
            try {
                File propertiesFile = new File(sourceFile);
                if (!propertiesFile.exists()) {
                    throw new NoPropertiesFileException(String.format("File %s does not exist", sourceFile));
                }
                if (!sourceFile.endsWith(".properties")) {
                    throw new NoKeyPropertiesFileException("File should be *.properties");
                }

                try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(sourceFile)))) {
                    properties = new HashMap<>();
                    while(true){
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
            }finally {
                lock.unlock();;
            }
        }
    }

    public String getValue(String key){
        Optional<String> optionalValue = Optional.empty();
        if(lock.tryLock()){
            try{
                if(!properties.containsKey(key)){
                    throw new NoKeyPropertiesFileException("No such key in properties file");
                }
                optionalValue = Optional.of(this.properties.get(key));//Посмотреть вот это
            }finally {
                lock.unlock();
            }
        }
        return optionalValue.orElse("");
    }

    public Set<String> getKeySet(){
        Optional<Set<String>> optionalKeySet = Optional.empty();
        if(lock.tryLock()){
            try{
                optionalKeySet = Optional.of(properties.keySet());
            }finally {
                lock.unlock();
            }
        }
        return optionalKeySet.orElse(Collections.emptySet());
    }
}

