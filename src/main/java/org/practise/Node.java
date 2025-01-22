package org.practise;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a Node in an undirected graph.
 */
public class Node {
    public int val;
    public List<Node> neighbors;

    // Default constructor
    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    // Constructor with a value
    public Node(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
    }

    // Constructor with a value and neighbors
    public Node(int val, List<Node> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }
}