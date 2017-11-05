package com.cs.drawingexample.draw;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ColorCommandTest {
	

	@Before
	public void initArr()
	{
		nullArray();
	}
	/*@Test(expected = NullPointerException.class)
	public void testColorCmd1() {
		ColorCommand colorCmd = new ColorCommand(10, 3,'o');
		colorCmd.execute();
		char[][] testArr = {
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
						'-', '-' },
				{ '|', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o',
						'o', '|' },
				{ '|', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o',
						'o', '|' },
				{ '|', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o',
						'o', '|' },
				{ '|', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o',
						'o', '|' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
						'-', '-' } };
		Assert.assertArrayEquals(CanvasCommand.getCanvasArr(), testArr);
		
		
	}*/
	
	
	@Before
	public void initArr2()
	{
		nullArray();
	}
	@Test()
	public void testColorCmd2() {
		CanvasCommand canvasCommand = new CanvasCommand(20, 4);
		canvasCommand.execute();
		ColorCommand colorCmd = new ColorCommand(10, 3,'o');
		colorCmd.execute();
		char[][] testArr ={
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}, 
				{'|', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', '|'}, 
				{'|', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o','o'  ,'o'  ,'o'  , 'o', 'o', 'o', '|'}, 
				{'|', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', '|'}, 
				{'|', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', '|'}, 
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}
				};
		Assert.assertArrayEquals(CanvasCommand.getCanvasArr(), testArr);
	}
	
	
	@Before
	public void initArr3()
	{
		nullArray();
	}
	@Test()
	public void testColorCmd3() {
		CanvasCommand canvasCommand = new CanvasCommand(20, 4);
		canvasCommand.execute();
		ColorCommand colorCmd = new ColorCommand(10, 3,'o');
		colorCmd.execute();
		char[][] testArr ={
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}, 
				{'|', 'o', ' ', ' ', ' ', ' ', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', '|'}, 
				{'|', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o','o'  ,'o'  ,'o'  , 'o', 'o', 'o', '|'}, 
				{'|', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', '|'}, 
				{'|', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', '|'}, 
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
