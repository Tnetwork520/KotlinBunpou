// Null許容型
/*
 * 最近の新しいプログラミング言語は
 * 参照型のNull許容性を明示できる構成が増えている
 * KotlinもNull許容型とNull非許容型に区別できる
 */
fun main(){
    var i1 : Int? =0 // Int型はNull許容型
    i1 = null // nullを割り当てられる

    /*
 * 型に対して「?」を付与する事で明示的にNull許容型であることを宣言できる
 * 他の型の参考一覧
 */
    val int1 : Int? = null
    val boolean1 : Boolean? = null
    val string1 : String? = null
    val char1 : Char? = null
    val float1 : Float? = null
    val double1 : Double? = null
    val byte1 : Byte? = null
    val long1 : Long? = null

/*
 * Null許容性を明示的に示すことによって、Nullを安全に扱うことができる
 * Null許容性が無いとランタイム時にNull参照にアクセスしてNullPointerExceptionが発生する場合がある
 * Kotlinではコンパイル時にNull参照に対してアクセスをするコードを記述すると警告を示して、
 * ランタイム前にNull安全と向き合うメリットがある
 */

// Nullの安全な呼び出し
    /*
     * Null許容型から関数やプロパティを直接呼び出せないため、
     * Null許容型に対してNullでないことを事前に検証する必要がある
     */
    var s1 : String? = "abc"
    //s1.length s1がNullかもしれないので、lengthプロパティを呼び出せない

    var s2 : String? = "abc"
    if (s2  !== null)
    s2.length // s2がNullでない場合なので、lengthプロパティを呼び出せる

    // Null許容型を?で連結することで安全なチェーン呼び出しができる
    var s : String? = "abc"
    println(s?.length) // 「3」が表示される
    s = null
    println(s?.length) // 「null]」// が表示される

// 事前条件における安全呼び出し
    /*
     * 事前にNullでないことを確認すると後続処理で安全に呼び出すことができる
     * 下記は標準ライブラリなど、事前検証を利用する方法
     */
    // require()
    // 「require()」は期待する引数であることを確認する
    val a : Int? = 24
    require(a != null) // aがnullでないこと
    println(a.toString(radix = 2)) // 2進数に変換でき、11000が表示される

    // check()
    // 「check()」は期待する状態であることを確認する
    val b : Int? = 32
    check(b != null) // bがnullでないこと
    println(b.toString(radix = 2)) // 2進数に変換でき、1000000が表示される

    // エルビス演算子（?:(スペース入れたらダメ)）はNullであれば、特定の処理を呼び出すことができる
    val c : Int? = 40
    c ?: return // Nullであれば早期にreturnする
    println(c.toString(radix = 2)) // 2進数に変換でき、101000が表示される
}
