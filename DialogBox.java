package dialogbox;
import javax.swing.JOptionPane;


public class DialogBox {

 
    public static void main(String[] args) {
       String annualInterestRateString=JOptionPane.showInputDialog("Enter annual interest rate, for example, 8.25:");//annual interest rate
       
       double annualInterestRate=Double.parseDouble(annualInterestRateString);//convert string to double
       
       double monthlyInterestRate=annualInterestRate/1200;//monthly interest rate
       
       String numberOfYearsString=JOptionPane.showInputDialog("Enter number of years as integer, for example, 5:");//number of years
       
       int numberOfYears=Integer.parseInt(numberOfYearsString);//convert string to integer
       
       String loanString=JOptionPane.showInputDialog("Enter loan amount, for example, 150000.50");//loan amount
       
       double loanAmmoun=Double.parseDouble(loanString);//convert string to double
       
       double monthlyPayment=loanAmmoun*monthlyInterestRate/(1-1/Math.pow(1 + monthlyInterestRate,numberOfYears*12));//calculate payment
       double totalPayment=monthlyPayment*numberOfYears*12;
       monthlyPayment=(int)(monthlyPayment*100)/100.0;//keep 2 digits after decimal
       totalPayment=(int)(totalPayment*100)/100.0;//keep 2 digits after decimal
       
       String output=("The monthly payment is $" + monthlyPayment + "\nThe total payment is $" + totalPayment);
       
       JOptionPane.showMessageDialog(null,output);
       
          
        
    }
    
}
