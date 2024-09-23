

import org.example.HuffmanCoding;
import org.junit.jupiter.api.Test;
import java.util.Map;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class HuffmanCodingTest {

    @Test
    public void testValidInput() {
        HuffmanCoding huffman = new HuffmanCoding();
        int[] charFreq = {5, 9, 12, 13, 16, 45};
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};

        Map<Character, String> result = huffman.huffmanCoding(charFreq, charArray);
        assertNotNull(result);
        assertEquals(6, result.size());

        // Validate some expected Huffman codes (codes may vary based on implementation)
        assertTrue(result.containsKey('a'));
        assertTrue(result.containsKey('b'));
        assertTrue(result.containsKey('c'));
        assertTrue(result.containsKey('d'));
        assertTrue(result.containsKey('e'));
        assertTrue(result.containsKey('f'));

        // Check that each character has a non-empty code
        for (char c : charArray) {
            assertNotNull(result.get(c));
            assertFalse(result.get(c).isEmpty());
        }
    }

    @Test
    public void testSingleCharacterInput() {
        HuffmanCoding huffman = new HuffmanCoding();
        int[] charFreq = {10};
        char[] charArray = {'a'};

        Map<Character, String> result = huffman.huffmanCoding(charFreq, charArray);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("", result.get('a')); // For a single character, the Huffman code is usually an empty string.
    }

    @Test
    public void testEmptyInput() {
        HuffmanCoding huffman = new HuffmanCoding();
        int[] charFreq = {};
        char[] charArray = {};

        Map<Character, String> result = huffman.huffmanCoding(charFreq, charArray);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testNullInput() {
        HuffmanCoding huffman = new HuffmanCoding();

        // Test null inputs
        Map<Character, String> result = huffman.huffmanCoding(null, null);
        assertNotNull(result);
        assertTrue(result.isEmpty());

        // Test null charArray
        int[] charFreq = {1, 2, 3};
        result = huffman.huffmanCoding(charFreq, null);
        assertNotNull(result);
        assertTrue(result.isEmpty());

        // Test null charFreq
        char[] charArray = {'a', 'b', 'c'};
        result = huffman.huffmanCoding(null, charArray);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testMultipleCharactersWithSameFrequency() {
        HuffmanCoding huffman = new HuffmanCoding();
        int[] charFreq = {5, 5, 5, 5};
        char[] charArray = {'x', 'y', 'z', 'w'};

        Map<Character, String> result = huffman.huffmanCoding(charFreq, charArray);
        assertNotNull(result);
        assertEquals(4, result.size());

        // Ensure each character has a valid Huffman code
        for (char c : charArray) {
            assertNotNull(result.get(c));
            assertFalse(result.get(c).isEmpty());
        }
    }

    @Test
    public void testOutputForGivenExample() {
        HuffmanCoding huffman = new HuffmanCoding();
        int[] charFreq = {5, 9, 12, 13, 16, 45};
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};

        Map<Character, String> expectedCodes = new HashMap<>();
        expectedCodes.put('f', "0");
        expectedCodes.put('c', "100");
        expectedCodes.put('d', "101");
        expectedCodes.put('a', "1100");
        expectedCodes.put('b', "1101");
        expectedCodes.put('e', "111");
        Map<Character, String> result = huffman.huffmanCoding(charFreq, charArray);
        assertNotNull(result);
        assertEquals(expectedCodes.size(), result.size());

        // Validate the output against expected codes
        for (Map.Entry<Character, String> entry : expectedCodes.entrySet()) {
            assertEquals(entry.getValue(), result.get(entry.getKey()));
        }
    }
}