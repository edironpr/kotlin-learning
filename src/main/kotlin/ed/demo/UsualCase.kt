package ed.demo

/*
    会为 Customer 类提供以下功能：

    - 所有属性的 getter （对于 var 定义的还有 setter）
    - equals()
    - hashCode()
    - toString()
    - copy()
    - 所有属性的 component1()、 component2()……等等
 */
class Customer(var name: String, var email: String) {

    fun placeOrder() {
        println("A new order is placed by $name")
    }

}


fun main() {

    // ----------------------------- 函数默认参数 -----------------------------
    fun foo(a: Int = 0, b: String = "") {

    }

    // ----------------------------- 过滤 list -----------------------------
    val list = listOf(-2, -1, 0, 1, 2, 3, 4)
    val positive1 = list.filter { i -> i > 0 }
    val positive2 = list.filter { it > 0 }

    // ----------------------------- 检测元素是否存在于集合中 -----------------------------
    if (3 in positive1) {
    }
    if (3 !in positive2) {
    }

    // ----------------------------- 字符串内插 -----------------------------
    val s = "Jack"
    println("Name: $s")

    // ----------------------------- 类型判断 -----------------------------
    val x = Any()
    when (x) {
        is String -> println("String")
        is Int -> println("Int")
        else -> println("[UNKNOWN]")
    }

    // ----------------------------- 只读 list -----------------------------
    val readOnlyList = listOf("Jack", "Tom", "Alice")

    // ----------------------------- 只读 map -----------------------------
    val readOnlyMap = mapOf("a" to 1, "b" to 2, "c" to 3, "d" to 4)

    // ----------------------------- 访问 map 条目 -----------------------------
    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    println(map["a"])
    map["c"] = 0

    for ((k, v) in map) {
        println("$k -> $v")
    }

    // ----------------------------- 区间迭代 -----------------------------


}
