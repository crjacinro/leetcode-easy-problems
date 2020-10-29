package linkedlist

import org.junit.Assert.assertEquals
import org.junit.Test

class DeleteNodeTest {
    @Test
    fun should_delete_node() {

        val node1 = ListNode(4)
        val node2 = ListNode(5)
        val node3 = ListNode(1)
        val node4 = ListNode(9)

        node1.next = node2
        node2.next = node3
        node3.next = node4

        val expected = 9

        deleteNode(node3)

        assertEquals(node2.next?.`val`, expected)
        assertEquals(node2.next?.next?.`val`, null)
    }
}