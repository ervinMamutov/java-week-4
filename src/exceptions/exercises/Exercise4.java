package exceptions.exercises;

/**
 * Exercise 4 :
 * Create a class BankAccount with:
 * - field double balance
 * - method withdraw(double amount)
 * → If amount > balance, throw a custom exception InsufficientFundsException.
 * In main():
 * - Create an account with a starting balance
 * - Try to withdraw more than available
 * - Catch and handle the exception
 */

public class Exercise4 {
  public static void main(String[] args) {
    BankAccount account1 = new BankAccount(234.23);

    account1.withdraw(300.32);
    account1.withdraw(120.32);
  }
}

class BankAccount {
  private final double balance;

  public BankAccount(double balance) {
    this.balance = balance;
  }

  public void withdraw(double amount) {
    try {
      checkBalance(balance, amount);
      System.out.println("Everything okay. The balance more then the amount");
    } catch (InsufficientFundsException e) {
      System.out.println("The amount more then " + "the balance");
    }
  }

  public void checkBalance(double balance, double amount)
          throws InsufficientFundsException {
    if (balance < amount) {
      throw new InsufficientFundsException(
              "The amount more then " + "the balance");
    }
  }
}

class InsufficientFundsException extends Exception {
  public InsufficientFundsException(String message) {
    super(message);
  }
}


