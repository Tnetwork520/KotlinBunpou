// スコープ関数
/*
 * スコープ関数はオブジェクトにアクセスできる一時的なスコープを作成し、
 * ブロック内でオブジェクトが利用可能になることでコードを読みやすくする
 * いくつかにスコープ関数が提供されていて、これらの関数は基本的には同じよう処理を行うが異なる点もある
 * 【一覧】
 * ================================================
 * スコープ関数/コンテキストオブジェクト/戻り値/拡張関数
 * ------------------------------------------------
 * let/it/ラムダの実行結果/拡張関数である
 * run/this/ラムダの実行結果/拡張関数である
 * with/this/ラムダの実行結果/拡張関数ではない
 * apply/this/コンテキストのオブジェクト/拡張関数である
 * also/it/コンテキストのオブジェクト/拡張関数である
 * ================================================
 * ※コンテキストオブジェクトは、実行中に使用できる内部の JSON 構造
 *  渡す情報を設定しておくことにより、メソッドの起動時に無条件に情報を伝播してくれる
 */
import java.util.*

data class Color5(var name : String)

fun main() {
    val number = 10
    println(number.let { it * 2 })     // 20が表示される
    println(number.run { this * 2 })   // 20が表示される
    println(with(number) { this * 2 }) // 20が表示される
    println(number.also { it * 2 })    // 10が表示される
    println(number.apply { this * 2 }) // 10が表示される

    val black = Color5(name = "black")
    println(black.let { it.name = "white" })  // kotlin.Unitが表示される
    println(black.run { name = "white" })     // kotlin.Unitが表示される
    println(with(black) { name = "white" })   // kotlin.Unitが表示される
    println(black.also { it.name = "white" }) // Color5(name=white)が表示される
    println(black.apply { name = "white" })   // Color5(name=white)が表示される
    /*
     * スコープ関数はコードを簡潔にできるが、スコープ関数同士がネストした場合には
     * thisまたはitが複数登場するため、混乱を招く恐れがあるため注意が必要
     */
    // 戻り値のコンテキストオブジェクトとラムダの実行結果
    /*
     * スコープ関数の戻り値は2パターンある
     * はじめに戻り値のコンテキストオブジェクトは、コンテキストオブジェクト自体を返却しているため、
     * メソッドチェインのように関数を実行できる
     */
    val blue = Color5(name = "blue")

    val name1 = blue.apply {
        name = "red1"
    } // nameをRed1に変更したColorオブジェクトが返される
        // String.capitalize()は、現在Kotlinで非推奨のため置き換え
        .name.replaceFirstChar { if (it.isLowerCase())
            it.titlecase(Locale.getDefault())
                else it.toString() } // nameの先頭文字を大文字に変換する

    println(name1) // Red1が表示される

    val name2 = blue.let {
        it.name = "red2"
        it
    } // ラムダの実行結果として最後のitが返ってくる
        // String.capitalize()は、現在Kotlinで非推奨のため置き換え
        .name.replaceFirstChar { if (it.isLowerCase())
            it.titlecase(Locale.getDefault())
        else it.toString() } // nameの先頭文字を大文字に変換する

    println(name2) // Red2が表示される

    // コンテキストオブジェクトのthisとit
    /*
     * スコープ関数のコンテキストオブジェクトは2パターンある
     * コンテキストオブジェクトは短い参照名としてthisまたはitで呼び出すことができる
     * thisはレシーバー、itはラムダパラメータを表す
     */
    val yellow1 = Color5(name = "yellow1")
    yellow1.let { it.name = "brown1" } // ラムダパラメータとしてitが利用できる

    // レシーバーとそてthisが利用できる（thisを省略もできる）
    yellow1.apply { this.name = "brown1" }


    // itはラムダのパラメータなので、名前付きパラメータとして利用できる
    val  yellow2 = Color5(name = "yellow2")
    yellow2.let { args -> // コンパイルOK ラムダであるため名前付き引数を利用できる
        args.name = "brown2"
    }

//    yellow2.apply { args -> //  コンパイルNG ラムダのパラメータでないため
//        name2 = "brown2"
//    }
}
