public class Main {
    public static void main(String[] args) {
        // Задание номер 1

        int paper1 = 1235458464;
        byte paper2 = 115;
        short paper3 = 27987;
        long paper4 = 784213654887965654L;
        float paper5 = 7.2565F;
        double paper6 = 5.21567;

        System.out.println("Значение переменной paper1 с типом int равно " + paper1);
        System.out.println("Значение переменной paper2 с типом byte равно " + paper2);
        System.out.println("Значение переменной paper3 с типом short равно " + paper3);
        System.out.println("Значение переменной paper4 с типом long равно " + paper4);
        System.out.println("Значение переменной paper5 с типом float равно " + paper5);
        System.out.println("Значение переменной paper6 с типом double равно " + paper6);

        // Задание номер 2
        float cocaCola = 27.12F;
        long sprite = 987678965549L;
        double sky = 2.786;
        short sun = 569;
        short moon = -159;
        short water = 27897;
        byte earth = 67;
        System.out.println("Спрайт " + sprite);
        System.out.println("Небо " + sky);
        System.out.println("Солнце " + sun);
        System.out.println("Луна " + moon);
        System.out.println("Вода " + water);
        System.out.println("Земля " + earth);
        System.out.println("Кока Кола " + cocaCola);


        // Задание номер 3

        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        short paper = 480;
        System.out.println("На каждого ученика рассчитано " + paper / (class1 + class2 + class3) + " листов бумаги!");

        // Задание номер 4

        byte bottle1min = 16 / 2;
        byte minute = 20;
        System.out.println("За 20 минут будет произведенно " + bottle1min * minute + " бутылок!");
        short inOneDay = 60 * 24;
        System.out.println("За Сутки будет произведенно " + inOneDay * bottle1min + " бутылок!");
        short threeDays = 72 * 60;
        System.out.println("За три дня будет произведенно " + threeDays * bottle1min + " бутылок!");
        int month = (30 * 24) * 60;
        System.out.println("За один месяц будет произведенно " + month * bottle1min + " бутылок!");


        // Задание номер 5

        byte paintsCans = 120;
        int classes = paintsCans / 6;
        byte whitePaints = 2;
        byte greyPaints = 4;
        System.out.println("В школе где " + classes + " классов,нужно " + classes * whitePaints +
                " белой краски и " + classes * greyPaints + " банок коричневой краски!");


        // Задание номер 6

        int bananasWeight = 80;
        int bananasCount = 5;
        int totalWeightBananas = bananasWeight * bananasCount;

        int milkWeight = 105;
        int milkCount = 2;
        int totalWeightMilk = milkWeight * milkCount;

        int iceCreamWeight = 100;
        int iceCreamCount = 2;
        int totalWeightIce = iceCreamWeight * iceCreamCount;

        int aggsWeight = 70;
        int aggsCount = 4;
        int totalWeightAggs = aggsWeight * aggsCount;

        int shakerGr = totalWeightBananas + totalWeightMilk + totalWeightIce + totalWeightAggs;
        float shakerKg = shakerGr / 1000F;

        System.out.println("Если смешать это всё в блендере получился " + shakerGr + " граммов! Или " + shakerKg + " килограммов!");

        // Задание номер 7

        int weightN = 7000;
        int grams1 = 250;
        int grams2 = 500;
        int days1 = weightN / grams1;
        int days2 = weightN / grams2;
        System.out.println("Если спортсмен будет терять в день по 250 грамм весса он скинет  7 кг ,за " + days1 +
                " дней,а если по 500 грамм в день тогда за " + days2 + " дней!");

        float gramsDay3 = (grams1 + grams2) / 2f;
        float days3 = weightN / gramsDay3;
        System.out.println("Что бы добится результата в среднем спортсмену нужно " + days3 + " дней!");

        // Задание номер 8

        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;

        float bet = 1.1f;

        float newSalary1 = salaryMasha * bet;
        float newSalary2 = salaryDenis * bet;
        float newSalary3 = salaryKristina * bet;

        float difference1 = 12 * newSalary1 - 12 * salaryMasha;
        float difference2 = 12 * newSalary2 - 12 * salaryDenis;
        float difference3 = 12 * newSalary3 - 12 * salaryKristina;

        System.out.println("Маша теперь получает " + newSalary1 + " рублей. Годовой доход вырос на " + difference1 + " рублей.");
        System.out.println("Денис теперь получает " + newSalary2 + " рублей. Годовой доход вырос на " + difference2 + " рублей.");
        System.out.println("Кристина теперь получает " + newSalary3 + " рублей. Годовой доход вырос на " + difference3 + " рублей.");









    }
}