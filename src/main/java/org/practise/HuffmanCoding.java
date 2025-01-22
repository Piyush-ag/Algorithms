package org.practise;
// Problem: A lossless data compression algorithm that assigns variable-length codes to input characters based on their frequencies.
// Example:
// Input: charArray = {'a', 'b', 'c', 'd', 'e', 'f'}, charFreq = {5, 9, 12, 13, 16, 45}
// Output: Printed Huffman codes for each character

import java.util.*;

public class HuffmanCoding {
    // Implement the function below
    public Map<Character, String> huffmanCoding(int[] charFreq, char[] charArray) {
        if (charFreq == null || charArray == null || charArray.length == 0 || charFreq.length == 0) {
            return new HashMap<>();
        }
        HuffmanNode[] nodes = new HuffmanNode[charFreq.length];
        for (int i = 0; i < charFreq.length; i++) {
            nodes[i] = new HuffmanNode(charArray[i], charFreq[i]);
        }
        PriorityQueue<HuffmanNode> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a.data));
        for (int i = 0; i < nodes.length; i++) {
            queue.add(nodes[i]);
        }
        while(queue.size()>1) {
            HuffmanNode node1 = queue.poll();
            HuffmanNode node2 = queue.poll();
            HuffmanNode nodeP = new HuffmanNode(node2.data+node1.data);
            nodeP.left = node1;
            nodeP.right = node2;
            queue.add(nodeP);
        }

        Map<Character, String> code = new HashMap<>();
        buildCode(queue.poll(), code, "");
        System.out.println(code);
        return code;

        // Your code here
    }

    public void  buildCode(HuffmanNode node, Map<Character, String> codes, String str) {
        if (node == null)
            return;

        if (node.c != null) {
            codes.put(node.c, str);
            return;
        }

        buildCode(node.left, codes, str + "0");
        buildCode(node.right, codes, str+ "1");
    }
}
