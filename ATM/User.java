public class User {
    String customer_Name;
    String street;
    static String Bank_Name;
    int Age;
    int Amount;

    // static Block
    static {
        Bank_Name = "Indian Bank";
    }

    // constructor
    User(String customer_Name, String street, int Age) {
        this.customer_Name = customer_Name;
        this.street = street;
        this.Age = Age;
        this.Amount = 0;
    }

    // storing an user details in customers class
    void store(int AtmPin, User user) {
        Bank.store(AtmPin, user);
    }

}
