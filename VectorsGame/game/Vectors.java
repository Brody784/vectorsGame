package game;

import java.util.Scanner;

public class Vectors {
	private int turn;

	
	public void run() {
		
	}
	public Vectors() {
		
	}
	
	public void Turns() {
		int turn = 0;
		boolean prompt = true;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter how many turns you want to play between 20-64 recommended is 20");
		
		turn = scanner.nextInt();
		
			if(turn >= 20 && turn <= 64) {
				this.turn = turn;
			}else {
				turn = 20;
				this.turn = turn;
			}

		System.out.println(turn);
	}
}
