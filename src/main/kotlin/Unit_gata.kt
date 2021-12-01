// Unit型
/* Unit型は型が全く無いことを表す
 *　一般的に値を返さない関数の戻り値として利用する
 * 関数の戻り値の指定がない場合は、暗黙にUnitが指定される
 */
fun logger1(message: String) : Unit { // 関数の戻り値はUnit型
    println(message)
}
fun logger2(message: String) { // 「: Unit」を省略もできる
    println(message)
}