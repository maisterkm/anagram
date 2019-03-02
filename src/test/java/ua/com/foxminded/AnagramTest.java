package ua.com.foxminded;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AnagramTest {

    Anagram anagram;
    
    @Before
    public void before() {
        anagram = new Anagram();
    }
    
    @Test
    public void stringShouldBeReversed() {
        assertEquals("dcba hgfe", anagram.makeAnagram("abcd efgh"));
        assertEquals("a1bcd efg!h", anagram.makeAnagram("d1cba hgf!e"));
    }
    
    @Test
    public void stringShouldNotBeEmpty() {
        String string = "dcba hgfe";
        assertFalse(string.isEmpty());
    }
    
    @Test
    public void stringShouldNotBeNull() {
        String string = "dcba hgfe";
        assertNotNull(string);
    }
    
    @Test
    public void stringShouldBeReversedWithSingleWhitespace() {
        assertEquals("dcba hgfe", anagram.makeAnagram("abcd efgh"));
    }
    
    @Test
    public void stringShouldBeReversedWithMultipleWhitespace() {
        assertEquals("dcba hgfe", anagram.makeAnagram("abcd     efgh"));
    }
    
    @Test
    public void stringShouldBeReversedWithCR() {
        assertEquals("dcba hgfe", anagram.makeAnagram("abcd \refgh"));
        assertEquals("dcba hgfe", anagram.makeAnagram("abcd \r\refgh"));
    }
    
    @Test
    public void stringShouldBeReversedWithLF() {
        assertEquals("dcba hgfe", anagram.makeAnagram("abcd \nefgh"));
        assertEquals("dcba hgfe", anagram.makeAnagram("abcd \n\nefgh"));
    }

}
