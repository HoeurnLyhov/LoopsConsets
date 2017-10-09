import java.util.Scanner;
public class BiggerNumber 
{
	public static void main(String[] args) 
	{
		int a,b,c,d,e;
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Enter the number of A: ");
		a=inp.nextInt();
		
		System.out.println("Enter the number of B: ");
		b=inp.nextInt();
		
		System.out.println("Enter the number of C: ");
		c=inp.nextInt();
		
		System.out.println("Enter the number of D: ");
		d=inp.nextInt();
		
		/*e=(a>b)?((a>c)?((a>d)?a:d):((c>d)?c:d)):((b>c)?((b>d)?b:d):((c>d)?c:d));*/
		
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					e=a;
				}
				else
				{
					e=d;
				}
			}
			else
			{
				if(c>d)
				{
					e=c;
				}
				else
				{
					e=d;
				}
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					e=b;
				}
				else
				{
					e=d;
				}
			}
			else
			{
				if(c>d)
				{
					e=c;
				}
				else
				{
					e=d;
				}
			}
		}
		
		System.out.println("bigger number is: "+e);
	}

}
