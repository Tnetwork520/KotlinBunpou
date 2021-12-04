// Null非許容型
/*
 * 最近の新しいプログラミング言語は
 * 参照型のNull許容性を明示できる構成が増えている
 * KotlinもNull許容型とNull非許容型に区別できる
 */
fun main(){
    var i2 : Int = 0 // Int型はNull非許容型
    //i2 = null nullを割り当てられない

/*
 * 型に対して「?」を付与しないとNull非許容型（Nullを割り当てられない）
 * 他の型の参考一覧
 */
//val int2 : Int = null
//val boolean2 : Boolean = null
//val string2 : String = null
//val char2 : Char = null
//val float2 : Float = null
//val double2 : Double = null
//val byte2 : Byte = null
//val long2 : Long = null

}