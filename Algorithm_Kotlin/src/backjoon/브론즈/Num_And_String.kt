
fun Num_And_String(s:String):Int{
    var answer:Int = 0

    var numSet = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

    var str = s
    for(i in 0 until numSet.size){
        str = str.replace(numSet[i], i.toString())
    }

    return str.toInt()
}

fun main(args:Array<String>){
    val stnum:String = "one4seveneight"

    val result = Num_And_String(stnum)
    println(result)
}
