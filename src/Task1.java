public class Task1 {
    //Найти длину окружности радиуса 4. L = 2Pir
    public static void main(String[] args) {
        //short r = 4;
        System.out.println("Введите радиус");
        Scanner sc = new Scanner(System.in);
        short r = sc.nextShort();
        double l = 2 * Math.PI * r;

        System.out.println("Длина окружности = " + l);
    }
}
