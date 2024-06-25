package p2;

//import java.io.PrintStream;
import java.util.Scanner;

import p1.*;

public class BankMainClass {
	public BankMainClass(String msg)throws Exception
	{
		super();
	}
	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		try(s){
			int c=0;
			myru:
				while(true)
			{
				try {
					System.out.println("Enter the piNo");
					int pinNo=s.nextInt();
					countDigits cd=new countDigits();
					int count=cd.getCount(pinNo);
					if(count!=4)
					{
						 new BankMainClass("incorrect pinno");
					}
					System.out.println("***Choose***");
					System.out.println("1.withDraw \n 2.Deposite");
					System.out.println("Enter the choice");
					switch(s.nextInt())
					{
					case 1:
					System.out.println("Enter the amt");
					int a1=s.nextInt();
					if(!(a1>0 && a1 %100==0)) 
					{
						 new BankMainClass("inavlid amt");
					}
					withDraw wd=new withDraw("");
					wd.process(a1);
					break myru;
					case 2:
						System.out.println("Enter the amt");
						int a2=s.nextInt();
						if(!(a2>0 && a2 %100==0)) 
						{
							 new BankMainClass("inavlid amt");
						}
						Deposit dp=new Deposit();
						dp.process(a2);
				    break myru;
				    default:
				    	 new BankMainClass("invalid choice");
					}
					}
				catch(  withDraw bmc) 
				{
					
					System.out.println(bmc.getMessage());
					System.out.println(bmc.toString());
					if(bmc.getMessage().equals("incorrect pinno"))
					{
						c++;
						if(c==3) 
						{
							System.out.println("sorry! Transaction blocked");
							break;
						}
						continue;
						
					}
				break;
					
			}
				
			}
		}
	}

}
