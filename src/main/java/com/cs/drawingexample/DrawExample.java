package com.cs.drawingexample;

import java.util.Scanner;

import com.cs.drawingexample.draw.CanvasCommand;
import com.cs.drawingexample.draw.ColorCommand;
import com.cs.drawingexample.draw.LineCommand;
import com.cs.drawingexample.draw.RectangleCommand;
import com.cs.drawingexample.draw.ShapeRenderer;
/**
 *  main method to run the commands
 * @author priyanka gaonkar
 *
 */
public class DrawExample {
    static CanvasCommand canvasCmd;
    static CommandInvoker invoker = new CommandInvoker();
    public static boolean isError = false;
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		String command = new String();
		while(!command.equals("Q")) {
			System.out.print("\nEnter Command:");
			command = scan.nextLine();
			
			draw(command);
		}
		System.out.println("Program Quit");
		scan.close();
		
	}
		public static  void draw(String command) throws Exception {
			char ch = command.charAt(0);
			String[] cmd;
			try {
				switch(ch) {
					case 'C' :
						cmd = command.split(" ");
						canvasCmd = new CanvasCommand(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]));
						invoker.addCommand(canvasCmd);
					break;
					case 'L' :
						cmd = command.split(" ");
						if(canvasCmd == null){
							System.err.println("Draw a canvas first");
							isError = true;
							return;
						}
						LineCommand lineCmd = new LineCommand(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]),Integer.parseInt(cmd[3]),Integer.parseInt(cmd[4]),'X');
						invoker.addCommand(lineCmd);
					break;
					case 'R' :
						cmd = command.split(" ");
						if(canvasCmd == null){
							System.err.println("Draw a canvas first");
							isError = true;
							return;
						}
						RectangleCommand recCmd = new RectangleCommand(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]),Integer.parseInt(cmd[3]),Integer.parseInt(cmd[4]),'X');
						invoker.addCommand(recCmd);
					break;
					
					case 'B' :
						cmd = command.split(" ");
						if(canvasCmd == null){
							System.err.println("Draw a canvas first");
							isError = true;
							return;
						}
						
						ColorCommand colorCmd = new ColorCommand(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]),cmd[3].charAt(0));
						invoker.addCommand(colorCmd);
					break;
					case 'Q':
						System.out.println("Quitting");
						break;
					default: isError = true;
					System.err.println("Invalid Command.Enter again\n\n");
					break;
					
				}
				invoker.executeCommands();
				ShapeRenderer renderer=new ShapeRenderer();
				renderer.render();
			} catch (ArrayIndexOutOfBoundsException e) {
				isError = true;
				System.err.println("Invalid Command.Enter again\n\n");
			} catch(NumberFormatException nfe) {
				isError = true;
				System.err.println("Invalid Command.Enter again\n\n");
			}
			
			catch (Exception e) {
				System.out.println("Error\n");
				e.printStackTrace();
				
			}
		}
		

}
