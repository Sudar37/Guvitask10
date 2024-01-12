package task10;

class Account { // Declare account class
public double balance; 
 
public Account() { 
        this.balance = 0; 
} 
 
public Account(double balance) { 
        this.balance = balance; 
} 
 
public void deposit(double amount) {  // deposit method
        balance += amount; 
} 
 
public void withdraw(double amount) { // withdraw method
      	if (balance < amount) { 
	System.out.println("Insufficient balance"); 
} else { 
        balance -= amount; 
} 
} 
public double getBalance() { 
        return balance; 
} 
} 
public class Que4 {
public static void main(String[] args) {

	Account account = new Account(2000); 
	System.out.println("Initial balance: " + account.getBalance()); 
	account.deposit(500); 
	System.out.println("Balance after deposit: " + account.getBalance()); 
	account.withdraw(200); 
	System.out.println("Balance after withdrawal: " + account.getBalance()); 
   }
}
-----------------------------------------------------------------------------------------------------------------
OUTPUT:

Initial balance: 2000.0
Balance after deposit: 2500.0
Balance after withdrawal: 2300.0
