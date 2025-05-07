fun main() {
    println("=== Welcome to the Bank ===\n")

    var accountHolder: String? = null
    while (accountHolder.isNullOrBlank()) {
        print("Enter your name: ")
        accountHolder = readln()
    }

    var firstDeposit: Double? = null
    while (firstDeposit == null) {
        print("Enter your first deposit amount: ")
        val input = readln()
        val amount = input.toDoubleOrNull()

        if (amount != null && amount > 0) {
            firstDeposit = amount
        } else {
            println("Invalid amount. Please enter a number greater than 0.\n")
        }
    }

    val account = BankAccount(accountHolder, firstDeposit)

    println("\nAccount successfully created.")
    println("Account Holder: ${account.accountHolder}")
    println("Initial Balance: $${account.balance}\n")

    while (true) {
        println("=== Main Menu ===")
        println("1. View Balance")
        println("2. Make a Deposit")
        println("3. Make a Withdrawal")
        println("4. View Transaction History")
        println("5. Exit")
        print("Select an option (1-5): ")

        val option = readln().toInt()

        when (option) {
            1 -> account.getBalance()

            2 -> {
                print("Enter deposit amount: ")
                val amount = readln().toDoubleOrNull()
                if (amount != null) {
                    account.deposit(amount)
                } else {
                    println("Invalid input. Please enter a valid number.\n")
                }
            }

            3 -> {
                print("Enter withdrawal amount: ")
                val amount = readln().toDoubleOrNull()
                if (amount != null) {
                    account.withdraw(amount)
                } else {
                    println("Invalid input. Please enter a valid number.\n")
                }
            }

            4 -> account.displayTransactionHistory()

            5 -> {
                println("Thank you for using the Bank.")
                break
            }

            else -> println("Invalid option. Please select a number between 1 and 5.\n")
        }
    }
}