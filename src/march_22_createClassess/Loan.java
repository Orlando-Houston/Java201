package march_22_createClassess;

public class Loan extends Bank{
    double interestRate;
    int numberOfPayment;
    double loanAmount;
    public Loan(int accNumber,String accName,double bal,double intRate,int numPayment,double amount){
        super(accNumber,accName,bal);
        this.interestRate=intRate;
        this.numberOfPayment=numPayment;
        this.loanAmount=amount;
    }
    double calculateMonthlyPayment(){
        double monthly = this.loanAmount*this.interestRate/this.numberOfPayment;
        return monthly;
    }
    double calculateTotalPayment(){
        double total = this.loanAmount*this.interestRate;
        return  total;
    }
}
