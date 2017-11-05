package com.cs.drawingexample.draw;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectangleCommandTest {
	

	@Before
	public void initArr()
	{
		nullArray();
	}
	/*@Test(expected = NullPointerException.class)
	public void testRectCmd1() {
		//try {
		RectangleCommand rectCmd = new RectangleCommand(14, 1,18,3,'X');
		rectCmd.execute();
		char[][] testArr = {
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
						'-', '-' },
				{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
						' ', '|' },
				{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
						' ', '|' },
				{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
						' ', '|' },
				{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
						' ', '|' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
						'-', '-' } };
		Assert.assertArrayEquals(CanvasCommand.getCanvasArr(), testArr);
		/*}catch(Exception e) {
			
		}
	}*/
	
	
	@Before
	public void initArr2()
	{
		nullArray();
	}
	@Test
	public void testRectCmd2() {
		CanvasCommand canvasCommand = new CanvasCommand(20, 4);
		canvasCommand.execute();
		RectangleCommand rectCmd = new RectangleCommand(14, 1,18,3,'X');
		rectCmd.execute();
		char[][] testArr = {
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}, 
				{'|',' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , 'X', 'X', 'X', 'X', 'X',' '  ,' '  , '|'}, 
				{'|', ' ', ' ', ' ', ' ', ' ', ' ',' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , 'X',' '  ,' '  ,' '  , 'X',' '  ,' '  , '|'}, 
				{'|',' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , 'X', 'X', 'X', 'X', 'X',' '  ,' '  , '|'},
				{'|',' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , '|'}, 
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}
				};
		Assert.assertArrayEquals(CanvasCommand.getCanvasArr(), testArr);
	}
	
	
	@Before
	public void initArr3()
	{
		nullArray();
	}
	@Test
	public void testRectCmd3() {
		CanvasCommand canvasCommand = new CanvasCommand(20, 4);
		canvasCommand.execute();
		RectangleCommand rectCmd = new RectangleCommand(14, 1,18,3,'X');
		rectCmd.execute();
		char[][] testArr = {
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}, 
				{'|',' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , 'X', 'X', 'X', 'X', 'X',' '  ,' '  , '|'}, 
				{'|', ' ', ' ', ' ', ' ', ' ', ' ',' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , 'X',' '  ,' '  ,' '  , 'X',' '  ,' '  , '|'}, 
				{'|',' '  ,' '  ,' '  ,'o'  ,'o'  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , 'X', 'X', 'X', 'X', 'X',' '  ,' '  , '|'},
				{'|',' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , '|'}, 
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}
				};
		Assert.assertNotEquals(CanvasCommand.getCanvasArr(), testArr);
	}
	
	void nullArray()
	{
		if(CanvasCommand.getCanvasArr()!=null)
		for(int i=0;i<CanvasCommand.getCanvasArr().length;i++){
			for(int j=0;j<CanvasCommand.getCanvasArr()[0].length;j++){
				CanvasCommand.getCanvasArr()[i][j]='\0';
			}
		}
	}
}
