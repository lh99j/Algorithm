package programmers.level1

import java.util.*

class KakaoCrane {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        var craneStack: Stack<Int> = Stack<Int>()

        for (i in 0 until moves.size) {
            var searchFlag: Boolean = true
            var moveIndex = moves[i] - 1
            for (j in 0 until board.size) {
                if (board[j][moveIndex] != 0 && searchFlag == true) {
                    if (craneStack.isEmpty())
                        craneStack.push(board[j][moveIndex])
                    else if (craneStack.isNotEmpty() && craneStack.peek() == board[j][moveIndex]) {
                        craneStack.pop()
                        answer = answer + 2
                    } else if (craneStack.isNotEmpty() && craneStack.peek() != board[j][moveIndex])
                        craneStack.push(board[j][moveIndex])
                    board[j][moveIndex] = 0
                    searchFlag = false
                }

            }

        }

        return answer
    }
}

fun main(args: Array<String>) {
    val crane: KakaoCrane = KakaoCrane()
}