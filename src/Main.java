import java.time.LocalDate;

class HwMethods {
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        separate();
        checkYear(currentYear);  //Задача 1
        separate();
        //short clientDeviceYear = 2016;
        int typeOS = 0;                   //Задача 2
        int yearOfRelease = 2020;
        suggestVersion(typeOS, yearOfRelease);
        separate();
        System.out.println("Задача 3:"); //Задача 3
        int deliveryDistance = 95;
        int deliveryTime = calculateDeliveryTime(deliveryDistance);
        if (deliveryTime == 0) {
            System.out.println("Доставка не осуществляется.");
        } else {
            System.out.println("Для доставки потребуется дней: " + deliveryTime);
        }
        separate();
    }
    // Метод первой задачи
    static void checkYear(int transferredYear) {
        System.out.println("Задача 1:");
        if(transferredYear % 4 == 0 && transferredYear % 100 !=0 || transferredYear % 400==0) {
            System.out.println(transferredYear + " год — високосный год");
        } else {
            System.out.println(transferredYear + " год — невисокосный год");
        }
    }
    // Метод второй задачи
    static void suggestVersion(int typeOS, int yearOfRelease) {
        System.out.println("Задача 2:");
        int currentYear = LocalDate.now().getYear();
        if (yearOfRelease < currentYear && typeOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        if(yearOfRelease < currentYear && typeOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (yearOfRelease >= currentYear && typeOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
         if (yearOfRelease >= currentYear && typeOS == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке.");
        }
    }

    // Метод третьей задачи
    static int calculateDeliveryTime(int distance) {
        int time = 1;
        if (distance < 20) {
            return time;
        } else if (distance >= 20 && distance < 60){
            return time + 1;
        } else if (distance >= 60 && distance < 100) {
            return time + 2;
        } else {
            return 0;
        }
    }

    static void separate() {
        String s = "-";
        System.out.println(s.repeat(35));
        System.out.println();
    }

}