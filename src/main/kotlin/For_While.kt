// 繰り返し処理
/*
 * For文
 * 繰り返し処理を行う場合、For文を利用する方法
 */
fun mainFor(){
    for(i in 1..100){
        println(i) // 1〜100が出力される
    }

    for(a in listOf(1,2,3)){
        println(a) // 1,2,3が出力される
    }

    for(i in 1..100){
        if ( i == 50){
            break
        }
        println(i) // 1〜49が出力される
    }

    /*
     * ループに対してラベルを添付できる
     * 「@」に続く識別子を指定すると当該ラベルに対して制御処理を行うことができる
     */
    loop@ for (a in 1..5){  // ルートのfor文にloop@ラベルを指定する
        for (b in 1..5){
            if (a == 2 && b == 5){
                break@loop  // loop@ラベルのforを対象にbreakする
            }
            println("a:$a b$b") // a:1 b:1 から　a:2 b:4 までが表示される
        }
    }

}

/*
 * While文
 * 反復的な処理を行う処理でwhile、do-whileを利用する場合
 * （do-whileのブロック内は少なくとも1回実行される）
 */
fun mainWhile(){
    var i = 10
    while (i > 0){
        println(i) // 10〜1が表示される
        i--
    }

    var a = 1
    do {
        println(a)
        a++
    }while (a <= 10)

}

