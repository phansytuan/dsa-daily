import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyLinkedListTest {

    private final ByteArrayOutputStream captured = new ByteArrayOutputStream();
    private PrintStream originalOut;

    @BeforeEach
    void captureStdout() {
        originalOut = System.out;
        System.setOut(new PrintStream(captured, true, StandardCharsets.UTF_8));
    }

    @AfterEach
    void restoreStdout() {
        System.setOut(originalOut);
    }

    private String printed() {
        return captured.toString(StandardCharsets.UTF_8).replace("\r\n", "\n").trim();
    }

    @Test
    void printsNodesSeparatedByArrows() {
        MyLinkedList.Node head = new MyLinkedList.Node(1);
        head.next = new MyLinkedList.Node(2);
        head.next.next = new MyLinkedList.Node(3);

        MyLinkedList.printLinkedList(head);

        assertEquals("1 -> 2 -> 3", printed());
    }

    @Test
    void printsSingleNodeWithoutArrow() {
        MyLinkedList.printLinkedList(new MyLinkedList.Node(42));

        assertEquals("42", printed());
    }

    @Test
    void reportsEmptyListForNullHead() {
        MyLinkedList.printLinkedList(null);

        assertEquals("LinkedList is empty", printed());
    }
}
