package MultipleArrays;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {33,2,5,12};
		System.out.println("Prinitng original array:");
		for(int i:arr)
			System.out.println(i);
		
		System.out.println("Priniting clone of the array:");
		int carr[]=arr.clone();
		for(int i:carr)
			System.out.println(i);
		
		System.out.println("Both are equal");
		System.out.println(arr==carr);
		
	}

}
