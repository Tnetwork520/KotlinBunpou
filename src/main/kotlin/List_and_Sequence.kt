// ListとSequence
/*
 *　Sequence（シーケンス）は順序的に操作せず、垂直的な評価をする
 * ListはlistOf()で生成し、SequenceはsequenceOf()で生成する
 *
 * ※itは暗黙の引数
 * ラムダ式（基本構文：「{引数->関数の本体}」）や関数letなどに使用できる
 */
fun main(){
    listOf(1,2,3,4,5,) // Listで生成する
        .map { println("map $it") ; it * 3 }
        .filter { println("filter $it"); it % 2 == 0 }
        .take(1)
        .forEach { println("list $it") }

    sequenceOf(1,2,3,4,5,) // Sequenceで生成する
        .map { println("map $it") ; it * 3 }
        .filter { println("filter $it"); it % 2 == 0 }
        .take(1)
        .forEach { println("list $it") }
}
