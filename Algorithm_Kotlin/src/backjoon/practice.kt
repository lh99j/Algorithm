fun fibo(n : Int) : Int{
    if(n == 0)
        return 0
    else if(n == 1)
        return 1

    return fibo(n - 1) + fibo(n - 2)
}

fun main(args:Array<String>){
    val num = readLine()!!.toInt()
    print(fibo(num))
}