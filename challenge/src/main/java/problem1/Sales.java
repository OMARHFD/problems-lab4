package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        //Q6.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of SalesPeople ");
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;
        int maxsale=0;
        int maxid =-1;
        int minsale=Integer.MAX_VALUE;
        int minid =-1;
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
            if(sales[i]>maxsale){
                maxsale=sales[i];
                maxid=i;
            }


            if(sales[i]<minsale){
                minsale=sales[i];
                minid=i;
            }
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + i + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
        //Q1. just computong the average and boxing in case we want more precision
        System.out.println("\nAverage sale: " + (double) sum/5);
        //Q2. used the loop to get at each iteration the biggest sale (greedy algorithm)
        System.out.println("\nSalesperson " + maxid+" had the highest sale with $"+maxsale);
        //Q3. used the loop again
        System.out.println("\nSalesperson " + minid+" had the lowest sale with $"+minsale);
        //Q4.
        System.out.print("Enter a value :  ");
        int value=scan.nextInt();
        System.out.println("The SalesPeople that exceded $"+ value);
        int no=0;
        for (int i =0;i<sales.length;i++)
        {
            if (sales[i]>=value)
            {
                System.out.println("SalesPerson "+i+"with sales "+sales[i]);
                no+=1;
            }
        }
        System.out.println("Their Number is "+no);
        //Q5.
        int[] newsales=new int [sales.length+1];
        for(int i=0;i<5;i++) newsales[i+1]=sales[i];

    }
}