// インナークラス宣言
/*
 * クラスの中にクラスを持つような構造を内部クラスとよび、
 * 外部クラスと内部クラスが分離されているため、内部クラスを隠蔽できる効果がある
 * 初めに下記へ単純なclassをネストする構造で挙動を説明
 * Versions.Kotlin()で直接、VersionsクラスからKotlinインスタンスを生成できるようになっている
 * ネストされたクラスは単に外部クラスの名前空間内のクラスとなっている
 * そのため内部クラスからouterVersionにアクセスできず、また外部クラスからinnerVersionにアクセスできない
 */
class Version1{
    var outerVersion1 = 0.0

    class  Kotlin1{
        var innerVersion1 = 1.4

        fun setOuterVersion(version: Double){
            // outerVersion1 = version //　コンパイルエラー　outerVersionを参照できないため
        }
    }
    fun setInnerVersion(version: Double){
        // innerVersion1 = version // コンパイルエラー innerVersionを参照できないため
    }
}
/*
 * 次にinner class宣言を用いて内部クラスを定義する
 * 内部クラスからouterVersionにアクセスできるようになる
 * この結果からinner class宣言によって、外部クラスから内部クラスへアクセスはできないが、
 * 内部クラスから外部クラスへアクセスを行えていることがわかる
 */
class Version2{
    var outerVersion2 = 0.0

    inner class  Kotlin2{
        var innerVersion2 = 1.4

        fun setOuterVersion2(version: Double){
            outerVersion2 = version //　outerVersion2を参照できる
        }
    }
    fun setInnerVersion(version: Double){
        // innerVersion2 = version // コンパイルエラー innerVersionを参照できないため
    }
}

fun main(){
    println(Version1.Kotlin1().innerVersion1) // 1.4が表示される
    println(Version2().Kotlin2().innerVersion2) // 1.4が表示される
}
