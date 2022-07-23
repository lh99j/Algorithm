import java.io.*
import java.util.*
import kotlin.collections.ArrayList

fun main(args:Array<String>){
    var br = BufferedReader(InputStreamReader(System.`in`))
    var sb = StringBuilder()
    var list = ArrayList<Int>()

    val num = br.readLine().toInt()
    var arr = br.readLine().split(" ").map { it.toInt() }.toMutableList()

    for(i in 0 until arr.size){
        for(j in i+1 until arr.size){
            if(arr[i] < arr[j]){
                sb.append("array[j]")
                arr[i] = 10000000
            }
        }
        if(!(arr[i] == 10000000))
            sb.append("-1")
    }


    print("$sb ")
}
