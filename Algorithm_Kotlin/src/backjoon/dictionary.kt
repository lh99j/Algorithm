class dicionary {
    fun solution(word: String): Int {
        var answer = 0
        var valuearr : Array<Int> = arrayOf(781, 156, 31, 6, 1)

        for(i in 0 until word.length){
            var value = findvalue(word[i])
            answer += valuearr[i] * value
        }

        answer += word.length

        return answer
    }

    fun findvalue(str : Char):Int{
        if((str == 'A')) {
            return 0
        }
        else if(str == 'E')
            return 1
        else if(str =='I')
            return 2
        else if(str == 'O')
            return 3
        else if(str == 'U')
            return 4

        return 0
    }
}



fun main(args: Array<String>){

    val sol = dicionary()
    val answer = sol.solution("AAAE")
    println(answer)

}
