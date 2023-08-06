// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задача 1:");
        int[] payment = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < payment.length; i++) {
            sum += payment[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2() {
        System.out.println("Задача 2:");
        int[] payment = generateRandomArray();
        int minPay = payment[0];
        int maxPay = payment[0];
        for (int i = 0; i < payment.length; i++) {
            if (payment[i] < minPay) {
                minPay = payment[i];
            }
            if (payment[i] > maxPay) {
                maxPay = payment[i];
            }
        }
        System.out.println("Максимальная сумма " + maxPay);
        System.out.println("Минимальная сумма " + minPay);
    }
    public static void task3() {
        System.out.println("Задача 3:");
        int[] payment = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < payment.length; i++) {
            sum += payment[i];
        }
        double average = sum/ payment.length;
        System.out.println("Средняя сумма выплат составила " + average + " рублей");
    }
    public static void task4() {
        System.out.println("Задача 3:");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] fullName = new char[11];
        int j = 0;
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            fullName[j] = reverseFullName[i];
            j++;
        }
        System.out.println(fullName);
    }
}