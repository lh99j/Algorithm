fun tailfactorial(n: Int, total:Int = 1): Int {
    if(n==1){
        return total
    }else {
        return tailfactorial(n - 1, n * total)
    }
}

fun factorial(n:Int):Int{
    if(n==0){
        return 1
    }else{
        return n * factorial(n - 1)
    }
}

fun main(args: Array<String>) {
    val a:Int = readLine()!!.toInt()

    println(factorial(a))
}