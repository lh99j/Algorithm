fun main(args:Array<String>){

    var array = ArrayList<Int>()
    while(true){
        var sum = 0
        var (a, b) = readLine()!!.split(" ").map { it.toInt() }

        if(a == 0 && b == 0){
            break
        }

        sum = a + b

        array.add(sum)
    }

    for(i in 0 until array.size){
        println(array[i])
    }
}