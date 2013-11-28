package com.octopus.data;

import java.util.ArrayList;

public class JSONDataConverter {
	
	public String[][] convert(ArrayList<ChartData> dataList) {
		String[][] jsonData = new String[dataList.size()][2];
		for (int i = 0; i < dataList.size(); ++i) {
			jsonData[i][0] = dataList.get(i).getDateStr();
			jsonData[i][1] = dataList.get(i).getValueStr();
		}
		return jsonData;
	}
}
