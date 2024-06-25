package com.nt.singleton;

public class s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		private static singleton instance;
		private Singleton();
		public static singleton getInstance();
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}

}
