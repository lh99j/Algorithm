import java.io.*
import java.util.*
import kotlin.collections.ArrayDeque

fun main(args:Array<String>){
    var br = BufferedReader(InputStreamReader(System.`in`))
    var sb = StringBuilder()
    var d : Deque<Int> = LinkedList<Int>()

    var num = br.readLine().toInt()

    for(i in 0 until num){
//        var str = br.readLine().split(" ").map { it.toString() }
        var st : StringTokenizer = StringTokenizer(br.readLine(), " ")

        when(st.nextToken()){
            "push" -> {
                d.offer(st.nextToken().toInt())
            }
            "pop" -> {
                if(d.isEmpty())
                    sb.append("-1\n")
                else
                    sb.append("${d.pollFirst()}\n")
            }
            "size" -> sb.append("${d.size}\n")
            "empty" -> {
                if(d.isEmpty())
                    sb.append("1\n")
                else
                    sb.append("0\n")
            }
            "front" -> {
                if(d.isEmpty())
                    sb.append("-1\n")
                else
                    sb.append("${d.peekFirst()}\n")
            }
            "back" -> {
                if(d.isEmpty())
                    sb.append("-1\n")
                else
                    sb.append("${d.peekLast()}\n")
            }
        }
    }

    println(sb)
}