// Set
/*
 * SetはListに対して一意の要素を保持でき、重複を防ぐことができる順序無しのコレクション
 * イミュータブルなSetとミューダブルなMutableSetを生成できる
 */
fun main(){
    val set = setOf(1,2,3)
    println(set) // [1,2,3]
    //set += 4 // イミュータブルなので要素を追加できない
    //set -= 3 // イミュータブルなので要素を削除できない

    val  mutableSet = mutableSetOf(1,2,3)
    mutableSet += 4 // ミュータブルなので要素を追加できる
    mutableSet -= 3 // ミュータブルなので要素を削除できる
    mutableSet += 4 // ミュータブルなので要素を追加できるが重複しない
    println(mutableSet) // [1,2,4]
}