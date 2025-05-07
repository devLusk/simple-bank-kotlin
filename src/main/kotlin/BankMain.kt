fun main() {
    val account = BankAccount("Lala", 1000.0)

    account.getBalance()
    account.deposit(500.0)
    account.withdraw(200.0)
    account.deposit(900.0)
    account.deposit(566.23)
    account.displayTransactionHistory()
}
