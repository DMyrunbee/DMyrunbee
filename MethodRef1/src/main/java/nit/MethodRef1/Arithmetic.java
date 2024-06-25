package nit.MethodRef1;

import java.util.function.BiFunction;

public class Arithmetic {

	public static int add(int a,int b) {
		return a+b;
	}
	public static float add(int a,float b) {
		return a+b;
	}
	public static float add(float a,float b) {
		return a+b;
	}
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> adder=Arithmetic::add;
		BiFunction<Integer,Float,Float> adder1=Arithmetic::add;
		BiFunction<Float,Float,Float> adder2=Arithmetic::add;
        int result=adder.apply(20, 30);
        float result1=adder1.apply(12, 13.0f);
        float result2=adder2.apply(26.0f, 24.0f);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

	}

}
