// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND: JVM_IR

inline class R(private val r: Int) {
    fun test() = pf()

    companion object {
        private fun pf() = "OK"
    }
}

fun box() = R(0).test()