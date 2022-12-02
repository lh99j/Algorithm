package programmers.level1

class Cloth {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = -1
        var array = Array(n + 1){ 1 }

        for(i in lost)
            array[i]--

        for(i in reserve)
            array[i]++

        for(i in 1..n){
            if(array[i] == 0){
                if(array[i - 1] == 2){
                    array[i - 1]--
                    array[i]++
                }else if(i < n){
                    if(array[i + 1] == 2){
                        array[i + 1]--
                        array[i]++
                    }
                }
            }
        }

        for(i in array){
            answer += if(i == 2) 1
            else i

        }
        return answer
    }
}