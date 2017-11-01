package com.cs.drawingexample;

import java.util.HashMap;
import java.util.Map;

public class Switch {
Map<String,Command> drawCmds = new HashMap<String,Command>();

public void setCommand(String operation,Command cmd) {
	  drawCmds.put(operation, cmd);
}

public void runCmd(String operation) {
	drawCmds.get(operation).execute();
}
}
