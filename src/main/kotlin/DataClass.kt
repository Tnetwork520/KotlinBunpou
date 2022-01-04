// データクラス
/*
 * データを保持するようなクラスを作成する機会に便利なのが、データクラス
 * データクラスはdata classで宣言されたクラスを自動的にequals()、hashCode()、toString()などが生成され、
 * ボイラープレート（殆ど(全く)変化することなく、複数の場所で繰り返される定型コードのセクション）を減らす効果がある
 * プロパティはvar、valを指定できる
 */
fun main(){
    data class Color2( // データクラスの宣言
        val name : String,
        val code : String,
    )

    val dataA = Color2(
        name = "red",
        code = "FF0000",
    )

    val dataB = Color2(
        name = "red",
        code = "FF0000",
    )

    val dataC = dataA

    // equals()は「==」で呼び出せる
    // 「===」の場合は参照比較ができる
    println(dataA == dataB)  // 内容が一致しているのでtrueが返ってくる
    println(dataA === dataB) // 参照が異なるのでfalseが返ってくる
    println(dataA === dataC) // 参照が一致しているのでtrueが返ってくる
}

/*
 * クラスと同様にデータクラスもデフォルトでfinalだが、
 * openを利用できないため、継承できない
 */
//open data class Color( // コンパイルエラー
//    val name : String,
//    val code : String,
//)