package com.cs.drawingexample;

public class CanvasCommand  implements Command {
    // private Canvas canvas;
     /*public  CanvasCommand(Canvas c) {
    	 canvas=c;
	}*/
	static  int height;
	static  int width;
	static char[] [] canvasArr;
	public CanvasCommand(int w, int h) {
		h+=2;
		w+=2;
		height= h;
		width =w;
		canvasArr = new char[h][w];	
	}
	public CanvasCommand() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void execute() {
		/*for (int i = 0; i < height; i++) {
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
		
      */
		
		drawLine(0, 0, width-1, 0, '-');
		drawLine(0, height-1, width-1, height-1, '-');
		drawLine(0, 1, 0, height-2, '|');
		for(int i=1;i<width-1;i++)
			drawLine(i, 1, i,height-2, ' ');
		drawLine(width-1,1,width-1,height-2,'|');
		render();
	}
	
	public void drawLine(int x1, int y1, int x2, int y2, char mchar) {
		for(int i=y1; i<=y2; i++) {
			for(int j=x1; j<=x2; j++) {
				canvasArr[i][j] = mchar;				
			}
		}
	}
		
		public void render() {		
			for(int i=0;i<height;i++) {
				for(int j=0;j<width;j++) {				 
					System.out.print(canvasArr[i][j]);
				}
				System.out.println();
			}
		}
  	 

}
