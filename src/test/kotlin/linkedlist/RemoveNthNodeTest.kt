package linkedlist

import org.junit.Assert
import org.junit.Test

class RemoveNthNodeTest {
    @Test
    fun should_remove_nth_node() {
        val node1 = ListNode(1)
        val node2 = ListNode(2)
        val node3 = ListNode(3)
        val node4 = ListNode(4)
        val node5 = ListNode(5)

        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node5

        val removeNth = 2

        val result = removeNthFromEnd(node1, removeNth)

        Assert.assertEquals(node1, result)
        Assert.assertEquals(5, node3.next?.`val`)
    }

    @Test
    fun should_remove_last_node() {
        val node1 = ListNode(1)
        val node2 = ListNode(2)
        val node3 = ListNode(3)
        val node4 = ListNode(4)
        val node5 = ListNode(5)

        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node5

        val removeNth = 1

        val result = removeNthFromEnd(node1, removeNth)

        Assert.assertEquals(node1, result)
        Assert.assertEquals(null, node4.next)
    }

    @Test
    fun should_remove_first_node() {
        val node1 = ListNode(1)
        val node2 = ListNode(2)
        val node3 = ListNode(3)
        val node4 = ListNode(4)
        val node5 = ListNode(5)

        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node5

        val removeNth = 5

        val result = removeNthFromEnd(node1, removeNth)

        Assert.assertEquals(node2, result)
        Assert.assertEquals(node2.`val`, 2)
    }

    @Test
    fun should_remove_last_node_small() {
        val node1 = ListNode(1)
        val node2 = ListNode(2)

        node1.next = node2

        val removeNth = 1

        val result = removeNthFromEnd(node1, removeNth)

        Assert.assertEquals(node1, result)
        Assert.assertEquals(1, node1.`val`)
    }

    @Test
    fun should_remove_one_element() {
        val node1 = ListNode(1)

        val removeNth = 1

        val result = removeNthFromEnd(node1, removeNth)

        Assert.assertEquals(null, result)
    }
}