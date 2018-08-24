import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void lengthOfLongestSubstring_1() throws Exception {
        int length = Main.lengthOfLongestSubstring("bbbbb");
        assertEquals(1, length);
    }

    @Test
    public void lengthOfLongestSubstring_2() throws Exception {
        int length = Main.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, length);
    }

    @Test
    public void lengthOfLongestSubstring_3() throws Exception {
        int length = Main.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, length);
    }

    @Test
    public void lengthOfLongestSubstring_4() throws Exception {
        int length = Main.lengthOfLongestSubstring("");
        assertEquals(0, length);
    }

    @Test
    public void lengthOfLongestSubstring_5() throws Exception {
        int length = Main.lengthOfLongestSubstring(" ");
        assertEquals(1, length);
    }

    @Test
    public void lengthOfLongestSubstring_6() throws Exception {
        int length = Main.lengthOfLongestSubstring("au");
        assertEquals(2, length);
    }

}