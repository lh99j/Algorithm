fun main(args:Array<String>){

    val array1 = arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 4, 5))


    var sum = 0
    for(i in 0 until array1.size){
        for(j in 0 until array1[0].size){
            print(array1[i][j])
        }
        println()
    }


    for(i in 0 until array1.size){
        var sum = 0
        for(j in 0 until array1[0].size){
            sum += array1[i][i]
        }
        println(sum)
    }


}