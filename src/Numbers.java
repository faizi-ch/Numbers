import java.util.Scanner;
public class Numbers {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter number:");
		int num;
		num=input.nextInt();
		int n=num,a=0;
		while (n!=0) {
			a=a*10;
			a=a+n%10;
			n=n/10;
		}
		if (a==num) {
			System.out.println("palindrome num");
		}
		else {
			System.out.println("not palindrome");
		}
		System.out.println("enter number:");
		int num2;
		num2=input.nextInt();
		int j=0;
		for (int i=2;i<=num2/2;i++)
		{
			if (num2%i==0)
			{
				System.out.println("it is not a prime num");
				j=1;
				break;
			}
		}
		if (j==0)
			System.out.println("it is prime num");
		System.out.println("enter number:");
		int nu;
		nu=input.nextInt();
		int nn=nu,arm=0,r;
		while (nu!=0) {
			r=nu%10;
			nu=nu/10;
			arm=arm+(r*r*r);
		}
		if (arm==nn)
		{
			System.out.println("armstrong number");
		}
		else
			System.out.println("not an armstrong number");
	}
}

