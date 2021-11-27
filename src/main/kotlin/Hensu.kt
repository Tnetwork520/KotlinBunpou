fun main(){
    /*
     * 変数宣言は主に「var」と「val」を使う
     * var = 「variable（変数）」の略。再代入可能な変数。
     * val = 「value（値）」の略。再代入不可能な変数。
     */

    // 「var」の場合
    // 変数宣言は「var」+「変数名」+「:(コロン)」+「型」+「=」+「値（または初期化）」
    var counterVar : Int = 0
    println(counterVar) // 「0」が表示される

    // 再代入時は「変数名」+「=」+「代入変数（または初期化）」で行う
    counterVar = 1
    println(counterVar) // 「1」が表示される

    // 「val」の場合
    // 変数宣言は「val」+「変数名」+「:(コロン)」+「型」+「=」+「値」
    val counterVal : Int = 0
    println(counterVal) // 「0」が表示される

    // コンパイルエラーが起きる
    //counterVal = 1
    //println(counterVal) // ファイル内でエラーが起きるとコンパイルできない

}

