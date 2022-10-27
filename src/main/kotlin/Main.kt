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

//    println("What's your name?")
//    val name = readln()
//    println("Hello, $name!")

    var customer = Customer("ed")
    println(customer.name)
    customer.placeorder()







    class OutOne(p1: String) {
        var a: Int = 0
            set(value) {
                field = when {
                    value < 1 -> 1
                    else -> value
                }
            }
        var b: String

        init {
            b = p1
            a = b.length
        }

        constructor(p1: String, p2: String) : this(p1) {
            b = p1 + p2
            a = b.length
        }

    }

}
