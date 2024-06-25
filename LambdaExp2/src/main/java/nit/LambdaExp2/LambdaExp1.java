package nit.LambdaExp2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;



public class LambdaExp1 {

	public static void main(String[] args) {
	
		List<Product>list=new ArrayList<Product>();
		//Adding Products
		list.add(new Product(1,"HP Laptop",2500f));
		list.add(new Product(3," Keyboard",3000));
		list.add(new Product(2,"Dell Mouse",2000));
		list.add(new Product(4,"HP Samsung",1000));
	
	
		//using lambda to filter data
		Stream <Product> filtered_data=list.stream().filter(p->p.price >20000);
		
		//using lambda to iterate through collection
		filtered_data.forEach(product->
		System.out.println(product.name+":"+product.price));
	}
	}


