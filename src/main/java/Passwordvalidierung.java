import java.util.Scanner;

public class Passwordvalidierung {
    public static void main(String[] args) {
        System.out.println(PasswordvalidierungForLengthPasswords("Hamburg"));
        System.out.println(PasswortvalidierungTestForPresenceOfNumber("Hamburg123"));
        System.out.println(PasswortvalidierungForPresenceOfCapitalLetters("Hamburg"));
        System.out.println(PasswortvalidierungForBadPassword("0123456789"));

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the first password please");
        //String str1 = scanner.next();
    }

    public static String PasswordvalidierungForLengthPasswords( String password) {
        int actualLengthPasswords =  password.length();

        if (actualLengthPasswords < 8) {
                return "Die Lange des Passwordes ist zu kurz";
        } else if (actualLengthPasswords >= 8) {
               return "Die Lange des Passwordes passt gut, Gut gemacht!";
        } else {
                return "Bitte Passwort eingeben";
        }
    }

    public static String PasswortvalidierungTestForPresenceOfNumber(String password) {

        if (password.matches(".*[0-9].*")) {
            return "Ja, Ihr Password hat die Zahle und wurde sicher, Gut gemacht!!";
        } else {
            return "Ihr Password hat keine Zahle";
        }
    }


    public static String PasswortvalidierungForPresenceOfCapitalLetters(String password) {

        char[] actualPassword = password.toCharArray();

        for (int i= 0; i < actualPassword.length; i++ ) {
            if (Character.isUpperCase(actualPassword[i])) {
                return "Ihr Password hat grosse Buchstaben";
            }
        }
        return "Ihr Password hat keine grosse Buchstaben";
    }


    public static String PasswortvalidierungForBadPassword(String password) {

        String[] badPasswords = { "Password1", "Abc123456", "0123456789", "00000000", "ABCDF", "DasIstMeinPassword" };

        for (int i=0; i<badPasswords.length; i++) {

            if (password.matches("Password1") || password.matches("Abc123456") || password.matches("0123456789") ||
                    password.matches("00000000") || password.matches("ABCDF") || password.matches("DasIstMeinPassword")) {
                return "Sorry, but your password is very weak. Please add at least 1 number, 1 capital letter and 1 special character";
            }
        }
        return "Great! Your password is very good, Gut gemacht!";
    }
}
