//package account;
public class AccountDetails {
    public static void main(String[] args) {
    current_acct c = new current_acct("bhavya", 125634);
    savings_acct s = new savings_acct("sarvani", 85945);
    c.deposit(2000);
    c.withdrawal(200);
    s.deposit(20000);
    s.withdrawal(1200);
    s.addInterest();
    }
}

interface account {
void deposit(int amount);
void display();
void withdrawal(int amount);
}
class current_acct implements account{
private String name;
private int acc_no;
private float charge = 100;
private float balance;
float min_amount = 200;
current_acct(String name, int accno) {
this.name = name;
this.acc_no = accno;
}
public void deposit(int amount) {
balance += amount;
display();
}
public void display() {
System.out.println("Balance: " + balance);
}
public void withdrawal(int amount) {
if (amount > balance) {
System.out.println("Insufficient balance !");
penalty();
display();
}else {
balance -= amount;
penalty();
display();
}
}
public void penalty() {
if (balance < min_amount) {
System.out.println("Penality is imposed on this account holder!");
balance -= charge;
display();
}
}
}
class savings_acct implements account{
private String name;
private int acc_no;
private float balance ;
savings_acct(String name, int accno) {
this.name = name;
this.acc_no = accno;
}
public void deposit(int amount) {
balance += amount;
display();
}
public void display() {
System.out.println("Balance: " + balance);
}
public void withdrawal(int amount) {
if (amount > balance) {
System.out.println("Enter amount");
}else {
balance -= amount;
display();
}
}
public void addInterest () {
balance += balance*0.04;
display();
}
}
