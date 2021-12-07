// 関数宣言
/*
 * 関数は「fun」を用いて宣言する
 * 引数は再割り当てが不可で明示的に型を指定する必要がある
 * 戻り値に対して型を定義する必要があるが、何も定義しない場合は、Unit型を返す
 * 関数名はキャメルケース（一語に繋げて表記する際に、各構成語の先頭を大文字にする方式）にする
 * クラスに限らずトップレベルで呼び出すこともできる
 */
fun main(){
    fun joinString( message1:String , message2:String) : String{
        return  "${message1}${message2}"
    }
    println(joinString("文字列","連結!!!")) // joinString()の戻り値の形式で「文字列連結!!!」が表示される
}
/*
 * 単一の処理内容であれば、1つの式にして宣言でき、型推論によって明示的に戻り値を省略できる
 */
//fun main(){
//    fun joinString( message1:String , message2:String) = "${message1}${message2}"
//    println(joinString("文字列","連結!!!")) // joinString()の戻り値の形式で「文字列連結!!!」が表示される
//}
