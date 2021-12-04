// Map
/*
 *　Mapはキーと値をペアのセットで持つコレクション
 * キーは一意、Listと同様に同じデータを持つ場合がある
 * イミュータブルなMapとミュータブルなMutableMapを生成できる
 */
fun main(){
    val map = mapOf("phone" to "111-1111-1111" , "address" to "123")
    println(map) // { phone=111-1111-1111 , address=123 }
    // map["address"] = "1234" // イミュータブルなので値を変更できない

    val mutableMap = mutableMapOf("phone" to "111-1111-1111" , "address" to "123")
    mutableMap["address"] = "1234" // イミュータブルなので値を変更できない
    println(mutableMap) // { phone=111-1111-1111 , address=1234 // }

    // Mapからキーを使って、値を取得できるがキーが存在しない場合はNullが返る
    val  map2 =  mapOf("phone" to "111-1111-1111" , "address" to "123")

    for (enttry in map2){
        println("Key:${enttry.key} value:${enttry.value}")
        // key:phone value:111-1111-1111が表示される
        // key:address value:123が表示される
    }

    println(map["phone-number"]) // nullが返る
}