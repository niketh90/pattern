package com.cs.drawingexample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cs.drawingexample.draw.CanvasCommand;


public class DrawExampleTest {
	@Before
	public void init()
	{
		nullArray();
		DrawExample.isError = false;
	}
	
	
	
	@Test
	public void drawTest1() throws Exception
	{
		DrawExample.draw("C 20 4");
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
	public void init6()
	{
		
		DrawExample.isError = false;
	}
	
	
	
	@Test
	public void drawTest6() throws Exception
	{
		DrawExample.draw("L 51 50 51 50");
		Assert.assertTrue(DrawExample.isError);
	}
	

	@Before
	public void init5()
	{
		nullArray();
		DrawExample.isError = false;
	}

	@Test
	public void drawTest5() throws Exception
	{
		DrawExample.draw("C a b");
		
		Assert.assertTrue(DrawExample.isError);
	}
	
	@Test
	public void drawTest2() throws Exception
	{
		DrawExample.draw("L 1 2 6 2");
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
	
	@Test
	public void drawTest3() throws Exception
	{   
		DrawExample.draw("R 14 1 18 3");
		char[][] testArr = {
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}, 
				{'|',' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , 'X', 'X', 'X', 'X', 'X',' '  ,' '  , '|'}, 
				{'|', 'X', 'X', 'X', 'X', 'X', 'X',' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , 'X',' '  ,' '  ,' '  , 'X',' '  ,' '  , '|'}, 
				{'|',' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , 'X', 'X', 'X', 'X', 'X',' '  ,' '  , '|'},
				{'|',' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  ,' '  , '|'}, 
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}
				};
		Assert.assertArrayEquals(CanvasCommand.getCanvasArr(), testArr);
	}
	
	
	@Test
	public void drawTest4() throws Exception{
		DrawExample.draw("B 10 3 o");
		char[][] testArr ={
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}, 
				{'|', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'X', 'X', 'X', 'X', 'X', 'o', 'o', '|'}, 
				{'|', 'X', 'X', 'X', 'X', 'X', 'X', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'X',' '  ,' '  ,' '  , 'X', 'o', 'o', '|'}, 
				{'|', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'X', 'X', 'X', 'X', 'X', 'o', 'o', '|'}, 
				{'|', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', '|'}, 
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}
				};
		Assert.assertArrayEquals(CanvasCommand.getCanvasArr(), testArr);
	}
	
	
	@Before
	public void init3() {
		nullArray();
		DrawExample.isError = false;
	}
	@Test
	public void testDraw() throws Exception {
		
		DrawExample.draw("R 10 2 3 4");
		
		Assert.assertTrue(DrawExample.isError);
		
	}
	
	@Before
	public void init1() {
		nullArray();
		DrawExample.isError = false;
	}
	@Test
	public void testDraw2() throws Exception {
		
		DrawExample.draw("L 10 2 3 4");
		
		Assert.assertTrue(DrawExample.isError);
		
	}
	
	
	@Before
	public void init4() {
		nullArray();
		DrawExample.isError = false;
	}
	@Test
	public void testDraw4() throws Exception {
		
		DrawExample.draw("B 10 2 o");
		
		Assert.assertTrue(DrawExample.isError);
		
	}
	@Before
	public void initialise() {
		new DrawExampleTest().nullArray();
		DrawExample.isError = false;
	}

	@Test
	public void drawLine() throws Exception{
		DrawExample.draw("L 1 2 6 2");
	}
	
	
	@Before
	public void initialise1() {
		new DrawExampleTest().nullArray();
		DrawExample.isError = false;
	}
	@Test
	public void drawCanvas() throws Exception{
		DrawExample.draw("C 20 4");
		Assert.assertFalse(DrawExample.isError);
	}
	
	
	
	@Before
	public void init9() {
		nullArray();
		DrawExample.isError = false;
	}

	@Test
	public void drawRect() throws Exception{
		DrawExample.draw("R 14 1 18 3");
		
		Assert.assertTrue(DrawExample.isError);
	}
	
	
	@Before
	public void init8() {
		nullArray();
		DrawExample.isError = false;
	}
	@Test
	public void drawCanv2() throws Exception{
		DrawExample.draw("C 20 4");
		Assert.assertFalse(DrawExample.isError);
	}
	
	
	@Before
	public void init7() {
		nullArray();
		DrawExample.isError = false;
	}

	@Test
	public void fillColor() throws Exception{
		DrawExample.draw("R 14 1 18 3");
		Assert.assertTrue(DrawExample.isError);
	}
	
	public void nullArray()
	{
		if(CanvasCommand.getCanvasArr()!=null)
		for(int i=0;i<CanvasCommand.getCanvasArr().length;i++){
			for(int j=0;j<CanvasCommand.getCanvasArr()[0].length;j++){
				CanvasCommand.getCanvasArr()[i][j]='\0';
			}
		}
	}

}
