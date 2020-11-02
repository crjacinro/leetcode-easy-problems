package linkedlist

import org.junit.Assert
import org.junit.Test

class CycleTest {
    @Test
    fun should_have_cycle() {

        val node1 = ListNode(1)
        val node2 = ListNode(2)
        val node3 = ListNode(3)
        val node4 = ListNode(4)

        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node2

        val result = hasCycle(node1)

        Assert.assertTrue(result)
    }
}