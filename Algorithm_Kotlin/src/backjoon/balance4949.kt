import java.util.Stack
import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args:Array<String>){
    var br = BufferedReader(InputStreamReader(System.`in`))
    var array = ArrayList<String>()
    var sb = StringBuilder()

    while(true){
        var str = br.readLine().toString()

        if(str == ".")
            break

        else
            array.add(str)
    }

    for(i in 0 until array.size){
        if(valid4949(array[i]))
            sb.append("yes\n")
        else
            sb.append("no\n")
    }

    println(sb)

//    for(i in 0 until array.size){
//        println(array[i])
//    }

}

fun valid4949(str: String) : Boolean{
    var st = Stack<Char>()

    for(i in str.indices){
        if(str[i] == '(' || str[i] == '[')
            st.push(str[i])
        else if(str[i] == ')'){
            if(st.empty() || !(st.peek() == '('))
                return false
            else
                st.pop()
        }else if(str[i] == ']'){
            if(st.empty() || !(st.peek() == '['))
                return false
            else
                st.pop()
        }
    }

    if(!st.empty())
        return false

    return true
}