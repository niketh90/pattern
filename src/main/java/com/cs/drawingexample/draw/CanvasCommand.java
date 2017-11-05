package com.cs.drawingexample.draw;

import com.cs.drawingexample.Command;

public class CanvasCommand  implements Command {
	static  int height;
	static  int width;
	private static char[] [] canvasArr;
	public CanvasCommand(int w, int h) {
		h+=2;
		w+=2;
		height= h;
		width =w;
		setCanvasArr(new char[h][w]);	
	}
	public CanvasCommand() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * execute method for Canvas command .
	 */
	@Override
	public void execute() {
		ShapeRenderer shapeRender = new ShapeRenderer();
		shapeRender.drawLine(0, 0, width-1, 0, '-');
		shapeRender.drawLine(0, height-1, width-1, height-1, '-');
		shapeRender.drawLine(0, 1, 0, height-2, '|');
		for(int i=1;i<width-1;i++)
			shapeRender.drawLine(i, 1, i,height-2, ' ');
		shapeRender.drawLine(width-1,1,width-1,height-2,'|');
	}
	public static char[] [] getCanvasArr() {
		return canvasArr;
	}
	public static void setCanvasArr(char[] [] canvasArr) {
		CanvasCommand.canvasArr = canvasArr;
	}
}
