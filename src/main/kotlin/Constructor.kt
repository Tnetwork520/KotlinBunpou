// コンストラクタ
/*
 * コンストラクタはクラスを初期化した瞬間に実行される関数
 * コンストラクタを利用する場合はconstructorを利用するが、指定しなくても
 * 暗黙的にconstructorが利用されるため、省略ができる
 */
class User1 constructor() // constructorを利用する

class User2 //　constructorを省略する

// コンストラクタの引数は必要に応じてvar、val、指定なしを利用できる
class User03(age:Int)
class UserVal(val age:Int)
class UserVar(var age:Int)

/*
 *
 */

fun main() {
    val user1 = User1() // クラスの初期化
    val user2 = User2() // クラスの初期化

    val user03 = User03(age = 31)
    // user.age にアクセスできない

    val userVal = UserVal(age = 31)
    // userVal.age = 32 // 再割り当てできない
    println(userVal.age)

    val userVar = UserVar(age = 31)
    userVar.age = 32     // 再割り当てできる
    println(userVar.age) // 32が表示される
}
