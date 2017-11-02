package com.cs.drawingexample;

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
	public void execute() {
		new CanvasCommand().drawLine(x1,y1, x2, y1, ch);
		new CanvasCommand().drawLine(x1,y1, x1, y2, ch);
		new CanvasCommand().drawLine(x2,y1, x2, y2, ch);
		new CanvasCommand().drawLine(x1,y2, x2, y2, ch);
		new CanvasCommand().render();
		
	}

}
