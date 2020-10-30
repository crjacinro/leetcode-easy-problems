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

// Recursive function receives previous and current
// so that it can set the next of current to previous
fun reverse(previousNode: ListNode?, currentNode: ListNode?): ListNode? {
    // get copy of the next node first
    val nextNode: ListNode? = currentNode?.next
    // set the next of the current node to the previous
    currentNode?.next = previousNode

    // if next is null, we are in the end.
    // just return the current node since this is the new head
    if (nextNode == null) return currentNode

    // recursively do this with the current node and the next node
    return reverse(currentNode, nextNode)
}