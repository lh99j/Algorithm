import java.util.Stack

class bracket_change {
    fun solution(p: String): String {
        var answer = ""
        var u = ""
        var v = ""

        if(p.length == 0)
            return  answer

            var i = 0
            var count1 = 0
            var count2 = 0
            var temp = 0

            for(i in 0 until p.length){
                u +=p[i]
                if(p[i] == '(')
                    count1++
                else
                    count2++

                if(count1 == count2){
                    v = p.substring(i+1,p.length)
                    break
                }
            }

            if(valid(u)){
                answer += u
                answer += solution(v)
            }
            else{
                var temp = "(" + solution(v) + ")"

                var remove = u.substring(1, u.length - 1)
                for(i in remove){
                    if(i == '(')
                        temp += ')'
                    else
                        temp += '('
                }
                answer += temp
            }
        return answer
    }

    fun valid(str: String): Boolean {
        val stack= Stack<Char>()

        for (i in 0 until str.length) {
            if (str[i] == '(')
                stack.push(str[i])
            else{
                if(stack.empty())
                    return false
                stack.pop()
            }
        }
        if(stack.size == 0)
            return true

        return false
    }

}

fun main(args: Array<String>) {
    val abc = bracket_change()
    print(abc.solution(")("))

}




