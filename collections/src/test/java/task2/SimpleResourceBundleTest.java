package task2;


import org.junit.Test;

import java.util.NoSuchElementException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SimpleResourceBundleTest {

    private SimpleResourceBundle resourceBundle;

    @Test(expected = NoPropertiesFileException.class)
    public void throwNoPropertiesFileException(){
        resourceBundle = SimpleResourceBundle.getInstance("src/test/fileTest2/test1.properties");
    }

    @Test(expected = NoValidatePropertiesFileException.class)
    public void throwNoValidatePropertiesFileException(){
        resourceBundle = SimpleResourceBundle.getInstance("src/test/fileTest2/test.txt");
    }

    @Test(expected = NoSuchElementException.class)
    public void throwNoSuchElementException(){
        resourceBundle = SimpleResourceBundle.getInstance("src/test/fileTest2/test.properties");
        assertThat(resourceBundle.getValue("four"), is("test3"));
        assertThat(resourceBundle.getValue("one"), is("test1"));
//        assertThat(resourceBundle.getValue("six"), is("test2"));

    }
}