fun main(args:Array<String>){
    val a = readLine()!!.toInt()
    var array = emptyArray<Int>()

    for(i in 1 .. a){
        val num = readLine()!!.toInt()
        array = array.plus(num)
    }

    array.sort()

    var count = 0
    var result = 0
    for(i in 0 until array.size){
        for(j in i until array.size){
            if(array[i + 5] - array[i] == 0){
                result = 0
            }

        }
    }
}