package linkedlist

fun reverseList(head: ListNode?): ListNode? {
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