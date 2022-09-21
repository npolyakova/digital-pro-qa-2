public class Task1 {
    //Найти длину окружности радиуса 4

    public static void main(String[] args) {
        int r = 4;

        double l = Math.PI * Math.pow(r, 2) + 0.4;

        System.out.println("Длина окружности = " + l);
        System.out.println("Длина окружности округленная = " + Math.round(l));
    }
}
