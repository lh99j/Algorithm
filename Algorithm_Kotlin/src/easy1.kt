fun main(args:Array<String>){
    val num = readLine()!!.toInt()

    for(i in 1..9){
        println("${num} * ${i} = ${num * i}")
    }
}