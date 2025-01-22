
import static org.junit.Assert.assertEquals;
import org.practise.LongestPalindromicSubstring;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubstringTest {

    @Test
    public void testLongestPalindrome() {
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        // Test cases
        assertEquals("bab", solution.longestPalindrome("babad"));
        assertEquals("bb", solution.longestPalindrome("cbbd"));
        assertEquals("a", solution.longestPalindrome("a"));
        assertEquals("", solution.longestPalindrome(""));
        assertEquals("aa", solution.longestPalindrome("aa"));
    }
}
