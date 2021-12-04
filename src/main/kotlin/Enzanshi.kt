// 演算子
/*
 * 単項演算子
 * 単項演算子はオペランドが1つだけである演算子
 * ※オペランド = 数式を構成する要素のうち、演算の対象となる値や変数、定数などのこと
 * 下記は単項演算子の例
 */
fun main1(){
    var a = 1
    +a
    -a
    !true
    a++
    a--
    ++a
    --a
}
/*
 * 二項演算子
 * 二項演算子はオペランドと演算子によって構成された演算子
 * 下記は二項演算子の例
 */
fun main2(){
    var a = 1
    var b = 2
    a + b

    a = 2
    b = 1
    a - b

    a = 2
    b = 5
    a * b

    a = 10
    b = 2
    a * b

    a = 10
    b = 2
    a % b
}
/*
 * 三項演算子
 * Kotlinには三項演算子は無いが代わりにif(foo) a else bのように
 * if文で同等の機能を使える
 */

/*
 * 範囲をしてする演算子
 * 範囲を指定する演算子は「..」を用いて数値や文字の範囲を指定する
 */
fun main3(){
    for (i in 1..10){
        println(i) // 1〜10までが出力される
    }

    for (a in 'a'..'z'){
        println(a) // a〜zまでが出力される
    }

    println(5 in 1..10) // trueが返ってくる
    println(5 !in 1..10) // falseが返ってくる
}
/*
 * 代入演算子
 * 代入演算子は変数を代入する演算子
 * 右オペランドの値を「=」で左オペランドに代入する
 */
fun main4(){
    var a = 10
    a += 5 // 15

    a = 10
    a -= 5 // 5

    a = 10
    a *= 5 // 50

    a = 10
    a /= 5 //2

    a = 10
    a %= 5 //0
}
/*
 * 比較演算子
 * 比較演算子は2つのオペランドが等価であるかなど比較したい場合に利用する演算子
 * 内容が一致しているかを比較する際は「==」、
 * 2つのオペランドが同じオブジェクトであるかを比較（参照比較）する際は「===」
 */
fun main5(){
    1 == 1 // true
    "abc" != "abc" // false

    10 > 1 // true
    10 < 1 // false

    5 >= 5 // true
    5 <= 5 // false

    val use1 = User(id = 1)
    val use2 = User(id = 1)
    use1 == use2 // true
    use1 === use2 // 参照が異なるのでfalse
}

data class User(val id : Int) // データクラス

/*
 * エルビス演算子
 * エルビス演算子（「?:」）はオペランドがNullの場合に指定したオペランドを返すことができる演算子
 * Nullチェックが不要になる
 */
fun main6(){
    val input : String? = null
    val text = input ?: "default"
    println(text) // defaultが表示される
}