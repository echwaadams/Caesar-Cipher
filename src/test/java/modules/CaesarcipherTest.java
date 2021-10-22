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

}