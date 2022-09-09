import java.io.*
import java.util.*

fun main(args:Array<String>){
    var st:Stack<Int> = Stack<Int>()
    var br = BufferedReader(InputStreamReader(System.`in`))
    val ct = br.readLine().toInt()
    var anwser = 0

    for(i in 1 .. ct){
        var num = br.readLine().toInt()
        if(num == 0)
            st.pop()
        else
            st.push(num)
    }
    for(i in st.indices){
        anwser += st.pop()
    }
    println(anwser)
}