package design

import org.junit.Assert
import org.junit.Test

class MinStackTest {
    @Test
    fun should_have_correct_stack_result() {
        val stack = MinStack()
        stack.push(-2)
        stack.push(0)
        stack.push(-3)
        Assert.assertEquals(-3, stack.getMin())
        stack.pop()
        Assert.assertEquals(0, stack.top())
        Assert.assertEquals(-2, stack.getMin())
    }

    @Test
    fun should_have_correct_stack_result_1() {
        val stack = MinStack()
        stack.push(0)
        stack.push(1)
        stack.push(0)
        Assert.assertEquals(0, stack.getMin())
        stack.pop()
        Assert.assertEquals(0, stack.getMin())
    }

    @Test
    fun should_have_correct_stack_result_2() {
        val stack = MinStack()
        stack.push(2)
        stack.push(0)
        stack.push(3)
        stack.push(0)
        Assert.assertEquals(0, stack.getMin())
        stack.pop()
        Assert.assertEquals(0, stack.getMin())
        stack.pop()
        Assert.assertEquals(0, stack.getMin())
        stack.pop()
        Assert.assertEquals(2, stack.getMin())
    }
}