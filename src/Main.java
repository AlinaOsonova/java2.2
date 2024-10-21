public class Main {
    public static void main(String[] args) {
        int initialAccount = 500;
        int amountDeposit = 1500;

        int bonus;
        if (amountDeposit > 1000) {
            bonus = amountDeposit / 100;
        } else {
            bonus = 0;
        }

        int balance = initialAccount + amountDeposit + bonus;
        System.out.println("На Вашем счете:" + balance +  "р.");
        System.out.println("Бонус за пополнение:" + bonus +  "р.");
    }
}