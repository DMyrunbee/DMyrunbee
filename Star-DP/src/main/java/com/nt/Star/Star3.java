package com.nt.Star;

public class Star3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows=5;
		for(int i=0;i<rows;i++) {
			for(int j=rows-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
