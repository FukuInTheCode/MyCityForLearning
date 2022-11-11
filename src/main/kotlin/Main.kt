fun main(){

    val SG = Bank("SG")
    val tom = SG.createAccount("Tom")
    val hugo = SG.createAccount("Hugo")
    val tesla = SG.createAccount("Tesla", true)
    tesla.deposit(1_000_000)
    tesla.withdraw(100)


}

