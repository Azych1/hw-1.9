public class Main {
    public static void main(String[] args) {
        task1();
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
        System.out.println("Задача 1");
        int[] budget = generateRandomArray();
        int sum = 0;

        for (int i = 0; i < budget.length; i++) {
            sum += budget[i];
            System.out.println("В день " + (i + 1) + " было потрачено " + sum);
        }
        System.out.println();


        System.out.println("Задача 2");
        int min = budget[0];
        int max = budget[0];

        for (int i = 0; i < budget.length; i++) {
            if (budget[i] < min) {
                min = budget[i];
            }
            if (budget[i] > max) {
                max = budget[i];
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. " +
                "Минимальная сумма трат за день составила " + max + " рублей.");
        System.out.println();


        System.out.println("Задача 3");
        double summ = 0;

        for (int i = 0; i < budget.length; i++) {
            summ += budget[i];
        }

        System.out.printf("Потратили: %.0f" + ". Среднее значение: %.2f", summ, summ / budget.length);
        System.out.println();
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }


}