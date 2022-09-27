import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.print("enter the length of list");
	int a[]=new int[Scan.nextInt()];
	for(int i=1;i<=a.length-1;i++)
	{
		System.out.println("enter the elements of list");
		a[i]=Scan.nextInt();
	}
	for(int i=1;i<=a.length-1;i++)
	{
		for(int j=1;j<=a.length-1;j++)
		{
			if(a[i]==a[j])
			a[i]=a[i]*a[j];
			{
				System.out.print("output is"+" "+i+" "+":"+" "+a[i]+" ");
				
				
			}
		}

	}
	}

}
