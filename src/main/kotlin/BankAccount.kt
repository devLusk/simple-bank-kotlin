class BankAccount(
    val accountHolder: String,
    var balance: Double
) {
    private val transactionHistory = mutableListOf<String>()

    fun getBalance() {
        println("Current balance: $$balance\n")
    }

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            transactionHistory.add("Deposit of $$amount")
            println("Deposit of $$amount was successful.")
            println("Updated balance: $$balance\n")
        } else {
            println("Invalid amount for deposit.")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            transactionHistory.add("Withdrawal of $$amount")
            println("Withdrawal of $$amount was successful.")
            println("Current balance: $$balance\n")
        } else {
            println("Invalid amount for withdrawal.")
        }
    }

    fun displayTransactionHistory() {
        println("\nTransaction history for $accountHolder:")
        if (transactionHistory.isEmpty()) {
            println("No transactions have been recorded for this account.\n")
        } else {
            for ((index, item) in transactionHistory.withIndex()) {
                println("${index + 1}. $item")
            }
            println()
        }
    }
}
