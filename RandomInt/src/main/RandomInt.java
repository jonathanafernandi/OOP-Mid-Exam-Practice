package main;

public class RandomInt {

	public static void main(String[] args) {
		new RandomInt();

	}
	
	public RandomInt() {
		// 1 - 9
		System.out.println((int)((Math.random() * 9) + 1));
		
		// 10 - 29
		System.out.println((int)((Math.random() * 20) + 10));
		
		// 50 - (-10)
		System.out.println((int)((Math.random() * 61) + (-10)));
		
		// 0 - (-99)
		System.out.println((int)((Math.random() * 100) + (-99)));
	}

}