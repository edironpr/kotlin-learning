package ed.demo

class Sample {

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${sum(a, b)}")
    }

    fun printSumDetail(a: Int, b: Int) {
        println("[PARAMETERS]: $a $b")
        println("[OPERATOR]: +")
        println("[SUM]: ${sum(a, b)}")
    }
}
