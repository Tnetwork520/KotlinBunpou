// プロパティ
/*
 * プロパティはアクセスされた時にフィールド※のように振る舞い、
 * フィールドはクラス内部で状態を保持する
 * （※オブジェクト指向プログラミングにおいて、クラスやオブジェクトでカプセル化されたデータを指す）
 * プロパティの実装はアクセサリ（getter、setter）を使用し、プロパティがアクセスされた時や
 * 値を割り当てたときにアクセサリで定義された内容が実行される
 * また、プロパティはvarもしくはvalを用いて宣言でき、必ず初期化する必要がある
 * 下記の通り、インスタンスからプロパティにアクセスできる
 */
class Language{
    val lang : String = "Kotlin" // プロパティの初期化が必要
    var version : Double = 1.4   // プロパティの初期化が必要
}
/*
 * プロパティはgetterもしくはsetterを自動生成するがカスタマイズして
 * getter、setterを定義することもできる
 * var宣言に対してはget()、set()、val宣言に対してはget()を利用することができる
 */
class Language2{
    val lang : String get() = "Kotlin" // val宣言なので、set()が利用できない

    var version : Double = 1.4 // var宣言なのでget()、set()が利用できる
    get() {
        println("Get value = $field")
        return field
    }
    set(value) {
        field = value
        println("Set value =$value")
    }
}

fun main(){
    val language = Language()
    println(language.lang)    // Kotlinが表示される
    println(language.version) // 1.4が表示される
    language.version = 1.5
    println(language.version) // 1.5が表示される


    val language2 = Language2()
    println(language2.lang)    // Kotlinが表示される
    println(language2.version) // 1.4が表示される
    language2.version = 1.5
    println(language2.version) // 1.5が表示される
}

