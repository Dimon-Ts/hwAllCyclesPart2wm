public class Main {
    public static void main(String[] args) {
        {
            System.out.println("ДОМАШНЕЕ ЗАДАНИЕ 1.");
            // Циклы.Часть 2.
            // Домашнее задание 1.
            // Задание 1.
            System.out.println("НАКОПЛЕНИЯ И ПРОЦЕНТЫ ПО ВКЛАДУ.ЦЕЛЬ НАКОПИТЬ 2_459_000 РУБЛЕЙ.");
            int contribution = 15_000;
            double totalContribution = 0;
            int z = 0;
            while (totalContribution <= 2_459_000) {
                z++;
                totalContribution = totalContribution + totalContribution / 100;
                totalContribution = totalContribution + contribution;
                System.out.println("Месяц " + z + " ,сумма накоплений равна "
                        + String.format("%.2f", totalContribution) + " рублей.");
            }


            // Задание 2.
            System.out.println("ПОСЛЕДОВАТЕЛЬНОСТИ ЧИСЕЛ");
            int a = 0;
            while (a < 10) {
                a++;
                System.out.print(a + " ");
            }
            System.out.println("  ");
            for (int b = 10; b >= 1; b--) {
                System.out.print(b + " ");
            }
            System.out.println("  ");
            // Задание 3
            System.out.println(" ЧИСЛЕННОСТЬ НАСЕЛЕНИЯ СТРАНЫ Y ");
            int сountryPopY = 12_000_000;
            System.out.println("На данный момент,численность населения страны Y составляет "
                    + сountryPopY + " человек. ");
            int fertilityPer1000IY = 17 * 12_000_000 / 1000;
            int mortalityPer1000IY = 8 * 12_000_000 / 1000;
            int addPopPer1000IY = fertilityPer1000IY - mortalityPer1000IY;
            System.out.println("Численность населения cтраны Y,в будущем,составит: ");
            for (int x = 1; x <= 10; x++) {
                сountryPopY = сountryPopY + addPopPer1000IY;
                System.out.println("Год " + x + " , численность населения составляет "
                        + сountryPopY + " человек. ");
            }
        }
        System.out.println("ДОМАШНЕЕ ЗАДАНИЕ 2.");
        // Домашнее задание 2
        // Задание 1
        System.out.println("       НАКОПЛЕНИЯ ВАСИЛИЯ");
        double totalContributionVasil = 15_000;
        System.out.println("      Первоначальные накопления Василия "
                + String.format("%.2f", totalContributionVasil) + " рублей.");
        int r = 1;
        for (; totalContributionVasil <= 12_000_000; r++) {
            totalContributionVasil = totalContributionVasil + totalContributionVasil * 0.07;
            System.out.println("Месяц " + r + " ,сумма накоплений Василия равна "
                    + String.format("%.2f", totalContributionVasil) + " рублей.");
        }
        // Задание 2
        System.out.println("      СОКРАЩЁННЫЙ ОТЧЁТ О НАКОПЛЕНИЯХ ВАСИЛИЯ");
        double totalContributionVasilS = 15_000;
        System.out.println("      Первоначальные накопления Василия "
                + String.format("%.2f", totalContributionVasilS) + " рублей.");
        int q = 1;
        for (; totalContributionVasilS <= 14_000_000; q++) {
            totalContributionVasilS = totalContributionVasilS + totalContributionVasilS * 0.07;
            if (q % 6 == 0) {
                System.out.println("Месяц " + q + " ,сумма накоплений Василия равна "
                        + String.format("%.2f", totalContributionVasilS) + " рублей.");
            }

        }
        // Задание 3
        System.out.println("      ВКЛАД ВАСИЛИЯ НА БЛИЖАЙШИЕ 9 ЛЕТ.");
        double totalContributionVasilN = 15_000;
        System.out.println("      Первоначальные накопления Василия "
                + String.format("%.2f", totalContributionVasilN) + " рублей.");
        int j = 1;
        for (; j <= 108; j++) {
            totalContributionVasilN = totalContributionVasilN + totalContributionVasilN * 0.07;
            if (j % 6 == 0) {
                System.out.println("Месяц " + j + " ,сумма накоплений Василия равна "
                        + String.format("%.2f", totalContributionVasilN) + " рублей.");
            }
        }
        // Задания 4
        System.out.println("ОТЧЁТНАЯ ПЯТНИЦА");
        int Friday = 7;
        for (; Friday <= 31; Friday++) {
            if (Friday % 7 == 0) {
                System.out.println("Сегодня пятница," + Friday + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println("ДОМАШНЕЕ ЗАДАНИЕ 3");
        // Домашнее задание 3
        // Задание 1
        System.out.println("КОМЕТА.");
        int currentYear = 2022;
        int startPeriod = currentYear - 200;
        int endPeriod = currentYear + 100;
        for (int i = startPeriod; i <= endPeriod; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }

        // Задание 2
        System.out.println("АЛГОРИТМ ТАБЛИЦы УМНОЖЕНИЯ НА 2");
        for (int h = 1; h <= 10; h++) {
            int w = h * 2; {
                System.out.println("2*" + h + "=" + w);
            }
        }
        }
    }
