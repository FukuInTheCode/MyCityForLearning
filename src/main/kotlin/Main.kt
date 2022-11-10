fun main(){

    val myBank = Bank("SG")
    val tom = myBank.createAccount("Tom")
    val hugo = myBank.createAccount("Hugo")
    print(myBank.accountsList)

}

