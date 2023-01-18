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
        int year = 1300;
        int vis = year % 4;
        int vis1 = year % 100;
        int vis2 = year % 400;
        if (vis == 0 && vis2 == 0) {
            System.out.println("Год високосный");
            if (vis1 == 100) {
                System.out.println("Год не високосный");
            }
        } else {
            System.out.println("Год не високосный");
        }
        //Задача №4
        System.out.println("Задача №4");
        int deliveryDistance = 101;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет 1 сутки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка займет 2 суток");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка займет 3 суток");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
        // Задача № 5
        System.out.println("Задача № 5");
        int monthNumber = 11;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь, месяц зимний");
                break;
            case 2:
                System.out.println("Февраль, месяц зимний");
                break;
            case 3:
                System.out.println("Март, месяц весенний");
                break;
            case 4:
                System.out.println("Апрель, месяц весенний");
                break;
            case 5:
                System.out.println("Май, месяц весенний");
                break;
            case 6:
                System.out.println("Июнь, месяц летний");
                break;
            case 7:
                System.out.println("Июль,месяц летний");
                break;
            case 8:
                System.out.println("Август, месяц летний");
                break;
            case 9:
                System.out.println("Сентябрь, месяц осенний");
                break;
            case 10:
                System.out.println("Октябрь, месяц осенний");
                break;
            case 11:
                System.out.println("Ноябрь, месяц осенний");
                break;
            case 12:
                System.out.println("Декабрь, месяц зимний");
                break;
            default:
                System.out.println("Значение месяца больше 13,ошибочное значение");

        }
    }
}

