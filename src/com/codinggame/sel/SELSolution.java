package com.codinggame.sel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SELSolution {

	private List<Integer> data;
	private Integer out = 0;
	private static final int MAX_ENTRIES = 100000;

	public SELSolution(List<Integer> loadData) {
		this.data = loadData;
	}

	public void process() {
		
		if (data != null && !data.isEmpty()) {
			if (data.size() < MAX_ENTRIES && maxDataValue() < Math.pow(2, 31)) {
				int t0 = 0;
				int tn = data.size();
				Integer maxGain = 0;
				Integer maxLoss = 0;
				int index = 0;
				for (Integer v : data) {
					if (index>=t0 && index<tn) {
						
					}
				}
			}
		}
	}

	private double maxDataValue() {
		List<Integer> dataCopy = new ArrayList<Integer>();
		for (Integer v : data) {
			dataCopy.add(v);
		}
		Collections.sort(dataCopy);
		return dataCopy.get(dataCopy.size());
	}

	public Integer out() {
		return out;
	}

}
