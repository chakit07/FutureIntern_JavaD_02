import java.util.Random;
import java.util.Scanner;

public class passwordgenerator {
    public static void main(String[] args) {
        System.out.println("Welcome to password generator");
        Scanner sc = new Scanner(System.in);

        System.out.println("Include uppercase letters? (yes/no): ");
        boolean includeUpperCase = sc.nextLine().equalsIgnoreCase("yes");

        System.out.println("Include lowercase letters? (yes/no): ");
        boolean includeLowerCase = sc.nextLine().equalsIgnoreCase("yes");

        System.out.println("Include digits? (yes/no): ");
        boolean includeDigits = sc.nextLine().equalsIgnoreCase("yes");

        System.out.println("Include symbols? (yes/no): ");
        boolean includeSymbols = sc.nextLine().equalsIgnoreCase("yes");

        System.out.println("Enter your desired length");
        int len=sc.nextInt();

        String upper ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower ="abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symbols= "!@#$%^&*()_+-=.:;'\"";
        String combination = "";
        if (includeUpperCase) combination += upper;
        if (includeLowerCase) combination += lower;
        if (includeDigits) combination += digits;
        if (includeSymbols) combination += symbols;

        char[] password=new char[len];
        Random rand = new Random();
        for(int i=0;i<len;i++)
        {
            password[i]=combination.charAt(rand.nextInt(combination.length()));
        }
        System.out.println("Your password is "+new String(password));
    }
}
