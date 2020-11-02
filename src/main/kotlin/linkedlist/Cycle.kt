package linkedlist

fun hasCycle(head: ListNode?): Boolean {
    val setList = hashSetOf<ListNode>()
    var current = head

    while (current != null) {
        if (setList.contains(current)) return true

        setList.add(current)
        current = current.next
    }

    return false
}