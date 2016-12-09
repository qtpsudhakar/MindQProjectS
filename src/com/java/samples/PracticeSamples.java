package com.java.samples;

public class PracticeSamples {

	public static void main(String[] args) {

		PracticeSamples ps = new PracticeSamples();
		// ps.printText("hello...");

		// ps.isOdd(11);

		// ps.printOddeNumberInRange(10, 20);
		// ps.printFactorialOfANumber(4);
		// ps.printFactorsOfANumber(20);
		//ps.findPrime(97);
/*		
		int x=50;
		int y=20;
		
		x=x+y; //70
		y=x-y; //50
		x=x-y; //20
		
		x=x-y; //30
		y=x+y; //50
		x=y-x; //20
		*/
		

		Double db = 2.14121212121;
		double id = db-db.intValue();
		System.out.println(id);
		
		String str = db.toString();
		String arr[] = str.split("\\.");
		System.out.println(arr[1]);
/*		int[]i=new int[2];
		
		Integer i1 = 10;
		System.out.println(i1.getClass().getTypeName());
		System.out.println(i.getClass().getTypeName());
		
		Date d = new Date();
		System.out.println(d.toString());
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
*/	}

	// 1. Print Hello World

	public void printText(String str) {
		System.out.println(str);
	}

	// 2. Find whether given number is an odd number
	public boolean isOdd(int n) {
		if (n % 2 != 0) {
			System.out.println(n + " is an OddNumber");
			return true;
		} else {
			return false;
		}
	}

	// 3. Print odd numbers between given range of numbers
	public void printOddeNumberInRange(int rStart, int rEnd) {
		for (int n = rStart; n <= rEnd; n++) {
			if (n % 2 != 0) {
				System.out.println(n);
			}
		}
	}

	// 4. Find the factorial of a given number
	public void printFactorialOfANumber(int n) {
		int f = 1;
		for (int i = n; i >= 1; i--) {
			f = f * i;
		}
		System.out.println("the factorial of " + n + " is " + f);
	}

	// 5. Find the factors of a given number
	public void printFactorsOfANumber(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
	}

	// 6. find the number is a prime number or not
	public void findPrime(int n) {
		boolean isPrime = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}
}
