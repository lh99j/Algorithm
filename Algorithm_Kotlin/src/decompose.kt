fun main(args:Array<String>){
    val a = readLine()!!.toInt()

    var result:Int = 0
    var array = ArrayList<Int>()

    for(i:Int in 1..1000000){
        var j = i
        var N = i

        var num:Int = 0

        while(j > 0){
            num = j%10

            array.add(num)
            j /= 10
        }

        var sum:Int = 0

        for(k in 0 until array.size){
            sum += array[k]
        }

        if(sum + i == a){
            result = i
            println(result)
            break
        }else{
            array.clear()
        }
    }

    if(result == 0){
        println("0")
    }

}