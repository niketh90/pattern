package com.cs.drawingexample;

public class ColorCommand implements Command{
    private int x,y;
    private char ch;
	public ColorCommand(int x, int y, char ch) {
		this.x = x;
		this.y= y;
		this.ch = ch;
	}

	@Override
	public void execute() {
		fillColor(x,y,ch);
		new ShapeRenderer().render();
	}

	private void fillColor(int x, int y, char ch) {
		if((int)CanvasCommand.canvasArr[y][x] !=32) {
			return;
		}
		
		if(x > 0 || x < CanvasCommand.height || y > 0 || y  < CanvasCommand.width) {
			if((int)CanvasCommand.canvasArr[y][x] == 32)
				CanvasCommand.canvasArr[y][x] = ch;
			fillColor(x+1,y, ch);
			fillColor(x-1,y, ch);
			fillColor(x,y-1, ch);
			fillColor(x,y+1, ch);
		
	}
	}

}
