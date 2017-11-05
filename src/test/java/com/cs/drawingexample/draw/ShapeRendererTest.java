package com.cs.drawingexample.draw;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeRendererTest {
    
	@Before
	public void initArr3()
	{
		nullArray();
	}
	@Test
	public void testDrawLine() {
		CanvasCommand.setCanvasArr(new char[3][3]);
		new ShapeRenderer().drawLine(1, 1, 1, 2, '-');
		char testArr[][]= {
				{'\0','\0' , '\0'}, 
				{'\0', '-', '\0'}, 
				{'\0', '-', '\0'}};
		Assert.assertArrayEquals(CanvasCommand.getCanvasArr(), testArr);
				
	}
	
	
	@Before
	public void initArr1()
	{
		nullArray();
	}
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testDrawLine2() {
		CanvasCommand.setCanvasArr(new char[3][3]);
		
		new ShapeRenderer().drawLine(1, 1, 1, 4, '-');
		char testArr[][]= {
				{'\0','\0' , '\0'}, 
				{'\0', '-', '\0'}, 
				{'\0', '-', '\0'}};
		Assert.assertArrayEquals(CanvasCommand.getCanvasArr(), testArr);
				
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
