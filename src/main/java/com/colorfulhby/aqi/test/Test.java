package com.colorfulhby.aqi.test;



import com.colorfulhby.aqi.aqi.AqiCalc;
import com.colorfulhby.aqi.aqi.DailyCalc;
import com.colorfulhby.aqi.aqi.RealTimeCalc;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {

	private static void testDaily() {
		System.out.println("==========DailyCalc==========");

		// 分指数
		HashMap<String, Integer> indexMap = new HashMap<String, Integer>();
		DailyCalc dailyCalc = new DailyCalc();
		int iAqi_so2 = dailyCalc.getIAqi("so2", 5);
		indexMap.put("so2", iAqi_so2);
		int iAqi_no2 = dailyCalc.getIAqi("no2", 168);
		indexMap.put("no2", iAqi_no2);
		int iAqi_pm10 = dailyCalc.getIAqi("pm10", 111);
		indexMap.put("pm10", iAqi_pm10);
		int iAqi_co = dailyCalc.getIAqi("co", 0);
		indexMap.put("co", iAqi_co);
		int iAqi_o3 = dailyCalc.getIAqi("o3", 0);
		indexMap.put("o3", iAqi_o3);
		int iAqi_pm25 = dailyCalc.getIAqi("pm25", 0);
		indexMap.put("pm25", iAqi_pm25);
		System.out.println(indexMap);

		AqiCalc aqiCalc = new AqiCalc(indexMap);
		// 首要污染物
		ArrayList<String> primaryPollutant = aqiCalc.getPrimaryPollutant();
		System.out.println(primaryPollutant);
		// aqi
		int aqi = indexMap.get(primaryPollutant.get(0));
		System.out.println(aqi);
		// 空气质量指数级别
		String level = aqiCalc.getLevel(aqi);
		System.out.println(level);
		// 空气质量指数类别
		String cls = aqiCalc.getCls(aqi);
		System.out.println(cls);
		// 空气质量指数类别表示颜色
		String color = aqiCalc.getColor(aqi);
		System.out.println(color);
		// 全部AQI数据
		System.out.println(aqiCalc.getAllData());
	}

	private static void testRealTime() {
		System.out.println("==========RealTimeCalc==========");

		// 分指数
		HashMap<String, Integer> indexMap = new HashMap<String, Integer>();
		RealTimeCalc realTimeCalc = new RealTimeCalc();
		int iAqi_so2 = realTimeCalc.getIAqi("so2", 150);
		indexMap.put("so2", iAqi_so2);
		int iAqi_no2 = realTimeCalc.getIAqi("no2", 200);
		indexMap.put("no2", iAqi_no2);
		int iAqi_pm10 = realTimeCalc.getIAqi("pm10", 250);
		indexMap.put("pm10", iAqi_pm10);
		int iAqi_co = realTimeCalc.getIAqi("co", 60000);
		indexMap.put("co", iAqi_co);
		int iAqi_o3 = realTimeCalc.getIAqi("o3", 800);
		indexMap.put("o3", iAqi_o3);
		int iAqi_pm25 = realTimeCalc.getIAqi("pm25", 350);
		indexMap.put("pm25", iAqi_pm25);
		System.out.println(indexMap);

		AqiCalc aqiCalc = new AqiCalc(indexMap);
		// 首要污染物
		ArrayList<String> primaryPollutant = aqiCalc.getPrimaryPollutant();
		System.out.println(primaryPollutant);
		// aqi
		int aqi = indexMap.get(primaryPollutant.get(0));
		System.out.println(aqi);
		// 空气质量指数级别
		String level = aqiCalc.getLevel(aqi);
		System.out.println(level);
		// 空气质量指数类别
		String cls = aqiCalc.getCls(aqi);
		System.out.println(cls);
		// 空气质量指数类别表示颜色
		String color = aqiCalc.getColor(aqi);
		System.out.println(color);
		// 全部AQI数据
		System.out.println(aqiCalc.getAllData());
	}

	public static void main(String[] args) {
		testDaily();
		testRealTime();
	}

}
