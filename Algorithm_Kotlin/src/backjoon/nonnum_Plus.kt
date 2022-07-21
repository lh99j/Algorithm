fun nonnum_Plus(numbers:IntArray):Int{
    var answer:Int = 0

    var numberarray = arrayListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    var array = ArrayList<Int>()

    for(i in 0 until numbers.size){
        if(numberarray.contains(numbers[i])){
            numberarray.remove(numbers[i])
        }
    }

    for(i in numberarray){
        answer += i
    }

    return answer
}

fun main(args:Array<String>){

    val intarray = intArrayOf(1,2,3,4,6,7,8,0)
    val result = nonnum_Plus(intarray)

    println(result)
}