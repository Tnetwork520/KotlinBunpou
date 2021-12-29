// 抽象クラス
/*
 * 抽象クラスを利用するにはabstractで宣言する必要がある
 * 関数やプロパティを抽象化できる
 * インターフェースと抽象クラスは似ているがインターフェースには状態はない
 * 下記はKotlinという実装クラスに対してChushoClassという抽象クラスを継承したサンプル
 */
abstract class ChushoClass{ // 抽象クラス
    abstract val version: Double

    abstract fun packageName() : String
}

class Kotlin : ChushoClass(){ // 実装クラス
    override val version = 1.4

    override fun packageName() = "example.Kotlin"
}

fun main(){
    val kotlin = Kotlin()
    println(kotlin.version) // 1.4が表示される
    println(kotlin.packageName()) // パッケージ名が表示される
}

