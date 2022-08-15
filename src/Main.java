public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        // Задание 1, 2, 3
        int start = 0;
        int max = -1;
        int min = 200_001;
        for (int i = 0; i < arr.length; i++) {
            int Sum = start + arr[i];
            start = Sum;
            if (arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
            if (i == arr.length - 1) {
                System.out.println("Сумма трат за месяц составила " + Sum + " рублей");
                System.out.println("Минимальная сумма трат за день составила " + min + " рублей. " +
                        "Максимальная сумма трат за день составила " + max + " рублей.");
                System.out.println("Средняя сумма трат за месяц составила " + (double) Sum / arr.length + " рублей");
            }
        }
        // Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}