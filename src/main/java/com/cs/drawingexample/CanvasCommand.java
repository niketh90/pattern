package com.cs.drawingexample;

public class CanvasCommand implements Command{
    // private Canvas canvas;
     /*public  CanvasCommand(Canvas c) {
    	 canvas=c;
	}*/
	private int height;
	private int width;
	char[] [] canvasArr;
	public CanvasCommand(int h, int w) {
		height= h;
		width =w;
		canvasArr = new char[h][w];	
	}
	@Override
	public void execute() {
		for (int i = 0; i < height; i++) {
	        System.out.print('|');
	        for (int k = 1; k < width - 1; k++) {
	            System.out.print(" ");
	            if (i == 0 || i == (height - 1)) {
	                System.out.print('-');

	            } else {
	                System.out.print(" ");

	            }
	        }
	        System.out.print(" ");
	        System.out.print('|');
	        System.out.print("\n");
	    }
		

	}

}
