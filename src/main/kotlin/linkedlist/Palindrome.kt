package linkedlist

fun isPalindrome(head: ListNode?): Boolean {
    var tail = head
    var mid = head
    var current = head
    var count = 0

    // Lets move the tail pointer to the end.
    // Lets move the mid pointer half-as slow as the tail.
    // When tail reaches the end, mid pointer is at the "middle"
    while (tail?.next != null) {
        tail = tail.next
        count++
        if (count % 2 == 0) {
            mid = mid?.next
        }
    }
    // Increment count once to include head.
    count++

    // Lets reverse the right side of the list
    var reversedRight = reverseLinkedList(mid?.next)

    // Lets loop the left list to the middle, and the reversed list. All values should match if it is a palindrom
    while (isLeftListAtTheTail(count, current, mid) && reversedRight != null) {
        if (current?.`val` != reversedRight.`val`) return false

        current = current.next
        reversedRight = reversedRight.next
    }

    // if we reach this point, the list is a palindrome
    return true
}

/*
 * The left side of the list has 2 cases, if the entire list size is ODD or EVEN.
 * If even, the MID is in the end of the left side  (e.g, 1-2-3-4-5-6 ; mid is 3)
 * If odd, the mid is the NEXT of the end of the left side  (e.g, 1-2-3-4-5-6-7 ; mid is 4)
 */
fun isLeftListAtTheTail(count: Int, current: ListNode?, mid: ListNode?): Boolean {
    val isSizeEven = (count) % 2 == 0

    return if (isSizeEven) {
        // we stop until we are done processing MID
        // special case for count = 2, which current and MID is already equal from the start
        current != mid?.next || count == 2
    } else {
        // we stop until the current is at the MID
        // special case for count = 2, which current and MID is already equal from the start
        current != mid
    }
}

fun reverseLinkedList(head: ListNode?): ListNode? {
    var currentNode = head
    var previousNode: ListNode? = null

    while (currentNode != null) {
        val nextNode = currentNode.next

        currentNode.next = previousNode
        previousNode = currentNode
        currentNode = nextNode
    }

    return previousNode
}
