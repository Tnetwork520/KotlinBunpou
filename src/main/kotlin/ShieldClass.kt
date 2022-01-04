// シールドクラス
/*
 * シールドクラスは、制限されたクラス階層を表現できるクラスで
 * sealed classを用いることで利用可能なタイプを制限できる
 * 次の例ではHTTPステータスに対してSuccess、Failureを保持するような
 * 状態管理でシールドクラスを利用している
 * Successにはcodeプロパティのみあるが,Failureはcode、errorプロパティが定義されている
 * when内でHTTPステータスを比較することでスマートキャストが有効になり、それぞれの状態に応じた
 * データクラスを安全に利用することができる
 */
fun handle(state : HttpState){
    when (state) {
        is HttpState.Success -> {
            state.code // スマートキャストされる
            // 成功時の処理
        }
        is HttpState.Failure -> {
            state.code // スマートキャストされる
            state.error //　スマートキャストされる
            // 失敗時の処理
        }
    }
}
sealed class HttpState{ // HttpStateシールドクラス
    // 成功を表したデータクラス
    data class Success(val code : Int) : HttpState()
    // 成功を表したデータクラス
    data class Failure(val code : Int, val error : String) : HttpState()
}

fun main(){
    handle(HttpState.Success(code = 200)) // handle()の成功時の処理が呼ばれる
}

/*
 * シールドクラスには列挙型のvalues()、names()、valueDf()などが提供されていない
 */
