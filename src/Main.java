public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int first = -115;
        byte second = 127;
        short third = 2169;
        long fourth = 1789324L;
        float fifth = 1789.36f;
        double sixth = 36478942.48924;
        System.out.println("Значение с переменной first с типом int равно " + first);
        System.out.println("Значение с переменной second с типом byte равно " + second);
        System.out.println("Значение с переменной third с типом short равно " + third);
        System.out.println("Значение с переменной fourth с типом long равно " + fourth);
        System.out.println("Значение с переменной fifth с типом float равно " + fifth);
        System.out.println("Значение с переменной sixth с типом double равно " + sixth);

    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        int e = -159;
        int f = 27897;
        byte g = 67;

    }

    public static void task3() {
        System.out.println("Задача 3");
        int firstTeacher = 23;
        int secondTeacher = 27;
        int thirdTeacher = 30;

        int quantityOfPaper = 480;

        int numberOfPaperPerStudent = quantityOfPaper / (firstTeacher + secondTeacher + thirdTeacher);
        System.out.println("На каждого ученика рассчитано " + numberOfPaperPerStudent + " листов бумаги");

    }

    public static void task4() {
        System.out.println("Задача 4");
        int machineEfficiencyPerMinute = 16 / 2;
        int machineEfficiencyPerTwentyMinutes = machineEfficiencyPerMinute * 20;
        int machineEfficiencyPerDay = machineEfficiencyPerMinute * (24 * 60);
        int machineEfficiencyPer3Days = machineEfficiencyPerMinute * (3 * 24 * 60);
        int machineEfficiencyPerMonth = machineEfficiencyPerMinute * (30 * 24 * 60);

        System.out.println("За 20 минут машина произвела " + machineEfficiencyPerTwentyMinutes + " штук бутылок");
        System.out.println("За 1 день машина произвела " + machineEfficiencyPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + machineEfficiencyPer3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + machineEfficiencyPerMonth + " штук бутылок");

    }

    public static void task5() {
        System.out.println("Задача 5");
        int totalPaintRequired = 120;
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;
        int totalPaintsRequiredPerClass = whitePaintPerClass + brownPaintPerClass;
        int numberOfClasses = totalPaintRequired / totalPaintsRequiredPerClass;
        int whitePaintRequired = numberOfClasses * whitePaintPerClass;
        int brownPaintRequired = numberOfClasses * brownPaintPerClass;

        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whitePaintRequired + " банок белой краски и " + brownPaintRequired + " банок коричневой краски");

    }

    public static void task6() {
        System.out.println("Задача 6");
        int weightOfBanana = 80;
        int weightOfMilk = 105;
        int weightOfIceCream = 100;
        int weightOfEgg = 70;

        int numberOfBanana = 5;
        int numberOfMilk = 2;
        int numberOfIceCream = 2;
        int numberOfEgg = 4;

        float totalAmountOfGrams = (numberOfBanana * weightOfBanana) + (numberOfMilk * weightOfMilk) + (numberOfIceCream * weightOfIceCream) + (numberOfEgg * weightOfEgg);
        float totalAmountOfKg = totalAmountOfGrams / 1000;
        System.out.println("Общее количество граммов на завтрак составляет " + totalAmountOfGrams + " г");
        System.out.println("Общее количество килограммов на завтрак составляет " + totalAmountOfKg + " кг");

    }

    public static void task7() {
        System.out.println("Задача 7");
        double requiredWeightToLose = 7.0;
        double possibleWeightLose1 = 0.250;
        double possibleWeightLose2 = 0.500;
        double averageWeightLose = (possibleWeightLose1 + possibleWeightLose2) / 2;

        double days1 = requiredWeightToLose / possibleWeightLose1;
        double days2 = requiredWeightToLose / possibleWeightLose2;
        double averageDays = requiredWeightToLose / averageWeightLose;

        System.out.println("В среднем потребуется " + averageDays + " чтобы похудеть на 7 кг");
        System.out.println("При потере 250 г в день потребуется " + days1 + " дней чтобы похудеть на 7 кг");
        System.out.println("При потере 500 г в день потребуется " + days2 + " дней чтобы похудеть на 7 кг");

    }

    public static void task8() {
        System.out.println("Задача 8");

        float salaryOfMaria = 67760;
        float salaryOfDenis = 83690;
        float salaryOfKristina = 76320;
        float promotionPercentage = 1.1f;

        float annualSalaryForMariaBeforePromotion = salaryOfMaria * 12;
        float annualSalaryForDenisBeforePromotion = salaryOfDenis * 12;
        float annualSalaryForKristinaBeforePromotion = salaryOfKristina * 12;

        float newSalaryForMaria = salaryOfMaria * promotionPercentage;
        float newSalaryForDenis = salaryOfDenis * promotionPercentage;
        float newSalaryForKristina = salaryOfKristina * promotionPercentage;

        float annualSalaryForMariaAfterPromotion = newSalaryForMaria * 12;
        float annualSalaryForDenisAfterPromotion = newSalaryForDenis * 12;
        float annualSalaryForKristinaAfterPromotion = newSalaryForKristina * 12;

        float differenceBetweenPromotionForMaria = annualSalaryForMariaAfterPromotion - annualSalaryForMariaBeforePromotion;
        float differenceBetweenPromotionForDenis = annualSalaryForDenisAfterPromotion - annualSalaryForDenisBeforePromotion;
        float differenceBetweenPromotionForKristina = annualSalaryForKristinaAfterPromotion - annualSalaryForKristinaBeforePromotion;

        System.out.println("Маша теперь получает " + newSalaryForMaria + " рублей. Годовой доход вырос на " + differenceBetweenPromotionForMaria + " рублей");
        System.out.println("Денис теперь получает " + newSalaryForDenis + " рублей. Годовой доход вырос на " + differenceBetweenPromotionForDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryForKristina + " рублей. Годовой доход вырос на " + differenceBetweenPromotionForKristina + " рублей");

    }
}