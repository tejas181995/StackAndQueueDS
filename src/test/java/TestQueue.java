import com.bridgelabz.stackqueue.Queue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestQueue {
    Queue queue;

    @BeforeEach
    void setUp() {
        queue = new Queue();
        queue.push(58);
        queue.push(54);
        queue.push(87);
    }

    @Test
    public void testPop() {
        int result ;
        result = (int) queue.pop();
        System.out.println(result);
        Assertions.assertEquals(58, result);

    }
}
