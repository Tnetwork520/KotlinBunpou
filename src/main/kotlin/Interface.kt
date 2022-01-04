//　インターフェース
/*
 * インターフェースとは型の概念を宣言したもので、インターフェースの概念を実装することで機能になる
 * interfaceを用いると抽象化された関数やプロパティの宣言ができ、(デフォルト実装を除く)実装を保持しない
 * プロパティはバッキングフィールド(あるプロパティの値を保持するデータストレージ のこと)を持つことができないため、
 * setterを宣言できず、クラスでインターフェースを利用したい場合はオーバーライドする必要がある
 */
interface Animal { // interfaceの宣言
    val name : String // 抽象化したプロパティ
    fun greet(message : String) // 抽象化した関数
}

class Cat : Animal { // 実装クラスの宣言
    override val name: String // 実装プロパティ
        get() {
            return "Siamese"
        }

    override fun greet(message: String) { // 実装メソッド
        println("$name $message")
    }
}

/*
 * インターフェースは関数のデフォルトの実装を定義でき、再実装することなく再利用できる
 * 加えて関数だけでなくプロパティのgetterについてもデフォルトの実装ができる
 */
interface Calculator{
    val default
    get() = 2 // getterのデフォルト実装
    fun times(x : Int) = x * default // 掛け算する関数のデフォルトの実装
}

fun main(){
    val cat = Cat()
    println(cat.name) // Siameseが返ってくる
    cat.greet("Hello") // Siamese　Helloが返ってくる

    val runner = object : Calculator{}
    val result = runner.times(10)
    println(result) // 20が返ってくる
}