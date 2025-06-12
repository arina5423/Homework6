//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // задача 1
        for (int i = 1; i <= 10; i++) {

            System.out.println(i);
        }
        System.out.println("конец 1 задачи");
        // задача 2
        for (int i=10;i>0;i--) {
            System.out.println(i);
        }
        System.out.println("конец 2 задачи");
        // задача 3
        for(int i=0;i<=17;i=i+2){
            System.out.println(i);
        }
        System.out.println("конец 3 задачи");
        // задача 4
        for (int i=10;i>=-10;i--) {
            System.out.println(i);
        }
        System.out.println("конец 4 задачи");
        // задача 5
        for (int i=1904;i<=2096;i= i+4) {
            System.out.println(i + " год является високосным.");
        }
        System.out.println("конец 5 задачи");
        // задача 6
        for (int i=7;i<=98;i=i+7) {
            System.out.println(i);
        }
        System.out.println("конец 6 задачи");
        // задча 7
        for (int i=1;i<=512;i=i*2) {
            System.out.println(i);
        }
        System.out.println("конец 7 задачи");
        // задача 8 и 9
        int salary = 29000;
        int total=0;
        for (int i=0;i<12;i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц, " + i + " сумма накомлений равна " + total + " рублей.");

        }
        System.out.println("конец 8 и 9 задачи");
        // задача 10
        int a = 2;
        int total_1= 0;
        for (int i=1;i<=10;i++) {
            total_1 = a*i;
            System.out.println(a + " * " + i + " = " + total_1);
        }
        System.out.println("конец 10 задачи");



    }
}
