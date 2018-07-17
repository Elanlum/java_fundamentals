package task3;

import java.io.*;

public class ConvertUTF8To16 {

    public static String text;

    public static void read(String filename) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF8"))) {
            StringBuffer stringBuffer = new StringBuffer();
            while ((text = bufferedReader.readLine()) != null) {
                stringBuffer.append(text).append("\r\n");
                System.out.println(text);
            }
            text = stringBuffer.toString();
        } catch (UnsupportedEncodingException ee) {
            ee.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeTo(String filename){
        try(Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename), "UTF16"))){
            writer.write(text);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ConvertUTF8To16.read("filesTask3/textUTF8.txt");
        ConvertUTF8To16.writeTo("filesTask3/textUTF16.txt");
    }
}
