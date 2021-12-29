// オブジェクト宣言
/*
 * classではなくobjectで宣言すると、インスタンスを1つだけ保持するシングルトンクラスを生成できる
 */
//object Version{ // objectを宣言
//    const val KOTLIN = 1.4
//    const val GRADLE = 6.6
//    const val JETPACK_COMPOSE = 0.1
//
//    fun asMap() = mapOf( // 各定数をMapで取得する
//        "kotlin" to KOTLIN,
//        "gradle" to GRADLE,
//        "jetpack" to JETPACK_COMPOSE,
//    )
//}

/*
 * クラス内にオブジェクトを配置する方法として、companion object宣言がある
 * companion objectは、シングルトンで作られていて、内包されたプロパティや関数はクラスを開始て直接アクセスできる
 */
class Version{
    companion object{ // companion object宣言
        const val KOTLIN = 1.4
        const val GRADLE = 6.6
        const val JETPACK_COMPOSE = 0.1

        fun asMap() = mapOf(
            "kotlin" to KOTLIN,
            "gradle" to GRADLE,
            "jetpack" to JETPACK_COMPOSE,
        )
    }
}

fun main(){
    println(Version.KOTLIN) // 1.4が出力される
    println(Version.asMap()) // {kotlin=1.4, gradle=6.6, jetpack=0.1}が出力される
}

