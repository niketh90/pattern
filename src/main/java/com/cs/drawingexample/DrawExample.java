package com.cs.drawingexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DrawExample {
    static CanvasCommand canvasCmd;
    static List<Command> cmdStack = new ArrayList<Command>();
	public static void main(String[] args) throws NumberFormatException, InterruptedException {
		/*List<Command> cmdStack = new ArrayList<Command>();
		String input = "";
		
		 while(input != "Q") {
			 System.out.print("Enter command ");
			Scanner scanner = new Scanner(System.in);//.useDelimiter("\\s");;
			input= scanner.nextLine();
		    String name = input;
		    //int val1 =scanner.nextInt();
		    //int val2 = scanner.nextInt();
		    //int val3 = scanner.nextInt();
		    CanvasCommand canvasCmd = null;
		    LineCommand lineCmd = null;
		    if(name.equalsIgnoreCase("C")) {
			    canvasCmd =new CanvasCommand(40,50);
			    cmdStack.add(canvasCmd);
		    }
		    		 if(name.equalsIgnoreCase("L")) {
		    				    lineCmd =new LineCommand();
		    					cmdStack.add(lineCmd);
		    			    }
		    
	       System.out.println(cmdStack.size());
	       
	       for(Command command: cmdStack) {
	    	        if(input.equals("Q")) {
			        System.exit(0);
			     }
				command.execute();
	       }
	    }
    }

	*/
		Scanner scan = new Scanner(System.in);
		String command = new String();
		while(!command.equals("Q")) {
			System.out.print("enter command:");
			command = scan.nextLine();
			
			draw(command,cmdStack);
		}
		System.out.println("Program Exited!");
		scan.close();
		
	}
		private static void draw(String command, List<Command> cmdStack) throws NumberFormatException, InterruptedException {
			char ch = command.charAt(0);
			String[] cmd;
			try {
				switch(ch) {
					case 'C' :
						cmd = command.split(" ");
						canvasCmd = new CanvasCommand(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]));
						//canvasCmd.execute();;
						cmdStack.add(canvasCmd);
					break;
					case 'L' :
						cmd = command.split(" ");
						if(canvasCmd == null){
							System.err.println("Draw a canvas first");
							return;
						}
						LineCommand lineCmd = new LineCommand(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]),Integer.parseInt(cmd[3]),Integer.parseInt(cmd[4]),'X');
						cmdStack.add(lineCmd);
					break;
					
				}
				
				for(Command commnd: cmdStack) {
	    	        
				commnd.execute();
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