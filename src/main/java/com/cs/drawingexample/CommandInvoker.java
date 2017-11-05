package com.cs.drawingexample;

import java.util.ArrayList;
import java.util.List;
/**
 * adds the commands to the list and executes the commands
 * @author priyanka naik gaonkar
 *
 */
public class CommandInvoker {
	List<Command> commandList = new ArrayList<Command>();
	public void addCommand(Command c){
		commandList.add(c);
    }
  
    public void executeCommands(){
        for(Command c : commandList){
            c.execute();
        }
    }
}
