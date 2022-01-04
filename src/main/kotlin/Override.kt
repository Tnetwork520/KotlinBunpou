//　オーバーライド
/*
 * オーバーライドとは、オブジェクト指向プログラミングにおいて
 * 親クラス（スーパークラス）で定義したメソッドを継承した子クラス（サブクラス）で書き換えること
 * クラスがfinalであると同様にその関数もfinalになるため、関数に対してもopenを指定する必要がある
 * 関数に対してオーバーライドするには、「override」を利用する必要がある
 */
open class Language3{ // デフォルトがfinalなので、openを指定する
    open fun hello(){ //　デフォルトがfinalなので、openを指定する
        println("Hello Language3")
    }
}

class Kotlin3 : Language3(){
    override fun hello() { // overrideを使ってhello()をオーバーライドする
        println("Hello Kotlin")
        super.hello() // 継承
    }
}

/*
  * abstractを用いて抽象クラスとして宣言できる
  * 関数やプロパティなども抽象化できる
 */
abstract class Language4 { // abstractを用いてクラスを抽象化
    abstract fun hello() //　hello()を抽象化
}
class Kotlin4 : Language4(){
    override fun hello() {
        println("Hello Kokk,Kotlin4")
    }
}

fun main(){
    val kotlin3 = Kotlin3()
    kotlin3.hello() // 「Hello Kotlin」「Hello Language3」の順で表示される

    val kokkKolin4 = Kotlin4()
    kokkKolin4.hello() //「Hello Kokk,Kotlin4」と表示される
}
