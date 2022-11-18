fun main(args:Array<String>){

    fun fibo(x : Int) : Int {
        return if (x <= 2) {
            1
        }else
            fibo(x - 1) + fibo(x - 2)

    }

    println(fibo(6))


}