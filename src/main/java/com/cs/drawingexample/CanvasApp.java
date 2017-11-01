package com.cs.drawingexample;

import java.util.Scanner;

public class CanvasApp {
	static Canvas canvas;
	public static void main(String[] args) throws NumberFormatException, InterruptedException {		
		Scanner scan = new Scanner(System.in);
		String command = new String();
		while(!command.equals("Q")) {
			System.out.print("enter command:");
			command = scan.nextLine();
			draw(command);
		}
		System.out.println("Program Exited!");
		scan.close();
	}
	
	private static void draw(String command) throws NumberFormatException, InterruptedException {
		char ch = command.charAt(0);
		String[] cmd;
		try {
			switch(ch) {
				case 'C' :
					cmd = command.split(" ");
					canvas = new Canvas(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]));
					canvas.render();
				break;
				case 'L' :
					cmd = command.split(" ");
					if(canvas == null){
						System.err.println("Draw a canvas first");
						return;
					}
					canvas.drawLine(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]),Integer.parseInt(cmd[3]),Integer.parseInt(cmd[4]),'X');
					canvas.render();
				break;
				case 'R' :
					cmd = command.split(" ");
					if(canvas == null){
						System.err.println("Draw a canvas first");
						return;
					}
					canvas.drawRectangle(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]),Integer.parseInt(cmd[3]),Integer.parseInt(cmd[4]),'X');
					canvas.render();
				break;
				case 'B' :
					cmd = command.split(" ");
					if(canvas == null){
						System.err.println("Draw a canvas first");
						return;
					}
					canvas.bucketFill(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]),cmd[3].charAt(0));
					canvas.render();
				break;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid command. Try again!!\n");
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error Occured\n");
			e.printStackTrace();
			System.exit(1);
		}
	}
}
