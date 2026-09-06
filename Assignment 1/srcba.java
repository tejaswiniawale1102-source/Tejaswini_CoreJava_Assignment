class BankAccount
{
  int accountNumber;
  String holderName;
  float currentBalance;
  float interestRate;
}
//class BankAccount ends here
class TestBankAccount
{
               public static void main(String[] args)
             {
                BankAccount ba1;//reference
                ba1 = new BankAccount();
                System.out.println(ba1);
             }
}
               