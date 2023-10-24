import com.sun.corba.se.impl.orbutil.concurrent.Sync;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" enter user name ");
        String am = input.next();


        if (am.equals("Ghaliah")) {
            System.out.println(" welcome admin");

        } else if (am.equals("Sara")) {
            System.out.println(" welcome superuser ");
        } else
            System.out.println(" welcome user ");

        //q2


        System.out.println(" pls inter number1 ");
        int as1 = input.nextInt();
        System.out.println(" pls inter number2 ");
        int as2 = input.nextInt();
        System.out.println(" pls inter number3 ");
        int as3 = input.nextInt();


        if (as1 > as2 && as1 > as3) {
            System.out.println(" the greatest" + as1);
        } else if (as2 > as3) {
            System.out.println("the  greatest " + as2);
        } else
            System.out.println(" the greatest " + as3);


        //q3


        int num=4;

        switch (num) {

            case 1:
                System.out.println(" sunday ");
            case 2:
                System.out.println(" monday");
                break;
            case 3:
                System.out.println(" tuesday ");
                break;
            case 4:
                System.out.println(" wednesday ");
                break;
            case 5:
                System.out.println(" thursday ");
                break;
            case 6:
                System.out.println(" friday ");
                break;
            case 7:
                System.out.println(" saturday ");
        }

                //q4

                System.out.println(" pls enter your degree");
                int degree=input.nextInt();


                if ( degree >=90){
                    System.out.println("A");
                } else if (degree >=80) {
                    System.out.println("B");
                    }
                else if (degree >=70) {
                    System.out.println("C");
                  } else if ( degree >=60) {
                    System.out.println("D");
                } else if (degree >=0) {
                    System.out.println("F");
                }




                //q5

        System.out.println(" pls entre age ");
        int age=input.nextInt();

         if(age<13){
            System.out.println("Child");
        } else if (age<=19&& age > 13) {
            System.out.println("Inclusive");
        }
          else if (age >= 20){
            System.out.println("Adult");
        }

    }

        }


