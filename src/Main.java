public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1:");
                int[] payments = {14_000, 5500, 3000, 5400, 12_000};
                int totalSum = 0;
                for (int payment : payments) {totalSum += payment;}
                System.out.println("Сумма трат за месяц составила " + totalSum + " рублей.");
                System.out.println();

                System.out.println("Задача 2:");
                int[] expenses = {11_000, 18_000, 12_000, 4400, 19_000};
                int minExpense = expenses[0];
                for (int expense : expenses) {
                    if (expense < minExpense) {
                        minExpense = expense;
                    }
                }
                int maxExpense = expenses[0];
                for (int expense : expenses) {
                    if (expense > maxExpense) {
                        maxExpense = expense;
                    }
                }
                System.out.printf("Минимальная сумма трат за неделю составила %d рублей.\n", minExpense);
                System.out.printf("Максимальная сумма трат за неделю составила %d рублей.\n", maxExpense);
                System.out.println();

                System.out.println("Задача 3:");
                int[] costs = {2000, 4200, 6800, 2500, 5100};
                int totalCosts = 0;
                for (int cost : costs) {
                    totalCosts += cost;
                }
                double averageCosts = (double) totalCosts / costs.length;

                System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.", averageCosts);
                System.out.println();

                System.out.println("Задача 4:");
                char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
                int length = reverseFullName.length;
                for (int i = length - 1; i >= 0; i--) {
                    System.out.print(reverseFullName[i]);
                }
            }}
