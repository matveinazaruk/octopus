package com.octopus.social;

import java.util.ArrayList;
import java.util.Date;

import com.octopus.data.ChartData;

public class FakeSocialService implements ISocialService {

	@SuppressWarnings("deprecation")
	@Override
	public ArrayList<ChartData> getData() {
		ArrayList<ChartData> dataList = new ArrayList<ChartData>();
		dataList.add(new ChartData(new Date(2001, 7, 19), 5.6));
		dataList.add(new ChartData(new Date(2001, 8, 5), 3.5));
		dataList.add(new ChartData(new Date(2001, 9, 8), 4.2));
		dataList.add(new ChartData(new Date(2001, 10, 24), 2.3));
		dataList.add(new ChartData(new Date(2001, 12, 17), 4.5));
		dataList.add(new ChartData(new Date(2001, 12, 19), 5.2));
		return dataList;
	}
}
