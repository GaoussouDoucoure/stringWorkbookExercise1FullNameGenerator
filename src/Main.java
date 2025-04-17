// FULL NAME GENERATOR EXERCISE IN THE WORKBOOK WEEK 2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your middle name (or press Enter to skip): ");
        String middleName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter your suffix (or press Enter to skip): ");
        String suffix = sc.nextLine();

        String fullName = firstName + " " + (middleName.isEmpty() ? "" : middleName + " ") + lastName + (suffix.isEmpty() ? "" : ", " + suffix); // ternary is true : false, just like if : else
        fullName = fullName.trim();

        System.out.printf("Full name is: %s", fullName);
    }
}

//USING STRINGBUILDER
/*
// Adding all names together
        StringBuilder fullName = new StringBuilder();
        fullName.append(firstName);

        if (!middleName.isEmpty()) {
            fullName.append(" ").append(middleName);
        }

        fullName.append(" ").append(lastName);

        if (!suffix.isEmpty()) {
            fullName.append(", ").append(suffix);
        }

        System.out.printf("Full name: %s" + fullName);
 */