package linkedlist


fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    if (l1 == null && l2 == null) return null

    var currentLeft = l1
    var currentRight = l2
    var newSorted: ListNode? = null
    var head: ListNode? = null
    var shouldContinue = true

    while (shouldContinue) {
        if (currentLeft != null && currentRight != null) {
            if (currentLeft.`val` < currentRight.`val`) {
                val newNode = ListNode(currentLeft.`val`)
                if (newSorted == null) {
                    newSorted = newNode
                    head = newSorted
                } else {
                    newSorted.next = newNode
                    newSorted = newSorted.next
                }

                currentLeft = currentLeft.next
            } else if (currentLeft.`val` > currentRight.`val`) {
                val newNode = ListNode(currentRight.`val`)
                if (newSorted == null) {
                    newSorted = newNode
                    head = newSorted
                } else {
                    newSorted.next = newNode
                    newSorted = newSorted.next
                }

                currentRight = currentRight.next
            } else {
                val newNode = ListNode(currentRight.`val`)
                if (newSorted == null) {
                    newSorted = newNode
                    head = newSorted
                } else {
                    newSorted.next = newNode
                    newSorted = newSorted.next
                }

                val newNode2 = ListNode(currentLeft.`val`)
                newSorted?.next = newNode2
                newSorted = newSorted?.next

                currentRight = currentRight.next
                currentLeft = currentLeft.next
            }
        } else if (currentLeft == null && currentRight != null) {
            val newNode = ListNode(currentRight.`val`)
            if (newSorted == null) {
                newSorted = newNode
                head = newSorted
            } else {
                newSorted.next = newNode
                newSorted = newSorted.next
            }

            currentRight = currentRight.next
        } else if (currentLeft != null && currentRight == null) {
            val newNode = ListNode(currentLeft.`val`)
            if (newSorted == null) {
                newSorted = newNode
                head = newSorted
            } else {
                newSorted.next = newNode
                newSorted = newSorted.next
            }

            currentLeft = currentLeft.next
        }

        shouldContinue = currentLeft != null || currentRight != null
    }

    return head
}


/*
    while (currentLeft != null) {
        nextLeft = currentLeft.next

        while (currentRight != null) {
            nextRight = currentRight.next

            if (currentLeft.`val` > currentRight.`val`) {
                if (current == null) {
                    head = currentRight
                }

                currentRight.next = currentLeft
                current = currentLeft

            } else if (currentLeft.`val` < currentRight.`val`) {
                if (current == null) {
                    head = currentLeft
                }

                currentLeft.next = currentRight
                current = currentRight
            }


            currentRight = nextRight
        }

        currentLeft = nextLeft
    }
 */


/*

  if(currentLeft == null){
            if (newSorted == null) {
                newSorted = ListNode(currentRight!!.`val`)
                head = newSorted
            } else {
                newSorted.next = ListNode(currentRight!!.`val`)
                newSorted = newSorted.next
            }
            currentRight = currentRight.next
            continue
        }
        if(currentRight == null){
            if (newSorted == null) {
                newSorted = ListNode(currentLeft.`val`)
                head = newSorted
            } else {
                newSorted.next = ListNode(currentLeft.`val`)
                newSorted = newSorted.next
            }
            currentLeft = currentLeft.next
            continue
        }


        if (currentLeft.`val` < currentRight.`val`) {
            if (newSorted == null) {
                newSorted = ListNode(currentLeft.`val`)
                head = newSorted
            } else {
                newSorted.next = ListNode(currentLeft.`val`)
                newSorted = newSorted.next
            }
            currentLeft = currentLeft.next
        } else if (currentLeft.`val` > currentRight.`val`) {
            if (newSorted == null) {
                newSorted = ListNode(currentRight.`val`)
                head = newSorted
            } else {
                newSorted.next = ListNode(currentRight.`val`)
                newSorted = newSorted.next
            }
            currentRight = currentRight.next
        } else{
            if (newSorted == null) {
                newSorted = ListNode(currentRight.`val`)
                head = newSorted
            } else {
                newSorted.next = ListNode(currentRight.`val`)
                newSorted = newSorted.next
            }
            currentRight = currentRight.next
        }

 */