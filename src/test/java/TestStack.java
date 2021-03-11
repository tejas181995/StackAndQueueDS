import com.bridgelabz.stackqueue.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestStack {
    Stack stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack();
        stack.push(25);
    }


    @Test
    public void top() {
        Integer result;
        result = (Integer) stack.top();
        Assertions.assertEquals(25, result);
    }

    @Test
    public void testPop() {
        int result;
        result = (int) stack.pop();
        Assertions.assertEquals(25, result);
    }

    @Test
    public void testEmpty(){
        for(int i=0;i<5;i++){
            stack.push(i*17+i);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        Assertions.assertEquals(true,stack.isEmpty());
    }
}
