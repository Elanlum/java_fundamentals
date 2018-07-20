package task2;

import lombok.SneakyThrows;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimplePropertiesBundleTest {

    SimplePropertiesBundle resourceBundle;

    @Before
    public void setUp() throws Exception {
        resourceBundle = new SimplePropertiesBundle();
    }

    @Test
    @SneakyThrows
    public void throwNoPropertiesFileException(){

    }

    @Test
    @SneakyThrows
    public void throwNoKeyPropertiesFileException(){

    }
}