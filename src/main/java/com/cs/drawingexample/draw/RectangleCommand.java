package com.cs.drawingexample.draw;

import com.cs.drawingexample.Command;

public class RectangleCommand implements Command{
    
	 private int x1,y1,x2,y2;
	 char ch;
	public RectangleCommand(int xVar1, int yVar1, int xVar2, int yVar2, char c) {
		x1= xVar1;
		y1= yVar1;
		x2 = xVar2;
		y2 = yVar2;
		ch = c;
		
	}

	@Override
	/**
	 * execute method for rectangle command
	 */
	public void execute() {
		new ShapeRenderer().drawLine(x1,y1, x2, y1, ch);
		new ShapeRenderer().drawLine(x1,y1, x1, y2, ch);
		new ShapeRenderer().drawLine(x2,y1, x2, y2, ch);
		new ShapeRenderer().drawLine(x1,y2, x2, y2, ch);
	}

}
