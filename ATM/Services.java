import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Services {
    List<String> options;

    Services() {
        options = new ArrayList<>();
        options.addAll(Arrays.asList("Deposite", "Withdraw cash", "Check your balance", "change PIN", "Exit"));
    }

    void provideServices(int AtmPin, Scanner sc) {

        // authendication
        if (Bank.authenticate(AtmPin)) {

            System.out.println("Choose any one of the option");
            for (int i = 1; i <= 5; i++) {
                System.out.println(i + ") " + options.get(i - 1));
            }

            // getting an option from user
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter Deposite Amount : ");
                    int DepositeAmount = sc.nextInt();
                    Bank.Deposite(AtmPin, DepositeAmount);
                    System.out.println("Balance Amount : " + Bank.checkBalance(AtmPin));
                    break;
                case 2:
                    System.out.println("Enter Withdraw Amount : ");
                    int WithdrawAmount = sc.nextInt();
                    Bank.Withdraw(AtmPin, WithdrawAmount);
                    System.out.println("Balance Amount : " + Bank.checkBalance(AtmPin));
                    break;
                case 3:
                    System.out.println("Balance Amount : " + Bank.checkBalance(AtmPin));
                    break;
                case 4:
                    System.out.println("Enter your new PIN : ");
                    int newPIN = sc.nextInt();
                    Bank.changePIN(AtmPin, newPIN);
                    break;
                default:
                    break;
            }

        }
    }
}
