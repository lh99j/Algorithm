package programmers.level1

class DivisorCountPlus {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0

        for(i in left..right){
            var num = 0
            for(j in 1..i){
                if(i % j == 0)
                    num++
            }

            if(num % 2 == 0)
                answer += i
            else
                answer -= i
        }

        return answer
    }
}

fun main(args:Array<String>){

}