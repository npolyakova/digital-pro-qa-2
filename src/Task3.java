import java.util.Scanner;

public class Task3 {

    //3. Дано трехзначное число. Найти:
    //    1. число единиц в нем;
    //    2. число десятков в нем;
    //    3. сумму его цифр;
    //    4. произведение его цифр.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int number = sc.nextInt();

        //1 2 3
        //123 % 10 = 3
        int units = number % 10;
        //double a = 123 / 10 = 12.3
        //int a = 123 / 10 = 12
        int decimals = (number / 10) % 10;
        int hundreds = (number / 10) / 10;

        System.out.println("Cумма цифр = " + (units + decimals + hundreds));
        System.out.println("Произведение цифр = " + (units * decimals * hundreds));
    }
}
