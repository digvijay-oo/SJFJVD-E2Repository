package assignment;
import java.util.Scanner;
public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		int num1=num;
		int number=num;
		int count = 0;
		int sum=0;
		
		while(num!=0) {
			count++;
			num=num/10;	
		}
		while(num1!=0) {
			int rem=num1%10;
			int power=1;
			for(int i=1;i<=count;i++) {
				power=power*rem;
			}
			sum=sum+power;
			num1=num1/10;
			
		}
		if(sum==number) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not a ArmStrong");
		}
				
	}
}
