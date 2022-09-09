import java.util.*
import java.io.*

fun main(args:Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val q : Queue<Int> = LinkedList<Int>()
    val num = br.readLine().toInt()
    var answer : Int = 0

    for(i in 1 .. num){
        q.offer(i)
    }

    while(true){
        var temp : Int= num


        q.poll()
        if(q.isEmpty()) {
            answer = temp
            break
        }
        temp = q.poll()
        if(q.isEmpty()) {
            answer = temp
            break
        }
        q.offer(temp)
    }

    println(answer)
}