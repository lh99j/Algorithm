private fun Dotproduct(a: IntArray, b: IntArray): Int {
    var answer: Int = 0

    var result:Int = 0

    for(i in 0 until a.size){
        result = a[i] * b[i]
        answer += result
    }

    return answer
}

fun main(args:Array<String>){

    var a = intArrayOf(1, 2, 3, 4)
    var b = intArrayOf(-3, -1, 0, 2)

    var result = Dotproduct(a, b)



}