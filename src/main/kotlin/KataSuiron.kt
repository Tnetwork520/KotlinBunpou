// 型推論
/*
 * Kotlinには型推論があるので、変数の型や関数の引数の型などの省略ができる
 */
var number = 0
var string = ""
var double = 12.514
var list = listOf(1,2)
var set = setOf(1,2)
var map = mapOf("a" to 10)

fun echo(message: String) = println("message : $message") // Unit型が返ってくる
fun joinString(message: String) = "message : $message" // String型が返ってくる

// 型推論によって型として認識されるため、下記の場合はエラーになる
fun main(){
    var int = 10
    var double = 12.514
    //int = double Int型とDouble型で型をキャストできないので代入できない
}

