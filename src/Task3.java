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
        sc.close();

        int units = number % 10;
        int decimals = (number / 10) % 10;
        int hundreds = number / 100;

        int sum = units + decimals + hundreds;
        int product = units * decimals * hundreds;

        System.out.println("Единицы = " + units);
        System.out.println("Десятки = " + decimals);
        System.out.println("Сотни = " + hundreds);
        System.out.println("Сумма = " + sum);
        System.out.println("Произведение = " + product);
    }
}
