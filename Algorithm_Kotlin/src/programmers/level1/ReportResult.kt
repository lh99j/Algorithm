package programmers.level1

class ReportResult {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): List<Int> {
        var answer: IntArray = intArrayOf()
        var idMap: MutableMap<String, Int> = mutableMapOf()
        var reportList: MutableList<String> = mutableListOf()

        id_list.forEach {
            idMap[it] = 0
        }

        val reportDistinct = report.distinct()

        reportDistinct.forEach {
            var reportList = it.split(" ")
            idMap[reportList[1]] = idMap[reportList[1]]!!.toInt() + 1
        }

        idMap.forEach {
            if (it.value >= k)
                reportList.add(it.key)
        }

        idMap.clear()

        id_list.forEach {
            idMap[it] = 0
        }


        reportDistinct.forEach {
            var report = it.split(" ")
            if (reportList.contains(report[1])) {
                idMap[report[0]] = idMap[report[0]]!!.toInt() + 1
            }
        }


        return idMap.values.toList()
    }
}

fun main(args: Array<String>) {
    val solution = ReportResult()
    val list = solution.solution(arrayOf("muzi", "frodo", "apeach", "neo"), arrayOf("muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi", "apeach muzi"), 2)

    print(list)
}