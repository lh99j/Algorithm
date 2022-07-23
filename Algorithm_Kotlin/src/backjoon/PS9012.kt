import java.util.*
import java.io.*
fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()
    var sb = StringBuilder()

    for(i in 1 .. num){
        var str = br.readLine().toString()
        if(valid(str))
            sb.append("YES\n")
        else
            sb.append("NO\n")
    }
    println(sb)
}

fun valid(str: String) : Boolean{
    var st = Stack<Char>()

    for (i in 0 until str.length) {
        if (str[i] == '(')
            st.push('(')
        else {
            if(st.empty()) {
                return false
            }
            else
                st.pop()
        }
    }

    if(!st.empty())
        return false

    return true
}