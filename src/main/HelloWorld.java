package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        int uneseniBroj = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

//        foreach???

        do {
            System.out.println("Unesite broj: ");
            try {
                uneseniBroj = scanner.nextInt();
                int provjerenBroj = findEvenOdd(uneseniBroj);
                if (uneseniBroj % 2 != 0) {
                    break;
                }

                sum += provjerenBroj;
                System.out.println("Broj je " + provjerenBroj);
            } catch (InputMismatchException err) {
                System.out.println("Molimo unesite ispravan broj, " + err);
                //scanner.next();
                //uneseniBroj = 1;
                continue;
            } catch (NumberFormatException err) {
                System.out.println("Molimo unesite odgovarajući format" + err);
            }
        //chekirat sa hasnexInt
        } while (uneseniBroj > 0);

        System.out.println("Zbroj parnih brojeva je " + sum);
    }

    public static int findEvenOdd(int number) throws InputMismatchException {

        if (number % 2 == 0) {
            System.out.println(number + " is even");
            System.out.println(dayCheckMethod(number));
            return number;
        } else {
            System.out.println(number + " is odd");
            System.out.println(dayCheckMethod(number));
            return 0;
        }
    }

    public static String dayCheckMethod(int dayOfWeek) {
//        int dayOfWeek = 1;
        String dayName;

        switch (dayOfWeek % 7) {
            case 0:
                dayName = "Sunday";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            case 8:
                if (dayOfWeek == 8) {
                    dayName = "Holiday";
                    break;
                }
            default:
                dayName = "Invalid day";
                break;
        }
        return dayName;
    }

}
