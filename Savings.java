import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double incomePerMonth = Double.parseDouble(scan.nextLine());
        int months = Integer.parseInt(scan.nextLine());
        double personalExpenses = Double.parseDouble(scan.nextLine());

        double moneyLeft = incomePerMonth - personalExpenses - (incomePerMonth * 0.3);
        double percent = moneyLeft / incomePerMonth * 100;
        double sum = moneyLeft * months;

        System.out.println(String.format("She can save %.2f%%", percent));
        System.out.println(String.format("%.2f", sum));
    }
}
