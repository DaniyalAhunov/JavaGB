package Java.Seminar1;

import java.util.Scanner;

// Написать программу вычисления n-ого треугольного числа
public class DZ_1 {
    public static void main(String[] args) {
        try (Scanner vvod = new Scanner(System.in)) {
            System.out.print("Input a number: ");
            int num = vvod.nextInt();
            System.out.println(triangle(num));
        }
    }
   
//    public static int triangle(int n) { // Пример с рекурсией
//     if(n==1)          
//         return 1;
//     else
//         return( n + triangle(n-1) );
//    }


    public static int triangle(int n){ // Пример без рекурсии
        return(n*(n+1)/2);
    }
     
}
