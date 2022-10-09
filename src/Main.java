public class Main {
    public static void main(String[] args) {

        System.out.println("_____________Задание 1______________");
        // Задание 1
        int yearNow = 2022;
        int yearBeginning = yearNow - 200;
        int yearEnding = yearNow + 100;
        for (; yearBeginning <= yearEnding; yearBeginning++){
            if (yearBeginning % 79 == 0) {
                System.out.println(yearBeginning);
            }
        }

        System.out.println("_____________Задание 2______________");
        // Задание 2
        int num = 1;
        for (; num <= 10; num++) {
            System.out.println("2*"+num+"=" +2*num);
        }
    }
}