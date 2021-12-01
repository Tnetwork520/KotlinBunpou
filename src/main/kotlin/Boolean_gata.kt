 fun main(){
  // Boolean型は、プール値（論理値）を表す型でtrue、falseのいずれかの値を表す
  val is0 : Boolean = false
  val is1 : Boolean = true

  println(is0)
  println(is1)

  println()
  /*
   * Booleanのビルドイン演算子には、「||」「&&」「!」を含む
   * || = 1つ以上の条件がtrueである場合、trueを返す
   * && = 全ての条件がtrueである場合、trueを返す
   * ! = 値を否定する
   */
  var resultOutput : Boolean = false
  // 「true || false」 = 「true」を返す
  resultOutput = is1 || is0
  println(resultOutput)
  // 「false || false」 = 「false」を返す
  resultOutput = is0 || is0
  println(resultOutput)
  // 「true && true」 = 「true」を返す
  resultOutput = is1 && is1
  println(resultOutput)
  // 「true && false」 = 「false」を返す
   resultOutput = is1 && is0
  println(resultOutput)
  // 「!true」 = 「false」を返す
   resultOutput = !is1
  println(resultOutput)
  // 「!false」 = 「true」を返す
   resultOutput = !is0
  println(resultOutput)
 }