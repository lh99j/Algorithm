fun main(args:Array<String>){
    val num = readLine()!!.toInt()

    var answer = 0
    for(i in 1..num){
        when(i){
            in 1..9 -> answer++
            in 10..99 -> answer+=2
            in 100..999 -> answer+=3
            in 1000..9999 -> answer+=4
            in 10000..99999 -> answer +=5
            in 100000..999999 -> answer  += 6
            in 1000000..9999999 -> answer += 7
            in 10000000..99999999 -> answer += 8
            else -> answer += 9
        }

    }

    print(answer)
}