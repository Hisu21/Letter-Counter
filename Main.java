import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please choose an option: ");
            System.out.println("1. Letter Counter");
            System.out.println("2. Consonant Counter");
            System.out.println("3. Vowel Counter");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Counter.stringCounter();
                    System.exit(0);
                    break;

                    case 2:
                        Counter.consonantCounter();
                        System.exit(0);
                        break;

                        case 3:
                            Counter.vowelCounter();
                            System.exit(0);
                            break;

                            case 4:
                                System.out.println("Exiting the program....");
                                System.exit(0);

                                default:
                                    System.out.println("Invalid choice");
                                    System.out.println("Restarting......");
                                    System.out.println("=====================================");
                                    break;
            }
        }
        }
    }

    class Counter{

    static int n;
    static String x;
    static String m;

    static void stringCounter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        x = sc.nextLine();
        lowerCase justin = new lowerCase();
        m = justin.tolowerCase(x);
        lengthy cayton = new lengthy();
        n = cayton.getlength(m);
       // n = x.length();
        System.out.println("=====================================");
        System.out.println("Letter Counter V.01");
        System.out.println("Your word: " + x);
        System.out.println("Letters in your word: " + n);
        System.out.println("======================================");

    }

   static class lengthy{
        int getlength(String word){
            return word.replaceAll(" ", "").length();
        }
    }

    static void consonantCounter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        x = sc.nextLine();
        lowerCase justin = new lowerCase();
        m = justin.tolowerCase(x);
        consonant cayton = new consonant();
        n = cayton.consonantCounter(m);
        System.out.println("=====================================");
        System.out.println("Consonant Counter V.01");
        System.out.println("Your word: " + x);
        System.out.println("Letters in your word: " + n);
        System.out.println("======================================");

    }

    static class consonant{
        int consonantCounter(String word){
            return word.replaceAll("[aeiou ]", "").length();
        }
    }

    static void vowelCounter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        x = sc.nextLine();
        lowerCase justin = new lowerCase();
        m = justin.tolowerCase(x);
        Vowel cayton = new Vowel();
        n = cayton.vowelCounter(m);
        System.out.println("=====================================");
        System.out.println("Vowel Counter V.01");
        System.out.println("Your word: " + x);
        System.out.println("Letters in your word: " + n);
        System.out.println("======================================");

    }
    static class Vowel{
        int vowelCounter(String word){
            return word.replaceAll("[bcdfghjklmnpqrstvwxyz ]", "").length();
        }
    }

    static class lowerCase{
        String tolowerCase(String word) {
            return word.toLowerCase();
        }
    }
 }
