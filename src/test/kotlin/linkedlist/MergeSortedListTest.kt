package linkedlist

import org.junit.Assert
import org.junit.Test

class MergeSortedListTest {
    @Test
    fun should_merge_two_lists() {
        val node1 = ListNode(1)
        val node3 = ListNode(3)
        node1.next = node3
        node3.next = null
        val node2 = ListNode(2)
        val node4 = ListNode(4)
        node2.next = node4
        node4.next = null

        val result = mergeTwoLists(node1, node2)

        Assert.assertEquals("1234", result.toDisplayString())
    }

    @Test
    fun should_merge_two_simple_list() {
        val node1_left = ListNode(1)
        val node2_left = ListNode(2)
        val node4_left = ListNode(4)
        node1_left.next = node2_left
        node2_left.next = node4_left
        node4_left.next = null

        val node1_right = ListNode(1)
        val node3_right = ListNode(3)
        val node4_right = ListNode(4)
        node1_right.next = node3_right
        node3_right.next = node4_right
        node4_right.next = null

        val result = mergeTwoLists(node1_left, node1_right)

        Assert.assertEquals("112344", result.toDisplayString())
    }

    @Test
    fun should_merge_two_empty() {
        val result = mergeTwoLists(null, null)

        Assert.assertEquals("", result.toDisplayString())
    }

    @Test
    fun should_merge_if_one_empty() {
        val node1_left = ListNode(1)
        val node2_left = ListNode(2)
        val node4_left = ListNode(4)
        node1_left.next = node2_left
        node2_left.next = node4_left
        node4_left.next = null

        val result = mergeTwoLists(node1_left, null)

        Assert.assertEquals("124", result.toDisplayString())
    }
}

fun ListNode?.toDisplayString(): String {
    val result = StringBuilder()
    var current = this
    while (current != null) {
        result.append(current.`val`)
        current = current.next
    }
    return result.toString()
}