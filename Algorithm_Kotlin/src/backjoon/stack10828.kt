import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) {
    var st = Stack<Int>()
    var br = BufferedReader(InputStreamReader(System.`in`))
    var sb = StringBuilder()
    val num: Int = br.readLine().toInt()
    for (i in 1..num) {
        var str = br.readLine()!!.split(" ").map { it.toString() }
        when(str[0]){
            "push" -> st.push(str[1].toInt())
            "pop" -> {
                if (st.empty())
                    sb.append("-1\n")
                else {
                    sb.append("${st.peek()}\n")
                    st.pop()
                }
            }
            "size" ->             sb.append("${st.size}\n")
            "empty" -> {
                if (st.empty())
                    sb.append("1\n")
                else
                    sb.append("0\n")
            }
            "top" -> {
                if (st.empty())
                    sb.append("-1\n")
                else
                    sb.append("${st.peek()}\n")
            }
        }
    }
    println(sb)
}