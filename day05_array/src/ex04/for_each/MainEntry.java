package ex04.for_each;

public class MainEntry {

	public static void main(String[] args) {
		// for(초기값; 조건; 증감식) { 반복실행문; }
		// for(자료형 변수명 : 배열명 또는 컬렉션명) { 반복실행문; }
//		int count = 0;
		
		int[] a = {1, 2, 5, 6, 7, 90, 100};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n================================");
		
		
		for (int item : a) {
			
//			count++;
//			if (count == 5) break;
			System.out.print(item + " ");
//			System.out.println("count = " + count);
		}
		
		System.out.println("\n================================");
		for (int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		
		
		
		
		
		
	}

}
