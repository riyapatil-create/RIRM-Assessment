import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PhoneNoEg {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your Phone number: ");
      String phone = sc.next();

      String regex = "\\d{10}";    //Regular expression validation for accepting valid phone number
    
      Pattern pattern = Pattern.compile(regex);   //Creating a pattern object
      
      Matcher matcher = pattern.matcher(phone);    //Creating a Matcher object
      
      //Verifying whether given phone number is valid
      if(matcher.matches()) {
         System.out.println("Given phone number is valid");
      } else { 
         System.out.println("Given phone number is not valid");
      }
   }
}