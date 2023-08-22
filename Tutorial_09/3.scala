class Account(initialBalance: Double) {
  private var balance: Double = initialBalance

  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdrawal amount must be positive")
    require(balance >= amount, "Insufficient balance")
    balance -= amount
  }

  def transfer(amount: Double, targetAccount: Account): Unit = {
    require(amount > 0, "Transfer amount must be positive")
    require(balance >= amount, "Insufficient balance for transfer")
    
    withdraw(amount)
    targetAccount.deposit(amount)
  }

  def getBalance: Double = balance
}

object Main extends App {
  val account1 = new Account(1000.0)
  val account2 = new Account(500.0)

  println(s"Account 1 initial balance: ${account1.getBalance}")
  println(s"Account 2 initial balance: ${account2.getBalance}")

  account1.deposit(200.0)
  account2.withdraw(100.0)

  println(s"Account 1 balance after deposit: ${account1.getBalance}")
  println(s"Account 2 balance after withdrawal: ${account2.getBalance}")

  account1.transfer(300.0, account2)

  println(s"Account 1 balance after transfer: ${account1.getBalance}")
  println(s"Account 2 balance after transfer: ${account2.getBalance}")
}
