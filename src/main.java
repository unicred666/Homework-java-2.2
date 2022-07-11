public class main {
    public static void main(String[] args) {
        int  balance = 100;
        int payment = 1588;

        int bonus;
        if (payment >= 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int newBalance = balance + bonus + payment;
        System.out.println(bonus);
        System.out.println(newBalance);
    }
}