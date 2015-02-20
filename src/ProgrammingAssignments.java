import java.io.*;

/**
 * Created by sailaksh on 18/02/15.
 */
public class ProgrammingAssignments {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("print*");
        PrintStar();
        System.out.println("print hor s \n enter the value of n");
        int n=Integer.parseInt(read.readLine());
        PrintHorStars(n);
        System.out.println("print ver s \n enter the value of n");
        int n1=Integer.parseInt(read.readLine());
        PrintVerStars(n1);
        System.out.println("print rightangle \n enter the value of n");
        int n2=Integer.parseInt(read.readLine());
        PrintRightAngle(n2);
        System.out.println("Isosceles Traingle \n enter value of n");
        int n3=Integer.parseInt(read.readLine());
        PrintIsosceles(n3);
        System.out.println("Diamond \n enter n value");
        int n4=Integer.parseInt(read.readLine());
        PrintDiamond(n4);
        System.out.println("Diamondwithname \n enter n value");
        int n5=Integer.parseInt(read.readLine());
        PrintDiaWithName(n5);
        System.out.println("Fizzbuzz");
        FizzBuzzGame();
        System.out.println("PrimeFactors \n enter the N value");
        int n6=Integer.parseInt(read.readLine());
        PrimeFactor(n6);


    }

    private static void PrimeFactor(int number) {
        int ar[]=new int[10];
        for(int i=2;i<=number;i++)
        {
            if(number%i==0) {
            System.out.println(i);
            }
            else
                continue;
        }

    }

    private static void FizzBuzzGame() {
        for(int i=1;i<=100;i++)
        {

            if(i%3==0&&i%5==0)
            {
                System.out.println("fizzbuzz");
            }
            else if(i%5==0)
            {
                System.out.println("buzz");
            }
            else if(i%3==0)
            {
                System.out.println("fizz");
            }
            else
                System.out.println(i);

        }
    }

    private static void PrintDiaWithName(int numberoflevels) {
        for(int i=1;i<=numberoflevels;i++) {
            for (int k =(numberoflevels)-i-1; k >= 0; k--)
            {
                System.out.print(" ");
            }
            if(i==numberoflevels)
                System.out.print("SAISREE");
            else {
                for (int j = 1; j <= 2 * i - 1; j++) {

                    System.out.print("*");
                }

            }
                System.out.println();
        }
        for(int i=numberoflevels-1;i>=0;i--)
        {
            for(int k=0;k<=(numberoflevels)-i-1;k++)
            {
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--)

            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void PrintDiamond(int numberoflevels) {
        for(int i=1;i<=numberoflevels;i++) {
            for (int k =(numberoflevels)-i-1; k >= 0; k--)
        {
            System.out.print(" ");
        }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=numberoflevels-1;i>=0;i--)
        {
            for(int k=0;k<=(numberoflevels)-i-1;k++)
            {
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--)

            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void PrintIsosceles(int numberoflevels) {
        for (int i =1; i <= numberoflevels; i++) {
            for (int k = (numberoflevels)-i-1; k >= 0; k--)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


    private static void PrintRightAngle(int numberoflevels) {
        for(int i=1;i<= numberoflevels;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void PrintVerStars(int numberofstars) {
        for(int i=1;i<=numberofstars;i++)
        {
            System.out.println("*");
        }
    }

    private static void PrintHorStars(int numberofstarsv) {
        for(int i=1;i<=numberofstarsv;i++){
            System.out.print("* ");

        }
        System.out.println();
    }

    private static void PrintStar() {
        System.out.println("*");
    }


}
