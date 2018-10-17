package kek;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Date da = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd MM");
        String today = df.format(da);
        Scanner scan = new Scanner(System.in);
        System.out.println("умножить на 2 число дня своего рождения.");
        System.out.println("Теперь сложите получившееся произведение и число 5 и умножте на 50 полученную сумму.");
        System.out.println("К этому результату необходимо прибавить номер месяца рождения (июль — 7, январь — 1)");
        System.out.println("Теперь введите полученное число");
        String s = scan.nextLine();
        int magic, month, date;
        try {
            magic = Integer.parseInt(s);
            magic -= 250;
            date = magic / 100;
            month = magic - date * 100;
            String monthString, sign;
            switch (month) {
                case 1:
                    monthString = "Января";
                    if (date <= 19) {
                        sign = "Козерог";
                    } else {
                        sign = "Водолей";
                    }
                    break;
                case 2:
                    monthString = "Февраля";
                    if (date <= 18) {
                        sign = "Водолей";
                    } else {
                        sign = "Рыбы";
                    }
                    break;
                case 3:
                    monthString = "Марта";
                    if (date <= 20) {
                        sign = "Рыбы";
                    } else {
                        sign = "Овен";
                    }
                    break;
                case 4:
                    monthString = "Апреля";
                    if (date <= 19) {
                        sign = "Овен";
                    } else {
                        sign = "Телец";
                    }
                    break;
                case 5:
                    monthString = "Мая";
                    if (date <= 20) {
                        sign = "Телец";
                    } else {
                        sign = "Близнецы";
                    }
                    break;
                case 6:
                    monthString = "Июня";
                    if (date <= 20) {
                        sign = "Близнецы";
                    } else {
                        sign = "Рак";
                    }
                    break;
                case 7:
                    monthString = "Июля";
                    if (date <= 22) {
                        sign = "Рак";
                    } else {
                        sign = "Лев";
                    }
                    break;
                case 8:
                    monthString = "Августа";
                    if (date <= 22) {
                        sign = "Лев";
                    } else {
                        sign = "Дева";
                    }
                    break;
                case 9:
                    monthString = "Сентября";
                    if (date <= 22) {
                        sign = "Дева";
                    } else {
                        sign = "Весы";
                    }
                    break;
                case 10:
                    monthString = "Октября";
                    if (date <= 22) {
                        sign = "Весы";
                    } else {
                        sign = "Скорпион";
                    }
                    break;
                case 11:
                    monthString = "Ноября";
                    if (date <= 21) {
                        sign = "Скорпион";
                    } else {
                        sign = "Стрелец";
                    }
                    break;
                case 12:
                    monthString = "Декабря";
                    if (date <= 21) {
                        sign = "Стрелец";
                    } else {
                        sign = "Козерог";
                    }
                    break;
                default:
                    monthString = "Не знаем такого";
                    sign = "не известно";
                    break;
            }
            if (date == Integer.parseInt(today.substring(0, 2)) && month == Integer.parseInt(today.substring(3))) {
                System.out.println("С Днём рождения!!!");
            }
            System.out.println("Ваш знак зодиака " + sign);
            System.out.println("Вы родились " + date + " " + monthString);

        } catch (Exception x) {
            System.out.println("ошибка. было введено не число");
        }
    }
}
