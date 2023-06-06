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
        System.out.println("Задание 1");
        int[ ] arr = generateRandomArray();
        int sum = 0;
        for (int current : arr) {
            sum = sum + current;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2(){
        System.out.println("Задание 2");
        int[ ] arr = generateRandomArray();
            int min = 200000;
            int max = 0;
            for ( int current : arr) {
                if (min > current){
                    min = current;
                }
                if (max < current){
                    max = current;
                }
            }
        System.out.println("Минимальная сумма трат за день составила " + min +
                " рублей. Максимальная сумма трат за день составила " + max + " рублей.");

    }

    public static void task3(){
        System.out.println("Задание 3");
        int[ ] arr = generateRandomArray();
        int sum = 0;
        for (int current : arr) {
            sum = sum + current;
        }
        float averageAmount;
        averageAmount = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount+ " рублей");
    }

    public static void task4(){
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}



