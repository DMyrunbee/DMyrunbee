package sai;

public class ArrayList {

	public  static  Integer getsum(int... inte){
	    int sum = 0;
	    for(int i : inte) { 
	        sum += i;
	    }
	    return sum;
	}
	public static void main(String[] args) {
		
		
		ArrayList s2;
		System.out.println(ArrayList.getsum(1));
		System.out.println(ArrayList.getsum(1,3,5));
		System.out.println(ArrayList.getsum(2,4,6));
	
	}

}