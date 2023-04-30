public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1 ");
        var weight1 = 78.2;
        var weight2 = 82.7;
        System.out.println(weight1 + weight2);
        System.out.println(weight2 - weight1);
        System.out.println(weight2%weight1);
        System.out.println(" ");
        System.out.println("Задача №2 ");
        int banana=80;
        banana=banana*5;
        int milk=105;
        milk=milk*2;
        int iceCream=100;
        iceCream=iceCream*2;
        int egg=70;
        egg=egg*4;
        double sum=banana+milk+iceCream+egg;
        System.out.println(sum);
        System.out.println(sum/1000);
        System.out.println(" ");
        System.out.println("Задача №3");
        int allWatch=640;
        int workerWatch=8;
        int employees=allWatch/workerWatch;
        System.out.println("Всего работников в компании — "+employees+ " человек.");
        employees=employees+94;
        int extendedTime=employees/8;
        System.out.println("Если в компании работает " +employees+" человек, то всего "+extendedTime+" работы может быть поделено между сотрудниками.");
        System.out.println(" ");
        System.out.println("Задача №4");
        int studentsAnnaP=23;
        int studentsAnnaS=27;
        int studentsEkaterinaA=30;
        int allBooks=480;
        int studentBook=allBooks/(studentsAnnaP+studentsAnnaS+studentsEkaterinaA);
        System.out.println("На каждого ученика рассчитано " +studentBook+ " книг.");
        System.out.println(" ");
        System.out.println(" Задача № 5 ");
        int productiviti2Hour=16;
        int productiviti1Hour=8;
        int productivity20Minutes=productiviti1Hour/60*20;
        System.out.println(" «За 20 минут машина произвела " +productivity20Minutes+ " штук бутылок».");
        int productivityDay=productiviti1Hour*24;
        System.out.println(" «За сутки машина произвела " +productivityDay+ " штук бутылок».");
        int productivity3Day=productivityDay*3;
        System.out.println(" «За 3 дня машина произвела " +productivity3Day+ " штук бутылок».");
        int productivitymonth=productivityDay*30;
        System.out.println(" «За месяц машина произвела " +productivitymonth+ " штук бутылок».");
        System.out.println(" ");
        System.out.println("Задача №6");
        int mashaSalary=67780;
        int denisSalary=83690;
        int kristinaSalary=76230;
        double indexingSalaryMasha=mashaSalary*0.1+mashaSalary;
        double differenceMasha=indexingSalaryMasha*12-mashaSalary*12;
        System.out.println(" «Маша теперь получает " + indexingSalaryMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей».");
        double indexingSalaryDenis=denisSalary*0.1+denisSalary;
        double differenceDenis=indexingSalaryDenis*12-denisSalary*12;
        System.out.println(" «Денис теперь получает " + indexingSalaryDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей».");
        double indexingSalarykristina=kristinaSalary*0.1+kristinaSalary;
        double differenceKristina=indexingSalarykristina*12-kristinaSalary*12;
        System.out.println(" «Кристина теперь получает " + indexingSalarykristina + " рублей. Годовой доход вырос на " + differenceKristina+ " рублей».");




    }
}