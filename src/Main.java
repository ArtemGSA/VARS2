public class Main {
    public static void main(String[] args) {
        //ЗАДАЧА1
        byte b = 100;
        short sh = 300;
        int i = 40000;
        long l = 100000000l;
        float f = 100.112f;
        double d = 102.9999;
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной sh с типом short равно " + sh);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной b с типом double равно " + d);
        //ЗАДАЧА2
        float fl = 27.12f;
        long k = 987678965549l;
        double digits = 2.786;
        short ssshhhh = 569;
        int n = -159;
        int iAmArtem = 27897;
        byte botBob = 67;
        //ЗАДАЧА3
        byte lp = 23;
        byte an = 27;
        byte ea = 30;
        short vsegoUchenikov = (short) (lp + an + ea);
        short vsegoListov = 480;
        double listovNaUchenika = vsegoListov/vsegoUchenikov;
        System.out.println("...");
        System.out.println("На каждого ученика рассчитано "+ listovNaUchenika + " листов бумаги");
        ///ЗАДАЧА4
        System.out.println("...");
        byte bottlesEveryTwoMinutes = 16;
        byte bottlesRepMinute = 16/2;
        int bForTwentyMinutes = bottlesRepMinute*20;
        int bForDay = bottlesRepMinute*1440;
        int bForThreeDays = bForDay*3;
        long bForMonth = bForThreeDays*10;
        System.out.println("За 20 минут машина произвела " + bForTwentyMinutes + " штук бутылок.");
        System.out.println("За суки машина произвела " + bForDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + bForThreeDays + " штук бутылок.");
        System.out.println("За месяц машина произвела " + bForMonth + " штук бутылок.");
        //ЗАДАЧА5
        System.out.println("...");
        byte banokVsego = 120;
        byte banokBeloyNaKlass = 2;
        byte banokKorichnevoyNaKlass = 4;
        int vsegoKlassov = banokVsego/(banokBeloyNaKlass+banokKorichnevoyNaKlass);
        System.out.println("В школе, где " + vsegoKlassov + " классов, нужно " + vsegoKlassov*banokBeloyNaKlass + " банок белой краски и " + vsegoKlassov*banokKorichnevoyNaKlass + " банок коричневой краски");
        //ЗАДАЧА6
        System.out.println("...");
        short massBanana = 80;
        short massMilk = 105;
        short massIce = 100;
        short massEggs = 70;
        byte ammountOfBanana = 5;
        byte ammountOfMilk = 2;
        byte ammounyOfIce = 2;
        byte ammountOfEgg = 4;
        int totalMassInGrams = massBanana*ammountOfBanana+massEggs*ammountOfEgg+massMilk*ammountOfMilk+massEggs*ammountOfEgg;
        double totalMassInKilo = totalMassInGrams/1000;
        System.out.println("Масса в гарммах равна " + totalMassInGrams);
        System.out.println("Масса в килограммах равна " + totalMassInKilo);
        //ЗАДАЧА7
        System.out.println("...");
        byte massInKillo = 7;
        short minReduce = 250;
        short maxReduce = 500;
        short massInGrams = 7*1000;
        System.out.println("Если терять в день по 250 грамм, то потребуется " + massInGrams/minReduce + " дней");
        System.out.println("Если терять в день по 500 грамм, то потребуется " + massInGrams/maxReduce + " дней");
        //ЗАДАЧА8
        System.out.println("...");
        int zpMasha = 67760;
        int zpDenis = 83690;
        int zpKristina = 76230;
        int povishMasha = zpMasha/10;
        int povishDenis = zpDenis/10;
        int povishKristina = zpKristina/10;
        zpMasha += povishMasha;
        zpDenis += povishDenis;
        zpKristina += povishKristina;
        System.out.println("Маша теперь получает " + zpMasha + " рублей. Годовой доход вырос на " + povishMasha*12 + " рублей");
        System.out.println("Денис теперь получает " + zpDenis + " рублей. Годовой доход вырос на " + povishDenis*12 + " рублей");
        System.out.println("Кристина теперь получает " + zpKristina + " рублей. Годовой доход вырос на " + povishKristina*12 + " рублей");




    }
}