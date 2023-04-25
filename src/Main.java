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
    public static void task1 () {
        System.out.println("Задача 1");
        byte b = 1;
        short s = 22;
        int i = 333;
        long l = 4444;
        float f = 0.01f;
        double d = 9.999;
        System.out.println(" Значение переменной b с типом byte равно " + b);
        System.out.println(" Значение переменной s с типом short равно " + s);
        System.out.println(" Значение переменной i с типом int равно " + i);
        System.out.println(" Значение переменной l с типом long равно " + l);
        System.out.println(" Значение переменной f с типом float равно " + f);
        System.out.println(" Значение переменной d с типом double равно " + d);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        int e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int teacherLp = 23;
        int teacherAs = 27;
        int teacherEa = 30;
        int totalPaper = 480;
        int totalStudents = teacherLp + teacherAs + teacherEa;
        int eachStudentPaper = totalPaper/totalStudents;
        System.out.println(" На каждого ученика рассчитано " + eachStudentPaper + " листов бумаги ");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int capacity2min = 16;
        int capacity20min = capacity2min * 10;
        int capacity24h = capacity20min * 72;
        int capacity3days = capacity24h * 3;
        int capacity1month = capacity3days * 10;
        System.out.println(" За 20 минут машина произвела бутылок - " + capacity20min + " штук ");
        System.out.println(" За сутки машина произвела бутылок - " + capacity24h + " штук ");
        System.out.println(" За три дня машина произвела бутылок - " + capacity3days + " штук ");
        System.out.println(" За месяц машина произвела бутылок - " + capacity1month + " штук ");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int white = 2;
        int brown = 4;
        int totalTins = 120;
        int perRoomTins = white + brown;
        int totalRooms = totalTins/perRoomTins;
        int totalWhite = totalRooms * white;
        int totalBrown = totalRooms * brown;
        System.out.println(" В школе, где " + totalRooms + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");{
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int bananas = 5 * 80;
        int milk = 200 / 100 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int Weight = bananas + milk + iceCream + eggs;
        double WeightKg = Weight / 1000.0;
        System.out.println("Вес такого спорт-завтрака в кг - " + WeightKg);
    }
    public static void task7() {
        System.out.println("Задача 7");
        int weightLossKg = 7;
        int minGrPerDay = 250;
        int maxGrPerDay = 500;
        int weightLossGr = weightLossKg * 1000;
        int ifMin = weightLossGr / minGrPerDay;
        int ifMax = weightLossGr / maxGrPerDay;
        int daysAverage = (ifMin + ifMax) / 2;
        System.out.println("если спортсмен будет терять каждый день по 250 грамм, то " + ifMin  + " дней уйдет на похудение ");
        System.out.println("если спортсмен будет терять каждый день по 500 грамм, то " + ifMax + " дней уйдет на похудение");
        System.out.println("если в среднем, то " + daysAverage + " день уйдет на похудение");
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int Masha = 67760;
        int Denis = 83690;
        int Christina = 76230;
        float MashaIncrease = Masha * 0.1f;
        float DenisIncrease = Denis * 0.1f;
        float ChristinaIncrease = Christina * 0.1f;
        float MashaNewSalary = Masha + MashaIncrease;
        float DenisNewSalary = Denis + DenisIncrease;
        float ChristinaNewSalary = Christina + ChristinaIncrease;
        float MashaYearIncrease = MashaIncrease * 12;
        float DenisYearIncrease = DenisIncrease * 12;
        float ChristinaYearIncrease = ChristinaIncrease * 12;
        System.out.println("Маша теперь получает " + MashaNewSalary + " рублей. Годовой доход вырос на " + MashaYearIncrease + " рублей");
        System.out.println("Маша теперь получает " + DenisNewSalary + " рублей. Годовой доход вырос на " + DenisYearIncrease + " рублей");
        System.out.println("Маша теперь получает " + ChristinaNewSalary + " рублей. Годовой доход вырос на " + ChristinaYearIncrease + " рублей");
}
}
