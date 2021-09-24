package ex03.generic;

public class MainEntry {

	public static void main(String[] args) {
		
		GenericEx<String> t1 = new GenericEx<String>();
		String[] str = {"abc", "kbs", "director" };
		
		t1.set(str);		t1.print();
		
		System.out.println("\n========================");
		
		GenericEx<Integer> t2 = new GenericEx<Integer>();
		
		Integer[] num = {1, 2, 3, 4, 5};
		t2.set(num);
		t2.print();			t2.print();
		
		System.out.println("\n========================");
		
		GenericEx<Double> t3 = new GenericEx<Double>();
		Double[] dou = {1.1, 2.2, 3.3, 4.4, 5.5};
		t3.set(dou);
		t3.print(); 		t3.print();
		
		
		
		
	}

}
