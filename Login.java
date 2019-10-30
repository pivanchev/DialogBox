
package dialogbox;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Login {
    
    public static void main(String args[]){
        
        Scanner scan=new Scanner(System.in);
 
        login();
         
    }
    
    public static void login(){
        
        String pass_word="12345";
        String user_name="pivanchev";
       
        
        String username=JOptionPane.showInputDialog("Enter your username: ");
        String password=JOptionPane.showInputDialog("Enter your password: ");
        
       
        if(username.equals(user_name) && password.equals(pass_word)){
             
         JOptionPane.showMessageDialog(null,"Successfully logged in. ");
         
         }else{
            failedLogin();

        }
    }
    
        public static void failedLogin(){
            
           JOptionPane.showMessageDialog(null,"Wrong input. Try again!");
           login();        
        }
        
    }
    
    
    

