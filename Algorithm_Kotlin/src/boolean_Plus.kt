fun solution(absolutes: IntArray, signs: BooleanArray): Int {
    var answer: Int = 0

    for(i in 0 until absolutes.size){
        if(signs[i] == false){
            absolutes[i] = -absolutes[i]
        }
    }

    for(i in absolutes){
        answer += i
    }

    return answer
}

fun main(args:Array<String>){

    var absolutes = intArrayOf(4, 7, 12)
    var signs = booleanArrayOf(true, false, true)

    var result = solution(absolutes, signs)

    println(result)
}