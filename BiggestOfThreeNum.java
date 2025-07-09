import java.util.Scanner;
public class BiggestOfThreeNum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter secoend number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();  

        if(a>b && a>c)
        {
            System.out.println("Biggest of three numbers is: "+a);
        }
        else if(b>c && b>a)
        {
            System.out.println("Biggest of three numbers is: "+b);
        }
        else if(c>a && c>b)
        {
            system.out.println("Biggest of three numbers is: "+c);
        }
        else 
            System.out.println("All are same");
    }    
}
