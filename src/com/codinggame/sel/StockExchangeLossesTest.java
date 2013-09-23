package com.codinggame.sel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class StockExchangeLossesTest {

	@Test
	public void test1() {
		SELSolution solution = new SELSolution(loadData("in1.txt"));
		solution.process();
		Assert.assertEquals(solution.out(), Integer.decode("-3"));
	}

	@Test
	public void test2() {
		SELSolution solution = new SELSolution(loadData("in2.txt"));
		solution.process();
		Assert.assertEquals(solution.out(), Integer.decode("-4"));
	}

	@Test
	public void test3() {
		SELSolution solution = new SELSolution(loadData("in3.txt"));
		solution.process();
		Assert.assertEquals(solution.out(), Integer.decode("0"));
	}

	@Test
	public void test4() {
		SELSolution solution = new SELSolution(loadData("in4.txt"));
		solution.process();
		Assert.assertEquals(solution.out(), Integer.decode("0"));
	}

	@Test
	public void test5() {
		SELSolution solution = new SELSolution(loadData("in5.txt"));
		solution.process();
		Assert.assertEquals(solution.out(), Integer.decode("-1073730311"));
	}

	private List<Integer> loadData(String s) {
		String dataSeparator = " ";
		try {
			InputStream inputStream = getClass().getResourceAsStream(s);
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			String stringLine;
			while ((stringLine = bufferedReader.readLine()) != null) {
				if (Integer.decode(stringLine) > 0) {
					// read next line
					stringLine = bufferedReader.readLine();
					String[] split = stringLine.split(dataSeparator);
					List<Integer> result = new ArrayList<Integer>();
					for (int i = 0; i < split.length; i++) {
						result.add(Integer.decode(split[i]));
					}
					return result;
				} else
					return new ArrayList<Integer>();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
