import java.util.Scanner;
public class QUESTION2
{
    public static void main(String[] args) 
    {
        int[] a = new int[10];
        System.out.print("Enter 10 numbers:");
        Scanner sc= new Scanner(System.in);
        int i, c1=0, c2=0;
        for (i=0; i<10; i++)
        {
            a[i]= sc.nextInt();
        }
        for (i=0; i<10; i++)
        {
            if(a[i]%2 == 0)
                c1++;
            else
                c2++;
        }
        System.out.print("No. of even numbers:" + c1 + "\nNo. of odd numbers:" + c2);
    }
}