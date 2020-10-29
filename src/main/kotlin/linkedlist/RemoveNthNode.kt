package linkedlist

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    // this means the list has only one element, just return null immediately.
    if (head?.next == null) return null

    var slowNode = head
    var currentNode = head
    var offset = 0

    // Offset the current node by n nodes as a head start.
    while (offset < n) {
        currentNode = currentNode?.next
        offset++
    }

    // wait for the current node to read the end.
    while (currentNode?.next != null) {
        slowNode = slowNode?.next
        currentNode = currentNode.next
    }

    // If slow node is the same as head, then we are removing the first element
    if (slowNode == head && currentNode == null) return slowNode.next

    // else just bypass the next node of the slow node
    slowNode?.next = slowNode?.next?.next

    // return the original head
    return head
}