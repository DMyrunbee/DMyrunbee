package p1;

public class countDigits {
   public int count=0;
   public int getCount(int pinNo) {
	   while(pinNo>0) {
		   {
			   count++;
			   pinNo=pinNo/10;
		  
			   
		   }
	   }
	return count;
   }
}
