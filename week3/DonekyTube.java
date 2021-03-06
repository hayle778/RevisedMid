/*


.working for merit America bank to build software system

.Using OOP(object oriented principle) to design and develope

. it allows account holder to have 1 checking and saving account

. the bank stores the following information about the account holder

         . FirstName, Middle Name, LastName, SocialSecurity number,
                 checking account, saving account
                 

. checking account has a balance and annual interest rate 0.01%.

it is possible withdraw, depositor can determine your future value.

.Saving account has a balance and annual interest rate 1%. 
. no negative account deposit or withdraw

. FV(Future value) = PV(present value)(1+i)^n ;
       PV = 100;
       N = 3 years;
       FV = 100(1+0.01)^3 = 103.03;
       
       
       Requirments
 1. ACCOUNTHOLDER     
..Account holder(): default constructor
         AccountHolder(String firstName, String middleName, String lastName,
...String SSN, double checkingAccountOpeningBalance, 
        double savingAccountOpeningBalance)
.... String getFirstName()
       void setFirstName(String firstName)
..... String getMiddleName()
        void setMiddleName(String middleName)
.......String getLastName()
          void setLastName(String lastName)
........String getSSN()
           void setSSN(String ssn)

..........CheckingAccount getCheckingAccount()
           SavingAccount getSavingsAccount()


String toString()
Sample output:
Name: John James Doe
SSN: 123-45-6789
Checking Account Balance: $100
Checking Account Interest Rate: 0.0001
Checking Account Balance in 3 years: $100.03
Savings Account Balance: $1000
Savings Account Interest Rate: 0.01
Savings Account Balance in 3 years: $1030.03

2.CHECKING ACCOUNT
CheckingAccount(double openingBalance)
double getBalance()
double getInterestRate()
boolean withdraw(double amount)
  .....mine. So if Account balance is below 0. You can`t withdraw.else yes.

boolean deposit(double amount)


double futureValue(int years)


3.SAVING ACCOUNT
SavingsAccount(double openingBalance)
double getBalance()
double getInterestRate()
boolean withdraw(double amount)
boolean deposit(double amount)
double futureValue(int years)
String toString()
Sample output:
Savings Account Balance: $1000
Savings Account Interest Rate: 0.01
Savings Account Balance in 3 years: $1030.03




4.MERITAMERICABANKAPP
public static void main(String[] args)
Instantiate an account holder with a checkings balance of $100 and a savings balance of $1000
Display the account holder’s toString() output
Deposit $500 into the checking account
Withdraw $800 from the savings account
Display the checking account toString() output
Display the savings account toString() output
Instantiate another account holder with a checkings balance of $200 and a savings balance of $500
Deposit -$500 into the checking account
Withdraw $600 from the savings account
Display the second account holder’s toString() output


















*/
