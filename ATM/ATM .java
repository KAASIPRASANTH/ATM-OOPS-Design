import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class ATM {
    public static void newRegister(Scanner sc) {
        System.out.println("Enter your Name");
        String name = sc.next();

        System.out.println("Enter your street");
        String street = sc.next();

        System.out.println("Enter your Age");
        int Age = sc.nextInt();

        System.out.println("Enter your PIN");
        int AtmPin = sc.nextInt();

        User user = new User(name, street, Age);
        user.store(AtmPin, user);
    }

    public static void main(String[] args) {

        // scanner obj for getting an input
        Scanner sc = new Scanner(System.in);

        // menu list
        List<String> options = new ArrayList<>();
        options.addAll(Arrays.asList("Register", "Provide servicess", "Exit"));

        String wantToGo = "yes";
        while (wantToGo.equals("yes")) {

            System.out.println("Choose any one of the option below :");
            for (int i = 1; i <= 3; i++) {
                System.out.println(i + ") " + options.get(i - 1));
            }

            int choosen = sc.nextInt();
            switch (choosen) {
                case 1:
                    newRegister(sc);
                    break;

                case 2:
                    System.out.println("Enter you PIN :");
                    Services services = new Services();
                    services.provideServices(sc.nextInt(),sc);
                    break;

                default:
                    System.out.println("Thank you!");
                    break;
            }

            // checking for use intrested to continue or not
            System.out.println("Are you want to continue?");
            wantToGo = sc.next();
            if (!wantToGo.equals("yes")) {
                wantToGo = "no";
            }
        }
        sc.close();
    }
}