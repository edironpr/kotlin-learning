package ed.demo

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
