package task2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class KeywordsFinder {

    private Map<String, Integer> keywordsMatchesMap;

    public KeywordsFinder(){
        keywordsMatchesMap = new HashMap<>();
    }

    public void loadKeywords(){
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("keywords.txt")))) {
            while (true) {
                String key = bufferedReader.readLine();
                if (key == null)
                    break;
                keywordsMatchesMap.put(key, 0);
            }
        }catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile(){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("filesTask2/FileToRead.txt"))){
            while(true){
                String key = bufferedReader.readLine();
                if(key == null){
                    break;
                }
                for(Map.Entry<String, Integer> entry : keywordsMatchesMap.entrySet()){
                    if(key.contains(entry.getKey())){
                        keywordsMatchesMap.put(entry.getKey(), entry.getValue() + 1);
                    }
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void writeToFile(){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("filesTask2/FileToWrite.txt"))){
           for(Map.Entry<String, Integer> entry : keywordsMatchesMap.entrySet()){
               if (entry.getValue() != 0){
                   bufferedWriter.write(String.format("%s - %s", entry.getKey(), entry.getValue()));
                   bufferedWriter.newLine();
               }
           }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        KeywordsFinder finder = new KeywordsFinder();
        finder.loadKeywords();
        finder.readFromFile();
        finder.writeToFile();

    }
}
