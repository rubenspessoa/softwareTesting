import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;


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

    @Test
    public void constructorTest4() {
        SortedSet<Integer> sortedSet = new TreeSet<Integer>();
        sortedSet.add(134134);
        sortedSet.add(134141);
        sortedSet.add(2342);
        sortedSet.add(23234);

        try {
            this.queue = new MyPriorityQueue<Integer>(sortedSet);
            assertNotNull(this.queue);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    public void constructorTest5() {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(134134);
        set.add(134141);
        set.add(2342);
        set.add(23234);

        try {
            this.queue = new MyPriorityQueue<Integer>(set);
            assertNotNull(this.queue);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    public void constructorTest6() {
        Comparator<? super Integer> comparator = (new PriorityQueue<Integer>().comparator());

        try {
            this.queue = new MyPriorityQueue<Integer>(10, comparator);
            assertNotNull(this.queue);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    public void addTest1() {
        this.queue.add(1);
        assertEquals(this.queue.size(), 1);
    }

    @Test
    public void addTest2() {
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        assertEquals(this.queue.size(), 14);
    }

    @Test
    public void peekTest1() {
        this.queue.add(1);
        this.queue.add(2);
        this.queue.add(3);
        assertEquals(this.queue.peek(), new Integer(1));
    }

    @Test
    public void clearTest1() {
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        this.queue.add(1);
        assertEquals(this.queue.size(), 14);
        this.queue.clear();
        assertEquals(this.queue.size(), 0);
    }

    @Test
    public void comparatorTest1() {
        Comparator<? super Integer> comp = this.queue.comparator();
        assertNull(comp);
    }

    @Test
    public void containsTest1() {
        this.queue.add(1);
        this.queue.add(2);
        this.queue.add(3);
        assertTrue(this.queue.contains(new Integer(3)));
        assertFalse(this.queue.contains(new Integer(5)));
    }

    @Test
    public void iteratorTest1() {
        assertNotNull(this.queue.iterator());
    }

    @Test
    public void offerTest1() {
        try {
            this.queue.offer(null);
            assertEquals(this.queue.size(), 1);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    public void pollTest1() {
        this.queue.add(1);
        this.queue.add(2);
        this.queue.add(3);

        Integer poll1 = this.queue.poll();
        assertEquals(poll1, new Integer(1));
        Integer poll2 = this.queue.poll();
        assertEquals(poll2, new Integer(2));
        Integer poll3 = this.queue.poll();
        assertEquals(poll3, new Integer(3));
        Integer poll4 = this.queue.poll();
        assertNull(poll4);
    } 


}
