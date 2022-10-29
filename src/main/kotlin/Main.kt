val PI = 3.14


open class Shape

class Rectangle(length: Double, width: Double) : Shape() {
    var perimeter = (length + width) * 2
}

fun main(args: Array<String>) {
//    val s = "Hello World!"
//    println(s)
//
//    val x = s.hashCode()
//    when {
//        x < 1 -> println("x<1")
//        x >= 2 -> println("x>=2")
//    }
//
//    val arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
//    for (item in arr) {
//        if (item == 6) println(item)
//    }

    /*
    ------------------------------------------------------------
     */

//    println("What's your name?")
//    val name = readln()
//    println("Hello, $name!")

//    val customer = Customer("ed")
//    println(customer.name)
//    customer.placeOrder()

//    val sample = Sample()
//    val sum = sample.sum(1, 2)
//    println("sum=$sum")

//    println("sum of 12 and 23 is ${sample.sum(12, 23)}")

//    val sample = Sample()
//    sample.printSum(12, 23)

//    val sample = Sample()
//    sample.printSumDetail(12, 23)

//    val a: Int = 1 // 立即赋值
//    val b = 1 // 自动推断出 `Int` 类型
//    val c: Int // 如果没有初始值类型不能省略
//    c = 1 // 明确赋值
//
//    println("a=$a, b=$b, c=$c")

//    var x = 1
//    x += 1
//    println("x=$x")

//    println("PI=$PI")

//    val rectangle = Rectangle(1.0, 2.0)
//    println("The perimeter of the rectangle is ${rectangle.perimeter}")

//    -------------------------------- 注释 --------------------------------

    // 单行注释

    /*
        多行注释
     */

    /*
        /*
            嵌套注释
        */
     */

//    -------------------------------- 字符串模板 --------------------------------
//    var a = 1
//    val s1 = "a is $a"
//    println(s1)
//
//    a = 2
//
//    println("${s1.replace("is", "was")}, but now is $a")

    //    -------------------------------- 条件表达式 --------------------------------
//    fun maxOf1(x: Int, y: Int): Int {
//        return if (x > y) {
//            x
//        } else {
//            y
//        }
//    }
//
//    fun maxOf2(x: Int, y: Int) = if (x > y) x else y
//    println("max of 5 and 7 is ${maxOf1(5, 7)}")


//    -------------------------------- for 循环 --------------------------------
//    val list = listOf("Jack", "Tom", "Alice")
//    for (s in list) {
//        println(s)
//    }

//    for (idx in list.indices) {
//        println("item at $idx is ${list[idx]}")
//    }

    //    -------------------------------- when 循环 --------------------------------
//    fun describe(obj: Any): String {
//        return when (obj) {
//            1 -> "This value is One"
//            "Hello" -> "World!"
//            is Long -> "This Type is Long"
//            in 1..10 -> "This value is between 1 and 10"
//            !is String -> "This is not a string"
//            else -> "Unknown"
//        }
//    }
//    println(describe(1))
//    println(describe("Hello"))
//    println(describe(1L))
//    println(describe(5))
//    println(describe(true))
//    println(describe("x"))

//    -------------------------------- 循环表达式 --------------------------------

//    -------------------------------- while 循环 --------------------------------
//    val list = listOf("apple", "banana", "kiwifruit", "orange")
//    var idx = 0
//    while (idx < list.size) {
//        println("item at $idx is ${list[idx]}")
//        idx++
//    }

//    -------------------------------- 使用区间 --------------------------------
//    val x = 9
//    val y = 10
//    if (x in 1..y - 1) {
//        println("fits in range")
//    }
//
//    val list = listOf("a", "b", "c")
//    if (-1 !in 0..list.lastIndex) {
//        println("-1 is out of range")
//    }
//
//    if (list.size !in list.indices) {
//        println("list size is out of valid list indices range, too")
//    }
//
//    for (n in 1..5) {
//        print(n)
//    }
//    println()
//    for (n in 1..10 step 2) {
//        print(n)
//    }
//    println()
//    for (n in 9 downTo 0 step 3) {
//        print(n)
//    }

//    -------------------------------- 集合 --------------------------------
//    var list = listOf(1, 2, 3)
//    val set = setOf("apple", "banana", "kiwifruit")
//
//    for (item in list) {
//        println(item)
//    }
//
//    when {
//        "orange" in set -> println("juicy")
//        else -> println("others are fine too")
//    }
//
//    set.filter { !it.startsWith("k") }
//        .sortedBy { it }
//        .map { it.uppercase() }
//        .forEach { println(it) }

    //     -------------------------------- 空值与空检测 --------------------------------
//    fun parseInt(s: String): Int? {
//        return s.toIntOrNull()
//    }
//    fun printMultiplyValue(s1: String, s2: String) {
//        val x = parseInt(s1)
//        // 直接使用 `x * y` 会导致编译错误，因为它们可能为 null
//        if (x == null) {
//            println("$s1 is not a valid number")
//            return
//        }
//
//        val y = parseInt(s2)
//        if (y == null) {
//            println("$s2 is not a valid number")
//            return
//        }
//
//        // 在空检测后，x 与 y 会自动转换为非空值
//        println("x * y = ${x * y}")
//    }
//    printMultiplyValue("2", "3")
//    printMultiplyValue("a", "3")
//    printMultiplyValue("2", "b")

    //    -------------------------------- 类型检测与自动类型转换 --------------------------------
    /*
        is 操作符检测一个表达式是否某类型的一个实例。 如果一个不可变的局部变量或属性已经判断出为某类型，那么检测后的分支中可以直接当作该类型使用，无需显式转换
     */
    fun getStringLength1(obj: Any): Int? {
        // `obj` 在该条件分支内自动转换成 `String`
        if (obj is String) return obj.length
        // 在离开类型检测分支后，`obj` 仍然是 `Any` 类型
        return null
    }

    fun getStringLength2(obj: Any): Int? {
        // `obj` 在该条件分支内自动转换成 `String`
        if (obj !is String) return null
        // 在离开类型检测分支后，`obj` 仍然是 `Any` 类型
        return obj.length
    }

    fun getStringLength3(obj: Any): Int? {
        // `obj` 在该条件分支内自动转换成 `String`
        if (obj is String && obj.length > 0) return obj.length
        // 在离开类型检测分支后，`obj` 仍然是 `Any` 类型
        return null
    }

    fun printStringLength(obj: Any) {
        println("Getting the length of '$obj': ${getStringLength1(obj) ?: "[ERROR] The object is not a string"}")
    }

    printStringLength("make each day count")
    printStringLength(123456)
    printStringLength(listOf(Any()))

}
