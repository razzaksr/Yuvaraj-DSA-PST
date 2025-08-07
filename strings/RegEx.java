package strings;

import java.util.regex.Pattern;

public class RegEx {
    public static void validate(String name, String password,String aadhaar,String pan,String email){
        boolean flag = true;
        String error = "";
        if(!Pattern.matches("^[A-Za-z ]{3,}$", name)){
            error+="Invalid name\n";
            flag = false;
        }
        if(!Pattern.matches("(?=.+[@!#$&])(?=.+[0-9])([a-zA-Z0-9@!#$&]){8,}$", password)){
            error+="Invalid password\n";
            flag = false;
        }
        if(!Pattern.matches("^[0-9]{12}$",aadhaar)){
            error+="Invalid aadhaar\n";
            flag=false;
        }
        if(!Pattern.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}$",pan)){
            error+="Invalid pan\n";
            flag=false;
        }
        if(!Pattern.matches("^[a-z]{2,}@[a-z]{3,}.[a-z]{2,}$",email)){
            error+="Invalid email\n";
            flag=false;
        }
        if(flag)
            System.out.println("Account created");
        else
            System.out.println(error);
        
    }
    public static void main(String[] args) {
        System.out.println("Welcome ABC Bank enter the kyc details as follows ");
        validate("Razak", "Razak@123", "987654567651", "ABCDE1234R", "razaksrmd@gmail.com");
        validate("Razak", "Razak@123", "98765456776567", "ABCDE1234R", "r@gmail.com");
        validate("Ra", "Razak@123", "987654567651", "ABCDE1234", "razaksrmd@gmail.com");
        validate("Razak", "Razak@abc", "987654567651", "ABCDE1234R", "razaksrmd@gmail.com");
        validate("Razak", "Raz@123", "987654567651", "ABCDE1234R", "razaksrmd@gmail.c");
    }
}
