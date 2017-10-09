import java.util.Scanner;
public class CovertNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,n=0;
		System.out.println("Enter The number: ");
		num=new Scanner(System.in).nextInt();
		
		int i=0,j=0;
		System.out.println("Reves: ");
		while(num>0)
		{
		i=num%10;
		num=num/10;
		n=i;
		System.out.print(""+i);
		//n=n*10+i;
		j+=i;
		}
		//System.out.println("reves number: "+n);
		System.out.println("\nThe sum of digit: "+j);
	}

}
