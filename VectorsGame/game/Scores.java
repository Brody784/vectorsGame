package game;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Scores {
	
	public void highScore() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter name for highscore!");
		String name = scanner.next();
		
		try {
			FileWriter writer = new FileWriter("Highscores");
		
			writer.write(name);
			
			writer.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
