class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private int balance;

    // Constructor to initialize the attributes
    public BankAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0; // Initial balance is 0
    }

    // Deposit method
    public void deposit(int amount) throws Exception {
       if(amount <= 0){
           throw new Exception("Deposit amount must be positive.");
       }
       balance += amount;
       System.out.println("Deposited: $" + amount);
    }

    // Withdraw method
    public void withdraw(int amount) throws Exception {
        if(amount<=0) {
            throw new Exception("withdrawal amount must be positive");
        }
        if(amount>balance) {
            throw new Exception("Insufficient balance");
        }
        balance-=amount;
            System.out.println("withdrawn: $" + amount);
    }

    // Display account information
    public void getAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

