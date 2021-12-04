// List
/*
 * Listは複数のオブジェクトを保持できる
 * 位置を示すインデックスによって要素にアクセスできる順序付きのコレクション
 * List内のデータによって同じ要素が複数回出現する場合もある
 * イミュータブル（不変）なリストとミューダブル（可変）なMutableListを生成でき、
 * 初期化以外にも変更する場合はMutableListを利用する必要がある
 * Kotlin1.4からは末尾カンマをサポートしている
 */
fun main(){
    val list  = listOf(1,2,3,) // Kotlin1.4から末尾カンマをサポート
    println(list) // [1,2,3]
    //list +=4 // イミュータブルなので要素を追加できない
    //list -=3 // イミュータブルなので要素を削除できない

    // MutableListはvalで宣言していてもMutableListの参照を介して要素を変更できる
    val mutableList = mutableListOf(1,2,3)
    mutableList += 4 // ミューダブルなので要素を追加できる
    mutableList -= 3 // ミューダブルなので要素を削除できる
    println(mutableList) // [1,2,4]

    // Listの範囲を超えてアクセスすると例外でArrayIndexOutOfBoundsExceptionが発生する
   //list[10]

    // 「varargs」の機能を使って引数のサイズを動的に生成できる
    // コレクション数を展開したい場合は「*」のスプレッド演算子を利用することで配列展開される
    fun varargs(vararg elements : Int){
        for (i in elements){
            println(i)
        }
    }

    varargs(1,2,3) // 1、2、3が出力される

    val list2 = listOf(4,5,6)
    varargs(1,2,3, *list2.toIntArray()) // *のスプレッド演算子を使って1、2、3、4、5、6が表示される
}