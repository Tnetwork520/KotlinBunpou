// Listと配列
/*
 *　Listが複数のオブジェクトを保持する一方で、配列は参照型のためアドレスを保持している
 * また配列はarrayOf()で生成でき、位置を示すインデックスを基に値の取得、変更ができる
 */
fun main(){
    println(listOf(1,2,3)) // Listで[1,2,3]が表示される
    println(arrayOf(1,2,3)) // 配列でアドレスが表示される

    val array = arrayOf(1,2,3)
    array[0] = 0
    for (a in array){
        println(a) // 0,2,3が出力される
    }

    // Listと配列では格納するものが異なるので操作に注意が必要
    // 「sizeメソッド」を使うことでListの要素数を確認できる
    val list1 = listOf(1,2,3)
    val list2 = listOf(1,2,3)
    println(setOf(list1,list2).size) // 1が出力される

    val array1 = arrayOf(1,2,3)
    val array2 = arrayOf(1,2,3)
    println(setOf(array1,array2).size) // 2が出力される

}
