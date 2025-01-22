
import static org.junit.Assert.assertEquals;
import org.practise.FractionalKnapsack;
import org.practise.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FractionalKnapsackTest {

    @Test
    public void testFractionalKnapsack() {
        FractionalKnapsack solution = new FractionalKnapsack();

        // Test case 1
        Item[] items1 = {new Item(10, 60), new Item(20, 100), new Item(30, 120)};
        Assertions.assertEquals(240.0, solution.fractionalKnapsack(50, items1));

        // Test case 2
        Item[] items2 = {new Item(5, 30), new Item(10, 40), new Item(15, 45)};
        Assertions.assertEquals(85.0, solution.fractionalKnapsack(20, items2));
    }
}
