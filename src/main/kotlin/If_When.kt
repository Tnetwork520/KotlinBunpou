// 条件分岐
/*　
 * if文
 * if文は条件分岐を加えるときに用いる方法
 * if()の中に条件式を入れ、trueの場合は「{}」で囲った処理が行われる
 */
fun mainIf(){
    var a : Int = 1
    if (a == 1){ // trueなので処理が行われる（falseの場合は処理されない）
        // 処理1
    } else { // 上記で処理が行われるとそれ以降の分岐の処理は行われない
        // 処理2
    }
}

/*
 * When式
 * Whenを用いて条件分岐を行うこともできる
 */
fun mainWhen(){
    val weather = "sunny"

    when(weather){
        "sunny" -> { /* sunnyの場合の処理 */ }
        "cloudy" -> { /* cloudyの場合の処理 */ }
        "rainy" -> { /* rainyの場合の処理 */ }
        else ->{ /* 上記以外の場合の処理 */ }
    }
}
/*
 * When式と列挙型
 * 列挙型であるenum classを条件式に使用することもできる
 */
enum class Weather{
    Sunny,
    Cloudy,
    Rainy
}
fun mainWhen2(){
    val weather = Weather.Sunny

    when(weather){
        Weather.Sunny -> { /* sunnyの場合の処理 */ }
        Weather.Cloudy -> { /* cloudyの場合の処理 */ }
        Weather.Rainy -> { /* rainyの場合の処理 */ }
        // When式は全ての条件を順次照会するので基本的にはelseが必須
        // 列挙型で全ての条件を網羅するとelseが不要になる
        // 下記は不要のため自動でソースコードがグレーアウトされた
        else ->{ /* 上記以外の場合の処理 */ }
    }
}