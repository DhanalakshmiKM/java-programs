import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
	System.out.println("enter the value of num1");
	double num1=Scan.nextDouble();
	System.out.println("enter the value of num1");
	double num2=Scan.nextDouble();
	System.out.println("enter the type of operation +,-,*,/");
String s=Scan.next();
double res;
if(s.equals("+"))
{
	res=num1+num2;
	System.out.println("addition is---->"+num1+"+"+num2+"="+res);
}
else if(s.equals("-"))
{
	res=num1-num2;
	System.out.println("addition is---->"+num1+"-"+num2+"="+res);
}
else if(s.equals("*"))
{
	res=num1*num2;
	System.out.println("addition is---->"+num1+"*"+num2+"="+res);
}
else if(s.equals("/"))
{
	res=num1/num2;
	System.out.println("addition is---->"+num1+"/"+num2+"="+res);
}
else
{
	System.out.println("invalid type");
}

	}

}
