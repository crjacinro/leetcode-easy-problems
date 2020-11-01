package linkedlist

import org.junit.Assert
import org.junit.Test

class PalindromeTest {
    @Test
    fun should_return_odd() {
        val node1 = ListNode(1)
        val node2 = ListNode(2) //mid
        val node3 = ListNode(1)

        node1.next = node2
        node2.next = node3
        node3.next = null

        val result = isPalindrome(node1)

        Assert.assertTrue(result)
    }

    @Test
    fun should_return_true_even() {
        val node1 = ListNode(1)
        val node2 = ListNode(2) // mid
        val node3 = ListNode(2)
        val node4 = ListNode(1)

        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = null

        val result = isPalindrome(node1)

        Assert.assertTrue(result)
    }

    @Test
    fun should_return_false() {
        val node1 = ListNode(1)
        val node2 = ListNode(2)
        val node3 = ListNode(2)
        val node4 = ListNode(5)

        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = null

        val result = isPalindrome(node1)

        Assert.assertFalse(result)
    }

    @Test
    fun should_return_false_complex_even() {
        val node1 = ListNode(1)
        val node2 = ListNode(2)
        val node3 = ListNode(2)
        val node4 = ListNode(5)
        val node5 = ListNode(5)
        val node6 = ListNode(2)
        val node7 = ListNode(4)
        val node8 = ListNode(1)

        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node5
        node5.next = node6
        node6.next = node7
        node7.next = node8
        node8.next = null

        val result = isPalindrome(node1)

        Assert.assertFalse(result)
    }

    @Test
    fun should_return_false_complex_odd() {
        val node1 = ListNode(1)
        val node2 = ListNode(2)
        val node3 = ListNode(2)
        val node4 = ListNode(5)
        val node5 = ListNode(5)
        val node6 = ListNode(2)
        val node7 = ListNode(4)
        val node8 = ListNode(1)
        val node9 = ListNode(1)

        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node5
        node5.next = node6
        node6.next = node7
        node7.next = node8
        node8.next = node9
        node9.next = null

        val result = isPalindrome(node1)

        Assert.assertFalse(result)
    }

    @Test
    fun should_return_true_complex_even() {
        val node1 = ListNode(1)
        val node2 = ListNode(2)
        val node3 = ListNode(3)
        val node4 = ListNode(4) // mid
        val node5 = ListNode(4)
        val node6 = ListNode(3)
        val node7 = ListNode(2)
        val node8 = ListNode(1)

        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node5
        node5.next = node6
        node6.next = node7
        node7.next = node8
        node8.next = null

        val result = isPalindrome(node1)

        Assert.assertTrue(result)
    }

    @Test
    fun should_return_true_complex_odd() {
        val node1 = ListNode(1)
        val node2 = ListNode(2)
        val node3 = ListNode(3)
        val node4 = ListNode(4)
        val node5 = ListNode(8) // mid
        val node6 = ListNode(4)
        val node7 = ListNode(3)
        val node8 = ListNode(2)
        val node9 = ListNode(1)

        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node5
        node5.next = node6
        node6.next = node7
        node7.next = node8
        node8.next = node9
        node9.next = null

        val result = isPalindrome(node1)

        Assert.assertTrue(result)
    }

    @Test
    fun should_return_true_only_one() {
        val node1 = ListNode(1)

        node1.next = null

        val result = isPalindrome(node1)

        Assert.assertTrue(result)
    }

    @Test
    fun should_return_false_only_two() {
        val node1 = ListNode(1)
        val node2 = ListNode(2)

        node1.next = node2
        node2.next = null

        val result = isPalindrome(node1)

        Assert.assertFalse(result)
    }

    @Test
    fun should_return_true_null() {
        val result = isPalindrome(null)

        Assert.assertTrue(result)
    }
}