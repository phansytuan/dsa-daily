public class BankAccountEncapsulation {

  private double balance;

  public BankAccountEncapsulation(double initialBalance) {
    this.balance = initialBalance;
  }


  public void nopTien(double amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException("Số tiền nộp phải lớn hơn 0, nhận được: " + amount);
    }
    balance += amount;
  }
  public double getBalance() {
    return balance;
  }
}
