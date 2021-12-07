// インライン関数
/*
 * インライン関数とは、その関数が利用される箇所に関数本体を挿入する関数
 * 関数を呼び出し、または、呼び出された時にオーバーヘッドを節約できる
 */
//fun main(){
//
//    fun bar(){
//        println("bar start")
//        println("bar end")
//    }
//
//    fun foo(){
//        println("foo start")
//        bar()
//        println("foo end")
//    }
//    // 「foo start」「bar start」「 bar end」 「foo end」が出力される
//    foo()
//}

// inlineを使って展開
fun main() {

    foo()
}
// inlineの利用。ローカルインライン関数はサポートされていないので、main()の外で定義
   inline fun bar(){
        println("bar start")
        println("bar end")
    }

   fun foo(){
       println("foo start")
       bar()
       println("foo end")
   }
