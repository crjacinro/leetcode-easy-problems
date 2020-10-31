package linkedlist


fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    var currentLeft = l1
    var currentRight = l2
    var newSorted: ListNode? = null
    var head: ListNode? = null
    var shouldContinue = true

    while (shouldContinue) {
        val nodeToAdd: ListNode
        var nodeCountToAdd = 1

        if (currentLeft == null && currentRight == null) {
            return null
        } else if ((currentLeft == null && currentRight != null)) {
            // Only right side of the element is added. No more elements on the left
            nodeToAdd = currentRight
            currentRight = currentRight.next
        } else if ((currentLeft != null && currentRight == null)) {
            // Only left side of the element is added.  No more elements on the right
            nodeToAdd = currentLeft
            currentLeft = currentLeft.next
        } else if (currentLeft!!.`val` > currentRight!!.`val`) {
            // Only right side of the element is added since it is lesser
            nodeToAdd = currentRight
            currentRight = currentRight.next
        } else if (currentLeft.`val` < currentRight.`val`) {
            // Only left side of the element is added since it is lesser
            nodeToAdd = currentLeft
            currentLeft = currentLeft.next
        } else {
            // Both elements are equal. Add this element twice
            nodeToAdd = currentLeft
            nodeCountToAdd = 2

            currentRight = currentRight.next
            currentLeft = currentLeft.next
        }

        for (i in 0 until nodeCountToAdd) {
            // Create a copy of the node to be added to the sorted list
            val newNode: ListNode? = ListNode(nodeToAdd.`val`)

            if (newSorted == null) {
                // if this is the first element, make it the head
                newSorted = newNode
                head = newSorted
            } else {
                // Append the node to the sorted list and move to the tip
                newSorted.next = newNode
                newSorted = newSorted.next
            }
        }

        // We will continue if there are still elements either on left or right list
        shouldContinue = currentLeft != null || currentRight != null
    }

    return head
}