//　継承
/*
 * 継承は既存のクラスの動作を別のクラスから再利用する仕組み
 * Kotlinの親クラスはAnyであるため、全てのクラスにAnyが継承されている
 */
open class EmployeeBase  // コンストラクタ
{
    // フィールド
    var employeeName // 社員名
            : String? = null
    var divisionName // 部署名
            : String? = null
}

class EmployeeDev : EmployeeBase {
    // コンストラクタ
    constructor() {}

    // 引数ありコンストラクタ
    constructor(employeeName: String?) {
        super.employeeName = "Tnetwork"
        super.divisionName = "技術部"
    }
}

fun main(){
    println(EmployeeDev().divisionName + EmployeeDev().employeeName) // nullnullが表示される
    println(EmployeeDev("a").divisionName + EmployeeDev("b").employeeName) // 技術部Tnetworkが表示される
}