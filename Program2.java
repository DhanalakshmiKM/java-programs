import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.print("enter the value of a");
		int a=Scan.nextInt();
		for(int i=1;i<a;i++)
		{
			if(i % 2 != 0)
				System.out.print(i);
		}
	}

}


