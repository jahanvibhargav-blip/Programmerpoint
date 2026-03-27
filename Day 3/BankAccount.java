public class BankAccount
{
 protected String name;
 protected double balance;
 public BankAccount(String name, double balance)
 {
  this.name=name;
  this.balance=balance;
 }
 public void deposit(double amt)
 {
   balance+=amt;
 }
 public void withdraw(double amt)
 {
 /* subtract if enough */
 if(amt<balance)
 {
    balance-=amt;
 }
 else
 {
    System.out.println("Insufficient funds!");
 }
 }
 public void display()
 {
 System.out.println(name+" balance is "+balance);
 }
}
class SavingsAccount extends BankAccount
{
 public SavingsAccount(String name, double balance)
 {
 super(name, balance);
 }
 public void addInterest(int rate,int time)
 {
  double interest=(balance*rate*time/100);
  balance+=interest;
 System.out.println("balance with interest "+balance);
 }
}
 class Demo
{
  public static void main(String gg[])
  {
   SavingsAccount sa=new SavingsAccount("Rahul",1000);
   sa.deposit(500);
   sa.display();
   sa.withdraw(200);
   sa.display();
    sa.withdraw(5000);
   sa.addInterest(5,12);
  }
}