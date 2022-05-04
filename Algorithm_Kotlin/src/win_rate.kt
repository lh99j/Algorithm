class win_rate {

    fun game(a:Long, b:Long):Long{
        var result:Long = 0
        var Z:Long


        var gamenum:Long = a
        var wingame:Long = b

        Z = (wingame * 100) / gamenum

        if(Z >= 99){
            result = -1
        }else{
            var left:Long = 0
            var right:Long = 1000000000
            while(left <= right){
                var mid:Long = (left + right) / 2

                if(Z < 100 * (wingame + mid) / (gamenum+mid)){
                    right = mid - 1
                }else{
                    left = mid + 1
                    result = left
                }
            }
        }
        return result
    }
}

fun main(args: Array<String>){
    val (a, b) = readLine()!!.split(" ").map { it.toLong() }

    var result:Long = 0
    val gammer1 = win_rate()

    result = gammer1.game(a, b)

    println(result)
}
