//列挙型
/*
 * 列挙型は複数の定数を1つのタイプとして宣言できる
 * Kotlinでは、enumを用いて列挙型であると宣言する
 * 利用可能な定数を指定できるので、エラーの可能性を減らすことができる
 */
enum class Color {
    Red,
    Green,
    Blue
}

fun main() {
    val red = Color.Red
    if (red == Color.Red){
        println(red) // 「Red」が表示される
    }

// 列挙型に内包された機能
/*
 * 列挙型には幾つか便利な機能がある
 * ordinalプロパティは0から始まる序数を表す
 */
    Color.Red.ordinal // 0
    Color.Green.ordinal // 1
    Color.Blue.ordinal // 2
/*
 * nameプロパティは列挙型の名前を知ることができる
 */
    Color.Red.name // Red
    Color.Green.name // Green
    Color.Blue.name // Blue

}
