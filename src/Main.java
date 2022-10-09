public class Main {
    public static void main(String[] args) {

        // Задание 1
        int contribution = 15_000;
        int percentPerMoth = 7;
        int total = 0;
        int mouth = 0;
        while (total <= 12_000_000) {
            total = total + contribution + (contribution * percentPerMoth/100);
            mouth++;
            System.out.println("Сумма накоплений в " + mouth + " месяце будет равна " + total + "руб");
        }
        System.out.println();

        // Задание 2
        int contribution2 = 15_000;
        int percentPerMoth2 = 7;
        int total2 = 0;
        int mouth2 = 0;
        while (total2 <= 12_000_000) {
            total2 = total2 + contribution2 + (contribution2 * percentPerMoth2/100);
            mouth2++;
            if (mouth2 % 6 == 0) {
                System.out.println("Сумма накоплений в " + mouth2 + " месяце будет равна " + total2 + "руб");
            }
        }
        System.out.println();

        //Задание 3
        int contribution3 = 15_000;
        int percentPerMoth3 = 7;
        int total3 = 0;
        int mouth3 = 0;
        while (mouth3 <= 108) {
            total3 = total3 + contribution3 + (contribution3 * percentPerMoth3/100);
            mouth3++;
            if (mouth3 % 6 == 0) {
                System.out.println("Сумма накоплений в " + mouth3 + " месяце будет равна " + total3 + "руб");
            }
        }
        System.out.println();

        // Задание 4
        int friday = 3;
        int daysMouth = 31;
        int dayNow = friday;
        for (; dayNow <= daysMouth; dayNow+=7) {
                System.out.println("Сегодня пятница " +dayNow+ "-е число. Необходимо подготовить отчет");

        }


    }
}