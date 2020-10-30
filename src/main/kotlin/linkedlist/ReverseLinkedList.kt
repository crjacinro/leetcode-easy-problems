package linkedlist

fun reverseList(head: ListNode?): ListNode? {
    var currentNode = head
    var previousNode: ListNode? = null
    var nextnode = head?.next

    currentNode?.next = previousNode

    while (nextnode != null) {
        previousNode = currentNode
        currentNode = nextnode
        nextnode = nextnode.next

        currentNode.next = previousNode
    }
    return currentNode
}