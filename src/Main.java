import java.time.LocalDate;

class HwMethods {
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        separate();
        checkYear(currentYear);  //Задача 1
        separate();
        short clientDeviceYear = 2016;
        byte typeOS = 0;
        suggestVersion(typeOS, clientDeviceYear);        //Задача 2
        separate();
        System.out.println("Задача 3:");
        short deliveryDistance = 95;                //Задача 3
        if (calculateDeliveryTime(deliveryDistance) == 0) {
            System.out.println("Доставка не осуществляется.");
        } else {
            System.out.println("Для доставки потребуется дней: " + calculateDeliveryTime(deliveryDistance));
        }
        separate();
    }
    // Метод первой задачи
    public static void checkYear(int transferredYear) {
        System.out.println("Задача 1:");
        if(transferredYear % 4 == 0 && transferredYear % 100 !=0 || transferredYear % 400==0) {
            System.out.println(transferredYear + " год — високосный год");
        }
        System.out.println(transferredYear + " год — невисокосный год");
    }
    // Метод второй задачи
    public static void suggestVersion(byte typeOS, short yearOfRelease) {
        System.out.println("Задача 2:");
        if (yearOfRelease > 2015 && typeOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        if(yearOfRelease > 2015 && typeOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (yearOfRelease <= 2015 && typeOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
         if (yearOfRelease <= 2015 && typeOS == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке.");
        }
    }

    // Метод третьей задачи
    public static int calculateDeliveryTime(short distance) {
        byte time = 1;
        if (distance < 20) {
            return time;
        } else if (distance >= 20 && distance < 60){
            return time + 1;
        } else if (distance >= 60 && distance < 100) {
            return time + 2;
        } else return 0;
    }

    public static void separate() {
        String s = "-";
        System.out.println(s.repeat(35));
        System.out.println();
    }

}