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

fun reverseListRecursive(head: ListNode?): ListNode? {
    return reverse(null, head)
}

fun reverse(previousNode: ListNode?, currentNode: ListNode?): ListNode? {
    val nextNode: ListNode? = currentNode?.next
    currentNode?.next = previousNode

    if (nextNode == null) return currentNode
    return reverse(currentNode, nextNode)
}