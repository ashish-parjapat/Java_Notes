public class BankRunner {
    public static void main(String[] args) {
        Bank b=new SBI(5859101002728L, null, 30000, 1234);

        b.ChangePwd(1234, 1234);
        b.ShowBalance();
        b.Withdrawal(20000, 1234);
        b.Deposit(200);
    }
    
}
