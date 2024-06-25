package p1;

public class Deposit implements Transaction{
	public void process(int amt)
	{
		   System.out.println("amt withDraw");
		   b.bal=b.bal-amt;
		   System.out.println("Balance Amt:"+b.getBalance());
		   System.out.println("Transaction completed");		
	}

}
