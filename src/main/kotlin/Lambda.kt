// ラムダ
/*
 * ラムダは名前を持たない関数で無名関数と比べると
 * よりコンパクトに任意の関数を宣言できる
 * 関数同様にラムダは式であるため、結果を受け取ることができ、型推論も利用できる
 */
fun main(){
    val anonymous = fun() {} // 無名関数の宣言
    anonymous()              // 無名関数を実行

    val lambda = {} // ラムダの宣言
    lambda()        //ラムダを実行

    // ラムダは無名関数と比べてreturnが利用不可、名前付き引数が利用不可など違いがある
    // 無名関数
    val anonymous2 = fun(name : String) : String {
        return "$name anonymous2"
    }
    println(anonymous2("test method")) // test method anonymous2が表示される

    // ラムダ
    val lambda2 = { name : String ->    // ->の前に引数、->の後ろに処理を記述sる
        "$name lambda2"                 // returnは使えない
    }
    println(lambda2("test method"))     // test method lambda2が表示される 名前付き引数は使えない

    /*
     * 任意の関数からラムダを呼び出すには、引数に関数型を定義する必要がある
     * 引数が複数ある場合、最後の引数が関数型であればラムダとして利用できる
     */
    // 引数が1つの場合
    fun actionSingleArgument(action:()-> String) : String{
        return action() // 引数の関数を実行
    }

    val result1 = actionSingleArgument { "action" }
    println(result1)

    // 引数が複数の場合
    // 最後の引数を関数型にする
    fun actionMultipleArguments(list: List<Int> , action: (Int) -> Int ) : List<Int> {
        val mutableList = mutableListOf<Int>()

        list.forEach{
            mutableList.add(action(it))                         // action()結果を新しいListに追加する
        }

        return mutableList
    }

    val  result2 = actionMultipleArguments(listOf(1,2,3)) {     // 第一引数にListとラムダを利用する
        it * 2
    }

    println(result2)                                            // [2, 4, 6]が表示される
}
