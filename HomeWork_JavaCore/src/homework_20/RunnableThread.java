package homework_20;

import java.util.Scanner;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number of Fibonacci numbers :");
		int number =scan.nextInt();
		int[] numberFibonacci = new int[number];
		numberFibonacci[0]=1;
		numberFibonacci[1]=1;
		try {
			Thread.sleep(1000*(numberFibonacci.length+1));
		}catch(InterruptedException ex) {
			System.out.println("Error");
		}
		System.out.print("Thread the RunnableThread:");
		for(int i=2;i<numberFibonacci.length;i++) {
			numberFibonacci[i]=numberFibonacci[i-1]+numberFibonacci[i-2];
		}
		for(int i=0;i<numberFibonacci.length;i++) {
			System.out.print(" "+numberFibonacci[numberFibonacci.length-(i+1)]);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ex) {
				System.out.println("Error");
			}
		}
		scan.close();
		
	}

}
