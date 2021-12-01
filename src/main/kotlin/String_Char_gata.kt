fun main(){
    // 文字リテラルはシングルクオートで囲う
    val character : Char = 'a'
    println(character)


    /* 文字列リテラル
     * 文字リテラルには、ダブルクオートで囲うものとトリプルクオートで囲う2種類がある
     * 文字列同士の比較には、「==」を利用する
     * trimMargin()は、
     */

    // ダブルクオートの場合
    val a : String = "abc"
    val b : String = "abc"
    println(a==b) // trueが返ってくる

    // トリプルクオートの場合
    /*
     * 文字列が長くなったり、変数を結合する時に役立つ
     * 「trimMargin()」はインデント（｜の前にある空白）と「|」を取り除いて、文字列を展開する
     * 複数行の文字列に対してフォーマットする
     */
    val world : String = "world"
    val result : String = """
        | Hello
        | $world
        | 
    """.trimMargin()
    println(result)


    // 文字列テンプレート
    /*
     * 文字列テンプレートは文字列を埋め込む機能
     * 変数を連結する他に「${}」で式や変数を展開する
     */
    val x1 : Int = 100
    val x2 : Int = 200
    println("${ x1 + x2}") // 300が表示される


    //文字列はコレクションとして扱える
    /*
     * 文字列はChar型のコレクション（複数の要素をひとつのユニットに集めたオブジェクト）であるため、
     * コレクションとして扱うことができる
     * 特定のインデックス指定することで文字を取得できる
     * コレクションは他にもマッピングやリファクタリング関数などを利用できる
     */
    val string : String = "Hello World"
    println(string[6]) // インデックス番号は「0」から順に数えていく
}

