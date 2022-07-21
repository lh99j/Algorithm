fun fibonacci(n:Int):Int{
    if(n==1){
        return 1
    }else if(n == 0){
        return 0
    }else{
        return fibonacci(n - 1) + fibonacci(n - 2)
    }
}

fun main(arags:Array<String>){
    val a:Int = readLine()!!.toInt()

    println(fibonacci(a))
}