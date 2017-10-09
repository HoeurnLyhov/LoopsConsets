import java.util.Scanner;
public class DoWhile {
	
	public static void main(String[] args) 
	{
		do
		{
			
			System.out.println("Enter charator: ");
			//char ch=new Scanner(System.in).next().charAt(0);
			Scanner scanner=new Scanner(System.in);
			char ch=scanner.next().charAt(0);
			//System.out.println("Enter charator: ");
			if(ch>='A'&&ch<='Z')
			{
				int a='Z'-ch;
				System.out.println("After charactor is : "+a);
				char i=ch;
				for(i++;i<='Z';i++)
				{
					System.out.print(" "+i);
				}
		
				System.out.println("");
				int b=ch-'A';
				System.out.println("Before charactor is : "+b);
				char j=ch;
				for(j-- ;j>='A';j--)
				{
					System.out.print(" "+j);
				}
			}
			else
			{
				System.out.println("It is not letter!!!!!");
			}
		}while(true);
	}

}
