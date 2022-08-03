public class Main {
    public static void main(String[] args) {
        var type1 = 3;
        byte type2 = 10;
        short type3 = 7;
        int type4 = 8;
        long type5 = 10L;
        float type6 = 3.4f;
        double type7 = 3.435;
        System.out.println("Первое задание готово");

        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float SummWeight = boxer1 + boxer2;
        System.out.println("Сумма веса двух боксёров " + SummWeight + " кг.");
        double DifferenceWeight = boxer2 - boxer1;
        System.out.println("Разница веса двух боксёров " + DifferenceWeight + " кг.");
        System.out.println("Второе задание готово");

        int bananas = 5;
        int milk = 200;
        int iceCream = 2;
        int eggs = 4;
        bananas = bananas * 80;
        milk = milk / 100 * 105;
        iceCream = iceCream * 100;
        eggs = eggs * 70;
        double SumWeight = (bananas + milk + iceCream + eggs);
        SumWeight = SumWeight / 1000;
        System.out.println("Вес такого спорт-завтрака равен " + SumWeight + " кг!");
        System.out.println("Третье задание готово");

        int NeedToLose = 7;
        int DietVersion1 = 250; //Такое количество грамм теряем в день
        int DietVersion2 = 500; //Такое количество грамм теряем в день
        int DaysToEndVersion1;
        int DaysToEndVersion2;
        int AverageDaysToEnd;
        NeedToLose = NeedToLose * 1000;

        DaysToEndVersion1 = NeedToLose / DietVersion1;
        System.out.println("Если спортсмен будет терять по " + DietVersion1 + " грамм в день, то на похудение ему понадобится " + DaysToEndVersion1 + " дней");

        DaysToEndVersion2 = NeedToLose / DietVersion2;
        System.out.println("Если спортсмен будет терять по " + DietVersion2 + " грамм в день, то на похудение ему понадобится " + DaysToEndVersion2 + " дней");

        AverageDaysToEnd = (DaysToEndVersion1 + DaysToEndVersion2) / 2;
        System.out.println("В среднем для похудения спортсмену понадобится " + AverageDaysToEnd + " день!");

        System.out.println("Четвёртое задание готово");

        int MoneyMashaOldMonth = 67760;
        int MoneyMashaNewMonth;
        int MoneyDenisOldMonth = 83690;
        int MoneyDenisNewMonth;
        int MoneyKristyOldMonth = 76230;
        int MoneyKristyNewMonth;
        int MoneyMashaDifferenceYears;
        int MoneyDenisDifferenceYears;
        int MoneyKristyDifferenceYears;

        MoneyMashaNewMonth = (MoneyMashaOldMonth / 10) + MoneyMashaOldMonth;
        MoneyDenisNewMonth = (MoneyDenisOldMonth / 10) + MoneyDenisOldMonth;
        MoneyKristyNewMonth = (MoneyKristyOldMonth / 10) + MoneyKristyOldMonth;

        MoneyMashaDifferenceYears = (MoneyMashaNewMonth * 12) - (MoneyMashaOldMonth * 12);
        MoneyDenisDifferenceYears = (MoneyDenisNewMonth * 12) - (MoneyDenisOldMonth * 12);
        MoneyKristyDifferenceYears = (MoneyKristyNewMonth * 12) - (MoneyKristyOldMonth * 12);

        System.out.println("Теперь Маша получает " + MoneyMashaNewMonth + " рублей. А годовой доход вырос на " + MoneyMashaDifferenceYears + " рублей!");
        System.out.println("Теперь Денис получает " + MoneyDenisNewMonth + " рублей. А годовой доход вырос на " + MoneyDenisDifferenceYears + " рублей!");
        System.out.println("Теперь Кристина получает " + MoneyKristyNewMonth + " рублей. А годовой доход вырос на " + MoneyKristyDifferenceYears + " рублей!");

        System.out.println("Все задания готовы!");
    }
}