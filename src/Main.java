public class Main {
    public static void main(String[] args) {
        // Задание 1
        int salary = 15000;
        int total = 0;
        int moth = 0;
        while (total <= 2_459_000){
            total = total + total/100;
            total = total + salary;
            moth = moth + 1;
            System.out.println("Месяц " + moth + ". Сумма по вкладу равна " + total + "руб");}
        System.out.println("За " + moth + " месяцев сумма накоплений будет равна " + total);
        System.out.println();
        // Задание 2
        int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num++;
        }
        System.out.println();
        for (num = 10; num > 0; num--) {
            System.out.println(num);
        }
        System.out.println();
        // Задание 3
        int population = 12_000_000;
        int deathYear = 8 * population;
        int birthYear = 17 * population;
        int year = 1;
        while (year <= 10) {
            population = population - deathYear;
            population = population + birthYear;
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println("Через " + year + " лет численность населения составит " + population);


    }



}