import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number1 :");
        int num1=sc.nextInt();
        System.out.println("enter a number2:");
        int num2=sc.nextInt();
        
        int count;
        System.out.println("prime number between "+num1 + " and "+ num2 + "are: ");
        for(int i=num1;i<=num2;i++){
            count=0;
            for (int j = 1; j <= num2; j++) {
                if (i%j==0) {
                    count++;
                }
            }

            if (count==2) {
                System.out.println("This number is Prime :"+i);
            }
        }
        sc.close();
    }
}
