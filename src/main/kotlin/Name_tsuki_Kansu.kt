// 名前付き関数
/*
 *　引数が複数ある場合、利用する引数を明示的に宣言することで可読性が向上する
 */
fun main(){
    // 言語とバージョンを連結して返す関数
    fun helloworld(
        languege : String,
        version: Double
    ) : String {
        return "Hello $languege $version"
    }
    // 名前付き関数を使って関数を呼ぶ
    val helloWorld = helloworld(
        languege = "Kotlin",
        version =  1.4,
    )
    println(helloWorld) // 「Hello Kotlin 1.4」と表示される
}
/*
 * 名前付き引数には、デフォルト引数を使うことでさらに便利になる
 */
//fun main(){
//    // 言語とバージョンを連結して返す関数
//    fun helloworld(
//        languege : String,
//        version: Double = 1.4 // デフォルト引数を利用
//    ) : String {
//        return "Hello $languege $version"
//    }
//    val helloWorld = helloworld(languege = "Kotlin",)
//    println(helloWorld) // 「Hello Kotlin 1.4」と表示される
//}