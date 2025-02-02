public class BankAccount {
    public static void main(String[] args) {

        // Starting balance
        float bobAccount = 2175.37f;

        // Performed transactions
        bobAccount = bobAccount - 302.50f;
        bobAccount = bobAccount + 50.03f;
        bobAccount = (bobAccount / 2) + 20;
        bobAccount = bobAccount - 1;
        bobAccount = bobAccount * 2;
        bobAccount = bobAccount + 1;

        // Bob's new balance
        System.out.printf("%.2f",bobAccount);
    }
}