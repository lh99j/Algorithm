fun main(args:Array<String>){
    val rp = readLine()!!.toInt()

    var array = Array(rp, {IntArray(2, {0})})

    var i:Int = 0

    while(i < rp){
        var (a, b) = readLine()!!.split(" ").map { it.toInt() }

        array[i][0] = a
        array[i][1] = b

        i++
    }

    var ranklist = ArrayList<Int>()

    for(i in 0 until rp){
        var rank:Int = 0

        for(j in 0 until rp){
            if(array[i][0] < array[j][0]){
                if(array[i][1] < array[j][1])
                    rank++
            }
        }
        ranklist.add(rank+1)

    }

    for(i in ranklist){
        print("$i ")
    }

}