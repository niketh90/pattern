package com.cs.drawingexample.draw;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CanvasCommandTest {
	

	@Before
	public void initArr()
	{
		nullArray();
	}
	@Test
	public void testCanvasCmd1() {
		CanvasCommand canvasCommand = new CanvasCommand(20, 4);
		canvasCommand.execute();
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
	}
	
	
	@Before
	public void initArr2()
	{
		nullArray();
	}
	@Test
	public void testCanvasCmd2() {
		CanvasCommand canvasCommand = new CanvasCommand('a', 'b');
		canvasCommand.execute();
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
		Assert.assertNotSame(CanvasCommand.getCanvasArr(), testArr);
	}
	
	
	@Before
	public void initArr3()
	{
		nullArray();
	}
	@Test
	public void testCanvasCmd3() {
		CanvasCommand canvasCommand = new CanvasCommand(1, 2);
		canvasCommand.execute();
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
		Assert.assertNotSame(CanvasCommand.getCanvasArr(), testArr);
	}
	
	
	@Before
	public void initArr4()
	{
		nullArray();
	}
	@Test
	public void testCanvasCmd4() {
		CanvasCommand canvasCommand = new CanvasCommand(1, 2);
		canvasCommand.execute();
		char[][] testArr = {
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
						'-', '-' },
				{ '|', ' ', 'o', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
						' ', '|' },
				{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
						' ', '|' },
				{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
						' ', '|' },
				{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
						' ', '|' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
						'-', '-' } };
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
