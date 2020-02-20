package homework_20;

import java.util.Scanner;

public class MyThread extends Thread {

	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number of Fibonacci numbers :");
		int number =scan.nextInt();
		int[] numberFibonacci = new int[number];
		numberFibonacci[0]=1;
		numberFibonacci[1]=1;
		System.out.print("Thread the MyThread:");
		for(int i=0;i<numberFibonacci.length;i++) {
			if(i>1) {
				numberFibonacci[i]=numberFibonacci[i-1]+numberFibonacci[i-2];
			}
			System.out.print(" "+numberFibonacci[i]);
			try {
				Thread.sleep(1001);
			}catch(InterruptedException ex) {
				System.out.println("Error");
			}
		}
		System.out.println();
		scan.close();
	}

}
