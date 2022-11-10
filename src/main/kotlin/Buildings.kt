class Bank(val name:String) {

    inner class Account(val owner:String, val isProfessional:Boolean = false, val ID:Int) {

        // init of the inner class
        private var balance = 0.0
        private var records = mutableListOf<Int>()
        private var bankPercentage = 1.0

        init {
            if (isProfessional)
                bankPercentage = 0.995
        }


        fun deposit(amount:Int){
            if(amount > 0){
                this.balance += amount * this.bankPercentage

                this@Bank.bankProfits += amount * (1 - this.bankPercentage)

                this.records.add(amount)

                println("$amount has been deposit on your account. Your Balance is now $balance")
            } else
                println("Your amount is not valid. Please enter a strictly positive amount.")

        }


        fun withdraw(amount: Int){
            if (amount > 0 ){
                this.balance -= amount
                this.records.add(-amount)
                println("$amount has been withdrawn from your account. Your Balance is now $balance")
            }else{
                println("Your amount is not valid. Please enter a strictly positive amount.")
            }

        }
    }

    // init of the outer class
    private var accountsList = mutableListOf<Account>()
    private var bankProfits = 0.0

    fun createAccount(owner:String, isProfessional:Boolean = false): Bank.Account{
        var tmp = this.Account(owner, isProfessional, this.accountsList.size)
        this.accountsList.add(tmp)
        println("$owner's Account has been successfully created. Thank you for trusting $name")
        return tmp
    }


}