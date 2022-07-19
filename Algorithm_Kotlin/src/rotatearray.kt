class rotatearray {
    fun solution(rows: Int, columns: Int, queries: Array<IntArray>): ArrayList<Int> {
        var answer = ArrayList<Int>()

        var array = Array(rows) { IntArray(columns) { 0 } }

        for(i in 0 until rows){
            for(j in 0 until columns){
                array[i][j] = i * columns + j + 1
            }
        }

        fun rotation(a1:Int, a2:Int, a3:Int, a4:Int):Int{
            var tmp = 0
            var temp = array[a1][a4]
            var min = temp

            for(i in a4 downTo  (a2 + 1)){
                if(min > array[a1][i])
                    min = array[a1][i]
                array[a1][i] = array[a1][i - 1]

            }

            var temp1 = array[a3][a4]
            for(i in a3 downTo (a1 + 1)){
                if(min > array[i][a4])
                    min = array[i][a4]
                array[i][a4] = array[i - 1][a4]
            }
            array[a1 + 1][a4] = temp


            var temp2 = array[a3][a2]
            for(i in a2 until a4){
                if(min > array[a3][i])
                    min = array[a3][i]
                array[a3][i] = array[a3][i + 1]
            }
            array[a3][a4 - 1] = temp1

            for(i in a1 until a3){
                if(min > array[i][a2])
                    min = array[i][a2]
                array[i][a2] = array[i + 1][a2]
            }
            array[a3 - 1][a2] = temp2


            return min

        }


        for(i in 0 until queries.size){
            answer.add(rotation(queries[i][0] - 1, queries[i][1] - 1, queries[i][2] - 1, queries[i][3] - 1))
        }

        return answer
    }
}

fun main(args:Array<String>){
    val cl = rotatearray()

    var answer = cl.solution(6, 6, arrayOf(intArrayOf(2, 2, 5, 4), intArrayOf(3, 3, 6, 6), intArrayOf(5, 1, 6, 3)))
//    var answer = cl.solution(100, 97, arrayOf(intArrayOf(1, 1, 100, 97)))

    for(i in answer.indices){
        println(answer[i])
    }
}
