public class Main {
    public static void main(String[] args) {

        //Task 1

        for (int i = 1; i <= 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        //Task 2

        for (int i = 10; i > 0; i--) {
            System.out.print(i+" ");
        }
        System.out.println();

        //Task 3

        for (int i = 0; i < 17; i = i + 2) {
            System.out.print(i+" ");
        }
        System.out.println();

        //Task 4

        for (int i = 10; i >= -10; i--) {
            System.out.print(i+" ");
        }
        System.out.println();

        //Task 5

        for (int i = 1904; i < 2906; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        //Task 6

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i+" ");
        }
        System.out.println();

        //Task 7

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i+" ");
        }
        System.out.println();

        //Task 8

        int deposit = 29_000;
        int total = 0;
        for (int month = 1; month <= 12; month++) {
            total = total + deposit;
            System.out.println("Месяц "+month+" сумма накоплений равна "+total+" рублей");
        }
        System.out.println(total);

        //Task 9

        deposit = 29_000;
        total = 0;
        for (int month = 1; month <= 12; month++) {
            total = total + total/100;
            total = total + deposit;
            System.out.println("Месяц "+month+" сумма накоплений равна "+total+" рублей");
        }
        System.out.println(total);

        //Task 10

        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * "+i+" = "+i * 2);
        }



    }
}