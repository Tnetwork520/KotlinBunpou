// クラス宣言
/*
 * クラスはオブジェクトを生成するための仕組み
 * 「class」を用いる
 */
class ClassSengen // クラス宣言
  fun main() {
      val classSengen = ClassSengen()
  }

/*
 * クラスの構成要素には、コンストラクタ、イニシャライザ、関数、
 * プロパティ、インナークラス、オブジェクトなどがある。
 * ここでは全ての親クラスはAnyになるため、Anyの内部に触れて内容紹介
 * Anyクラスを見るとopenキーワードが付加されていることがわかる
 * しかしclassはデフォルトでfinal宣言となり、継承できないクラスとして宣言される
 * Anyのように継承したいクラスに対しては、明示的に「open」で宣言する必要がある
 */
// Any.kt
/*
 * public open class Any{
 * }
 */