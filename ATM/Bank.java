import java.util.*;

class Bank {
    static Map<Integer, User> usersList;

    static {
        usersList = new HashMap<>();
    }

    static void store(int AtmPin, User user) {
        usersList.put(AtmPin, user);
    }

    static boolean authenticate(int AtmPin) {
        if (usersList.get(AtmPin) != null) {
            return true;
        }
        return false;
    }

    static void Deposite(int AtmPin, int DepositeAmount) {
        usersList.get(AtmPin).Amount += DepositeAmount;
    }

    static void Withdraw(int AtmPin, int WithdrawAmount) {
        if (usersList.get(AtmPin).Amount >= WithdrawAmount) {
            usersList.get(AtmPin).Amount -= WithdrawAmount;
        } else {
            System.out.println("Your account don't have enough amount for withdraw");
        }
    }

    static int checkBalance(int AtmPin) {
        return usersList.get(AtmPin).Amount;
    }

    static void changePIN(int currPIN, int newPIN) {
        User user = usersList.get(currPIN);
        usersList.remove(currPIN);
        usersList.put(newPIN, user);
    }
}
