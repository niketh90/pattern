package com.cs.drawingexample.draw;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LineCommandTest {
	

	@Before
	public void initArr()
	{
		nullArray();
	}
	/*@Test(expected = NullPointerException.class)
	public void testlineCmd1() {
		
		LineCommand lineCommand = new LineCommand(1,2,6,2,'X');
		lineCommand.execute();
		char[][] testArr = {
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}, 
                {'|',' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , '|'}, 
                {'|', 'X', 'X', 'X', 'X', 'X', 'X',' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , '|'}, 
                {'|',' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , '|'}, 
                {'|',' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , '|'}, 
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}
               };
		
		Assert.assertArrayEquals(CanvasCommand.getCanvasArr(), testArr);
	
		}*/
	
	
	@Before
	public void initArr1()
	{
		nullArray();
	}
	@Test
	public void testLineCmd2() {
		CanvasCommand canvasCommand = new CanvasCommand(20, 4);
		canvasCommand.execute();
		LineCommand lineCommand = new LineCommand(1,2,6,2,'X');
		lineCommand.execute();
		char[][] testArr = {
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}, 
                {'|',' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , '|'}, 
                {'|', 'X', 'X', 'X', 'X', 'X', 'X',' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , '|'}, 
                {'|',' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , '|'}, 
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
	public void testLineCmd3() {
		CanvasCommand canvasCommand = new CanvasCommand(20, 4);
		canvasCommand.execute();
		LineCommand lineCommand = new LineCommand(1,2,6,2,'X');
		lineCommand.execute();
		char[][] testArr = {
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}, 
                {'|',' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , '|'}, 
                {'|', 'X', 'o', 'X', 'X', 'X', 'X',' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , '|'}, 
                {'|',' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , '|'}, 
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
