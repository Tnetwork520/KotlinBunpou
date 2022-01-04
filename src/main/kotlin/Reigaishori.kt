//　例外処理
/*
 * エラーが発生した時に例外を発生させることでエラーを停止して例外処理として実行させることができる
 * 例外を発生させるには、throwを使用して、try-catchを使用する
 * tryは式であるため結果を受け取ることができる
 * Throwableは全てのエラーもしくは例外の基本的なクラスで、throwまたはtry-catchでThrowableインスタンスを使用する
 * Kotlinには生産性とコード品質の観点から検査例外※が無い
 * 【検査例外※（catchしないとコンパイルエラーになる例外）】
 * ・IOException(入出力関係の例外)
 * ・SQLException(DB系の例外)
 *・ClassNotFoundException(クラスが見つからない)
 *・InstantiationException(インスタンス化不可のクラスをnewした時)
 *・InterruptedException(スレッドへの割り込み)
 *・NoSuchFieldException(クラスに要求したフィールドがない)
 *・NoSuchMethodException(クラスに要求したメソッドがない)
 */
// Throwable.kt
public open class Throwable(open val message :  String?,open val cause : Throwable?){
    constructor(message: String?) : this(message , null)

    constructor(cause: Throwable?) : this(cause?.toString() , cause)

    constructor() : this(null , null)
}

fun main(){
    // throwを使った例外発生
    // Exception in thread "main" java.lang.Exception: 例外と表示される
    throw Exception("例外")

    // キャストに失敗した例外発生
    // Exception in thread "main" java.lang.NumberFormatException: For input string: "a"と表示される
    "a".toInt()

    // try-catchを利用した例外ハンドリング
    try {
        val i= "a".toInt()
    }catch (e: Exception){
        println(e.message) // For input string: "a"と表示される
    }

    /*
     * try-catchはif、whenと同様に式として利用できる
     * finallyを用いることで終了処理を指定できる
     */
    val result = try {
        // 何かしらの処理
    }catch (e: Exception){
        // 例外処理
    }finally {
        // 終了処理
    }

}
