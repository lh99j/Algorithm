fun main(args:Array<String>){
    val (a, b) = readLine()!!.split(" ").map{it.toInt()}

    val array = readLine()!!.split(" ").map{it.toInt()}
    var list = ArrayList<Int>()

    for(i in 0 until array.size){
        list.add(array[i])
    }

    var sum:Int = 0

    for(i in 0 until list.size){
        for(j in i+1 until list.size){
            for(k in j + 1 until list.size){
                var total = list[i] + list[j] + list[k]
                if(total <= b){
                    if(total > sum){
                        sum = total
                    }
                }
            }
        }
    }

    println(sum)
}