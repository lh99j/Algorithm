package programmers

import java.util.*

class printer {
    fun solution(priorities: IntArray, location: Int): Int {
        var keyqueue: Queue<Int> = LinkedList()
        var valuequeue: Queue<Int> = LinkedList()
        var answer = 0
        var flag = 0

        for (i in 0 until priorities.size) {
            keyqueue.offer(i)
            valuequeue.offer(priorities[i])
        }

        while (!(valuequeue.isEmpty())) {
            var key = keyqueue.poll()
            var value = valuequeue.poll()

            if (valuequeue.any { value < it }) {
                keyqueue.offer(key)
                valuequeue.offer(value)
            } else {
                answer++
                if (location == key)
                    break
            }

        }
        return answer
    }
}

    fun main(args: Array<String>) {


    }