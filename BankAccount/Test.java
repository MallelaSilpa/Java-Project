import java.util.InputMismatchException;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
       System.out.println("Enter account number: ");
       int accNo=sc.nextInt();
       sc.nextLine();
       System.out.println("Enter accountHolder name: ");
       String accHolder=sc.nextLine();
       BankAccount ba=new BankAccount(accNo,accHolder);
       System.out.println("Enter deposit amount: ");
       int depositAmount=sc.nextInt();
       ba.deposit(depositAmount);
       System.out.print("Enter withdrawal amount: ");
       int withdrawAmount=sc.nextInt();
       ba.withdraw(withdrawAmount);
       ba.getAccountInfo();
        }
        catch(InputMismatchException ime) {
            System.out.println("Invalid input type. Please enter numbers only for account and amounts.");
        } catch(Exception e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
        sc.close();
        }
    }
}