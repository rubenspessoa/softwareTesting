import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.PriorityQueue;
import java.util.SortedSet;

import static org.junit.Assert.assertNotNull;


/**
 * Created by rubenspessoa on 30/08/16.
 */

public class MyPriorityQueueTest {

    public MyPriorityQueue<Integer> queue;

    @Before
    public void setUp() {
        this.queue = new MyPriorityQueue<Integer>();
    }

    @After
    public void tearDown() {
        this.queue = null;
    }

    /**
     * Case 1: No arguments
     */
    @Test
    public void constructorTest1() {
        this.queue = new MyPriorityQueue<Integer>();
        assertNotNull(this.queue);
    }

    @Test
    public void constructorTest2() {
        this.queue = new MyPriorityQueue<Integer>(4);
        assertNotNull(this.queue);
    }

    @Test
    public void constructorTest3() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        priorityQueue.add(545);
        priorityQueue.add(34);
        priorityQueue.add(12314);

        try {
            this.queue = new MyPriorityQueue<Integer>(priorityQueue);
            assertNotNull(this.queue);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
