// イニシャライザ
/*
 * イニシャライザはコンストラクタよりも前に実行される処理で、
 * 「init」を用いて宣言する
 * さらにinitはブロック宣言を用いることで初期化時に必要な処理内容を記述できる
 */
class Initializer{
    init { // イニシャライザ
        println("Initializer")
    }

    constructor(){ // プライマリコンストラクタ
        println("Constructor Primary")
    }

    constructor(age:Int) :this() {
        println("Constructor Secondary: age = $age")
    }
}
fun main(){
    // InitializerとConstructor Primaryが表示される
    val user1 = Initializer()
    // InitializerとConstructor PrimaryとConstructor Secondary: age = 32が表示される
    val  user2 = Initializer(age = 32)
}
