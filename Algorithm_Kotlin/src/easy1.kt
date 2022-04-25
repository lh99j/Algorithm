fun main(args:Array<String>){
    val num = readLine()!!.toInt()
    var array1 = ArrayList<Int>()

    for(i in 1..num){
        var sum:Int = 0
        var (a, b) = readLine()!!.split(" ").map { it.toInt() }
        sum = a + b
        array1.add(sum)
    }

    for(i in 0 until array1.size){
        println(array1[i])
    }
}