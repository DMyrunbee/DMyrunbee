package Reference2;

import java.util.function.BiFunction;

public class InstanceMethodReference3 {

	
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer>adder=new Arithmetic()::add;
		int result=adder.apply(10, 20);
		System.out.println(result);

	}

}
