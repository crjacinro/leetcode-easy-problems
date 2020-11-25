package design

class MinStack {
    var stack = mutableListOf<Int>()
    var minimumList = mutableListOf<Int>()

    fun push(x: Int) {
        stack.add(x)

        if (minimumList.isEmpty() || x <= minimumList.last()) minimumList.add(x)
    }

    fun pop() {
        if (minimumList.last() == stack.last()) {
            minimumList.removeAt(minimumList.size - 1)
        }

        stack.removeAt(stack.size - 1)
    }

    fun top() = stack.last()

    fun getMin() = minimumList.last()
}