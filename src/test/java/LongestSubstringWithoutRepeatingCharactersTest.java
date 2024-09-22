
import static org.junit.Assert.assertEquals;
import org.example.LongestSubstringWithoutRepeatingCharacters;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void testLengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        // Test cases
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
        assertEquals(0, solution.lengthOfLongestSubstring(""));
        assertEquals(5, solution.lengthOfLongestSubstring("abcde"));
    }
}
