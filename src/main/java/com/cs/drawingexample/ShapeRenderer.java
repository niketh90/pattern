package com.cs.drawingexample;

public class ShapeRenderer {
	public void drawLine(int x1, int y1, int x2, int y2, char mchar) {
		for(int i=y1; i<=y2; i++) {
			for(int j=x1; j<=x2; j++) {
				CanvasCommand.canvasArr[i][j] = mchar;				
			}
		}
	}
		
		public void render() {		
			for(int i=0;i<CanvasCommand.height;i++) {
				for(int j=0;j<CanvasCommand.width;j++) {				 
					System.out.print(CanvasCommand.canvasArr[i][j]);
				}
				System.out.println();
			}
		}
}
