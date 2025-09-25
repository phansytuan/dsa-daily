public class BankAccountEncapsulation {

  private double balance;

  public BankAccountEncapsulation(double initialBalance) {
    this.balance = initialBalance;
  }


  public void nopTien(double amount) {
    if (amount > 0) {
      balance += amount;
    }
  }
  public double getBalance() {
    return balance;
  }
}
