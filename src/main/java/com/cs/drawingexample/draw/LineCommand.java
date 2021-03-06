package com.cs.drawingexample.draw;

import com.cs.drawingexample.Command;

public class LineCommand implements Command{
    private int x1,y1,x2,y2;
    private char ch;
	public LineCommand(int xVar1, int yVar1, int xVar2, int yVar2, char c) {
		x1= xVar1;
		y1= yVar1;
		x2 = xVar2;
		y2 = yVar2;
		ch = c;
		
	}

	@Override
	/**
	 * execute method for line command
	 */
	public void execute() {
		new ShapeRenderer().drawLine(x1, y1, x2, y2, ch);
	}

}
