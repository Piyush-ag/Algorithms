package org.example;
// Problem: Given a reference of a node in a connected undirected graph, return a deep copy (clone) of the graph.
// Example:
// Input: adjList = [[2,4],[1,3],[2,4],[1,3]]
// Output: [[2,4],[1,3],[2,4],[1,3]]

import java.util.*;

public class CloneGraph {
    // Definition for a Node.


    // Implement the function below
    public Node cloneGraph(Node node) {
        // Your code here
        Map<Node, Node> map = new HashMap<>();
        LinkedList<Node> list = new LinkedList<>();
        list.add(node);
        map.put(node, new Node(node.val));
        while (!list.isEmpty()) {
            Node first = list.removeFirst();
            Node firstCopy = map.get(first);
            for (Node neighbours: first.neighbors) {
                if(!map.containsKey(neighbours)) {
                    list.add(neighbours);
                    map.put(neighbours, new Node(neighbours.val));

                }
                firstCopy.neighbors.add(map.get(neighbours));
            }
        }
        return map.get(node); // Placeholder return to avoid compilation error
    }
}

