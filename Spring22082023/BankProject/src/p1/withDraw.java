package p1;

@SuppressWarnings({ "serial", "serial" })
public class withDraw extends Exception implements Transaction{
      public withDraw(String msg)
      {
    	  super(msg);
      }
      public void process(int amt)throws withDraw
      {
    	  try {
    	  if(amt>b.bal) 
    		  {
    			  throw new withDraw("insufficient fund");
    		  }
    		  
    		   System.out.println("amt withDraw");
    		   b.bal=b.bal-amt;
    		   System.out.println("Balance Amt:"+b.getBalance());
    		   System.out.println("Transaction completed");
    	  }	
    	  
    	  
    	  
      
    	  
    	  catch(withDraw wd) {
			throw(wd);
			}
    	  }
      }


