/*
* 定数はコンパイル時に定数として利用される「const」を使う
* 形式は、「const」+「val」+「定数名」+「:（コロン）」+「型」+「=」+「値」。
* constはトップレベルもしくはオブジェクト宣言かつ、String型などの基本型である必要がある。
*/
const val age : Int = 26 // 問題無く使える

//const val list : List<int> = listOf(1,2,3) //List型は基本型でないので使えない

// constが使える基本型一覧（とりあえず使いそうなもの）
const val valInt : Int = 0
const val valString : String = "abc" // 「""（ダブルクォート ）」で値を囲む
const val valBoolean : Boolean = false // 「false（偽）（デフォルト）」と「true（真）」のいずれか
const val valChar : Char = 'a' // 「""（シングルクォート ）」で値を囲む、読み方は「チャー」でも「キャラ」でもOK
const val valByte : Byte = 1 //
const val valShort : Short = 1 //
const val valLong : Long = 1L // 「L」省略可能。
const val valFlot : Float = 1.0F // 「F」が必須。
