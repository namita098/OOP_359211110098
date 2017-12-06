//condition
//        score 0-49 grade F
//        score 50-59 grade D
//         score 60-79 grade C
//         score 70-89 grade B
//         score 80-100 grade A
package ooplab3;

import java.util.Scanner;

public class CalGrade {
    public static  void  main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int scor;
        System.out.print("100: ");
        scor = scanner.nextInt();
//      test condition scor
        if (scor < 49)
            System.out.println("your grade is F");
        else if (scor < 59)
            System.out.println("your grade is D");
        else  if (scor < 69)
            System.out.println("your grade is C");
        else if (scor < 79)
            System.out.println("your grade is B");
        else System.out.println("your grade is A");








        }
}
