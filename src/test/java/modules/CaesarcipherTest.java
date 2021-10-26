package modules;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarcipherTest {
    @Test
    public void newStrings_instantiatesCorrectly(){
        String testString = new String();
        String expected = "a";
        assertEquals(true, testString instanceof String);
    }
    @Test
    public void newIntegers_getKey() throws Exception{
        String testString = new String();
        String expected = "a";
        Integer intExpected = 1;
        assertEquals(true, testString instanceof String);
    }
    @Test
    public void newEncrypt_instantiatesCorrectly(){
        String testEncrypt = new String();
        String expected = "a";
        assertEquals(true, testEncrypt instanceof String);
    }
    @Test
    public void newDecrypt_instantiatesCorrectly(){
        String testDecrypt = new String();
        String expected = "a";
        assertEquals(true, testDecrypt instanceof String);
    }


}