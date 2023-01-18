public class Main {
    public static void main(String[] args) {
        //   char color = 'g';
        //   if (color == 'r') {
        //       System.out.println("Красный! Ехать нельзя");
        //   }
        //  else if (color == 'y') {
        //       System.out.println("Желтый! подождите смену цвета");
        //    } else {
        //        System.out.println("Зеленый, ехать можно");
        //   }
        //    char color = 's';
        //    switch (color) {
        //        case 'r':
        //            System.out.println("Красный! Всем стоять");
        //            break;
        //        case 'y':
        //            System.out.println("Желтый! Приготовится к смене сигнала светофора");
        //            break;
        //        case 'g':
        //            System.out.println("Зеленый, можно продолжить движение");
        //            break;
        //        default:
        //            System.out.println("Ошибочное значение");
        //    }
        //    int age = 8;
        //    if (age>18) {
        //        System.out.println("Поздравляю, ты совершеннолетний!");
        //        if (age < 21) {
        //            System.out.println(" Выпей, сливочного пива!");
        //        } else {
        //            System.out.println(" Иди куда хочешь и пей ,что хочешь!");


        //    }else if (age>=7) {
        //                System.out.println("Тебе нужно в школу");
        //            } else {
        //                System.out.println("Иди в детский сад");
        //            }
        //             int age = 7;
        //             if (age == 18) {
        //             System.out.println("Поздравляю, ты совершеннолетний ");
        //             } else if (age == 21) {
        //             System.out.println("Поздравляю! Тебе можно выпить пивка");
        //             } else if (age == 7 ) {
        //             System.out.println("Иди в школу");
        //             } else {
        //             System.out.println("Не удалось определить, чему можно порадоваться ");
        //                int age = 34;
        //                switch (age){
        //                    case 18:
        //                         System.out.println("Поздравляю, ты совершеннолетний");
        //                        break;
        //                     case 21:
        //                        System.out.println("Теперь можешь выпить пивка");
        //                        break;
        //                    case 7:
        //                        System.out.println("Иди в школу");
        //                        break;
        //                    default:
        //                        System.out.println("Сказать ничего не могу");
        //Задача №1,2
        System.out.println("Задача №1,2");
        int clientOS = 0;
        int clientDeviceYear = 2012;
        if (clientOS == 1) {
            System.out.println("Установите версию для iOS по ссылке.");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию для iOS по ссылке");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию для Android по ссылке");
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите обычную версию для Android");
                }
            }
        }
        // Задача №3
        System.out.println("Задача №3");
        int year = 600;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является высокосным");
        } else {
            System.out.println("Год не является высокосным");
        }

        //Задача №4
        System.out.println("Задача №4");
        int deliveryDistance = 3;
        int deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay++;
        }
        if (deliveryDistance > 60) {
            deliveryDay++;
        }
        System.out.println("Доставка займет: " + deliveryDay);


        // Задача № 5
        System.out.println("Задача № 5");
        int monthNumber = 5;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Значение месяца больше 13,ошибочное значение");

        }
    }
}

