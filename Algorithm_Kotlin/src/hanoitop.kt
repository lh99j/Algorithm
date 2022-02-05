import java.lang.StringBuilder


fun main(args:Array<String>){
    var sb = StringBuilder()
    var move:Int = 0

    fun hanoi(n:Int, start:Int, tmp:Int, to:Int){
        if(n==1){
            sb.append("$start $to\n")
            move++
        }else{
            hanoi(n-1, start, to, tmp)
            sb.append("$start $to\n")
            move++
            hanoi(n-1, tmp, start, to)
        }
    }

    val num:Int = readLine()!!.toInt()
    hanoi(num,1,2,3)
    println(move)
    print(sb)
}