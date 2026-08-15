package java_core.Multithreading_ThreadPool;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class Counter_synchronizedTest {

    private static final int THREADS = 4;
    private static final int INCREMENTS_PER_THREAD = 10_000;

    @Test
    void startsAtZero() {
        assertEquals(0, new Counter_synchronized().getCount());
    }

    @Test
    void incrementBumpsCountByOne() {
        Counter_synchronized counter = new Counter_synchronized();

        counter.increment();
        counter.increment();

        assertEquals(2, counter.getCount());
    }

    @Test
    void blockIncrementBumpsCountByOne() {
        Counter_synchronized counter = new Counter_synchronized();

        counter.blockIncrement();

        assertEquals(1, counter.getCount());
    }

    @Test
    void concurrentIncrementsDoNotLoseUpdates() throws InterruptedException {
        Counter_synchronized counter = new Counter_synchronized();
        List<Thread> threads = new ArrayList<>();

        for (int t = 0; t < THREADS; t++) {
            // Xen kẽ 2 cách khóa: synchronized method và synchronized block (cùng object lock)
            boolean useBlock = t % 2 == 0;
            threads.add(new Thread(() -> {
                for (int i = 0; i < INCREMENTS_PER_THREAD; i++) {
                    if (useBlock) {
                        counter.blockIncrement();
                    } else {
                        counter.increment();
                    }
                }
            }));
        }

        threads.forEach(Thread::start);
        for (Thread thread : threads) {
            thread.join();
        }

        assertEquals(THREADS * INCREMENTS_PER_THREAD, counter.getCount());
    }

    @Test
    void staticIncrementIsCallable() {
        assertDoesNotThrow(Counter_synchronized::staticIncrement);
    }
}
