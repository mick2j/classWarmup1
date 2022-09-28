package classWarmUp1;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		List<Integer> a1 =  new ArrayList<>();
		
		a1.add(7);
		a1.add(8);
		a1.add(6);
		a1.add(12);
		a1.add(23);
		System.out.println(a1);
		
		a1.remove(2);
		a1.remove(0);
		a1.remove(1);
		
		System.out.println(a1);
		
	
		
	}

}
