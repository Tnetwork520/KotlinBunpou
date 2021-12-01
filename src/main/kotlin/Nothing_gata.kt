// Nothing型
/*
 * Nothing型は全てのサブクラス
 * すべてのクラスを多重継承しているので、どんなメソッドでも呼び出せる
 * そのような型は実現不可能なので Nothingのインスタンスは存在しない
 */

fun alwaysFail(): Nothing {
    throw RuntimeException()
}

fun foo(bar: Int): String {
    when (bar) {
        0 -> return "A"
        1 -> return "B"
        2 -> return "C"
        else -> alwaysFail()
    }
}