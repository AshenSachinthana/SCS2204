class Account(initialBalance: Double) {
  private var balance: Double = initialBalance

  // ... (same deposit, withdraw, transfer methods as before)

  def applyInterest(): Unit = {
    if (balance > 0) {
      balance += balance * 0.05 // Deposit interest
    } else {
      balance += balance * 0.1 // Overdraft interest
    }
  }

  def getBalance: Double = balance
}

object Bank {
  def negativeBalanceAccounts(accounts: List[Account]): List[Account] = {
    accounts.filter(_.getBalance < 0)
  }

  def sumOfBalances(accounts: List[Account]): Double = {
    accounts.map(_.getBalance).sum
  }

  def applyInterestToAccounts(accounts: List[Account]): Unit = {
    accounts.foreach(_.applyInterest())
  }
}

object Main extends App {
  val account1 = new Account(1000.0)
  val account2 = new Account(-500.0)
  val account3 = new Account(200.0)

  val bankAccounts = List(account1, account2, account3)

  println("Accounts with negative balances:")
  Bank.negativeBalanceAccounts(bankAccounts).foreach(account => println(s"Account balance: ${account.getBalance}"))

  val totalBalance = Bank.sumOfBalances(bankAccounts)
  println(s"Total balance of all accounts: $totalBalance")

  Bank.applyInterestToAccounts(bankAccounts)

  println("Final balances after applying interest:")
  bankAccounts.foreach(account => println(s"Account balance: ${account.getBalance}"))
}
