package com.cs.drawingexample.draw;

public class ShapeRenderer {
	/**
	 * draws the line with specified parameters with the specified character
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param ch
	 */
	public void drawLine(int x1, int y1, int x2, int y2, char ch) {
		for(int i=y1; i<=y2; i++) {
			for(int j=x1; j<=x2; j++) {
				CanvasCommand.getCanvasArr()[i][j] = ch;				
			}
		}
	}
		
	/**
	 * renders the array on the console
	 */
		public void render() {		
			for(int i=0;i<CanvasCommand.height;i++) {
				for(int j=0;j<CanvasCommand.width;j++) {				 
					System.out.print(CanvasCommand.getCanvasArr()[i][j]);
				}
				System.out.println();
			}
		}
}
