//　SAMインターフェース
/*
 *　SAMインターフェースは「Single Abstract Method」の略で「メソッドを1つしか持たない抽象クラス」
 * 利用するための注意点として、SAMインターフェースを利用するには、Kotlin 1.4 以上である必要がある
 * さらにinterfaceにfun宣言を加える必要があり、objectを使用する必要がないため、コードが読みやすくなる
 * SAMインターフェースで宣言することによって、インターフェースを呼び出す側でラムダを利用できる
 */

// Kotlin 1.3
interface Calculator2 {
    fun times(x : Int) : Int
}
// Kotlin 1.4
fun interface Calculator3 {
    fun times(x : Int) : Int
}

fun main(){
    val result = object : Calculator2{
        override fun times(x : Int) = x * 2
    }
    println(result.times(10)) // 20が返ってくる

    val result2 = Calculator3 {it * 3} // SAMインターフェースなのでラムダが利用できる
    println(result2.times(10)) // 30が返ってくる
}
