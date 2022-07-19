import java.util.Stack

class bracket_change {
    fun solution(p: String): String {
        var answer = ""
        var str = ""
        var u = ""
        var v = ""

        return answer
    }

    fun valid(str : String):Boolean{
        var stack : Stack<Char> = Stack<Char>()

        for(i in 0 until str.length){
            stack.push(str[i])
        }
        return true
    }
}