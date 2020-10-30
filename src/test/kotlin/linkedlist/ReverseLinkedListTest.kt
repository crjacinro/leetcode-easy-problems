package linkedlist

import org.junit.Assert
import org.junit.Test

class ReverseLinkedListTest {
    @Test
    fun should_reverse_node() {
        val node1 = ListNode(1)
        val node2 = ListNode(2)
        val node3 = ListNode(3)
        val node4 = ListNode(4)
        val node5 = ListNode(5)

        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node5

        val result = reverseList(node1)

        Assert.assertEquals(node5, result)
        Assert.assertEquals(node4, node5.next)
        Assert.assertEquals(node3, node4.next)
        Assert.assertEquals(node2, node3.next)
        Assert.assertEquals(node1, node2.next)
        Assert.assertEquals(null, node1.next)
    }

    @Test
    fun should_reverse_one() {
        val node1 = ListNode(1)

        node1.next = null

        val result = reverseList(node1)

        Assert.assertEquals(node1, result)
        Assert.assertEquals(null, node1.next)
    }

    @Test
    fun should_reverse_null() {
        val result = reverseList(null)

        Assert.assertEquals(null, result)
    }
}