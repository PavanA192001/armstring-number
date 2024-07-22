import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int base=s.nextInt(); // base number
        int pow=s.nextInt(); // power number
        int rem=0,sum=0,count=1,p1=base;
        while(base!=0) // traversing all the digits
        {                                                                  
            rem=base%10;
            int temp=rem;
            while(count<pow) // finding the power of each digits
            {
                 rem=rem*temp;
                 count++;
            }
            count=1;
           sum=sum+rem;
            base/=10;
        }   
        System.out.println(sum); // priinting the sum of each digits raising to its power
        System.out.println(p1==sum?"Armstrong number": "Not Armstrong number");

    }
    
}
