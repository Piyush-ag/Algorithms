
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.example.CloneGraph;
import org.example.Node;
import org.junit.jupiter.api.Test;
import java.util.*;

public class CloneGraphTest {

    private boolean compareGraphs(Node node1, Node node2, Set<Node> visited) {
        if (node1 == null || node2 == null || node1.val != node2.val) return false;
        if (visited.contains(node1)) return true;
        visited.add(node1);
        if (node1.neighbors.size() != node2.neighbors.size()) return false;
        for (int i = 0; i < node1.neighbors.size(); i++) {
            if (!compareGraphs(node1.neighbors.get(i), node2.neighbors.get(i), visited)) return false;
        }
        return true;
    }

    @Test
    public void testCloneGraph() {
        CloneGraph solution = new CloneGraph();

        // Test case 1: Simple connected graph
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        Node clonedGraph = solution.cloneGraph(node1);
        assertTrue(compareGraphs(node1, clonedGraph, new HashSet<>()));
    }
}
