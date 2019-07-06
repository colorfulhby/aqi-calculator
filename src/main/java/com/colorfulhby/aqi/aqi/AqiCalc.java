package com.colorfulhby.aqi.aqi;


import com.colorfulhby.aqi.constant.IAQI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * aqi计算
 */
public class AqiCalc {

	private final HashMap<String, Integer> indexMap;

	/**
	 * @param indexMap in the form of: composition=IAQI
	 */
	public AqiCalc(HashMap<String, Integer> indexMap) {
		this.indexMap = indexMap;
	}

	private Map<String, Object> allData = new HashMap<String, Object>();
	private ArrayList<String> primaryPollutant = new ArrayList<String>();

	/**
	 * 获取全部AQI数据(未补入分浓度与时间)
	 * <ul>
	 * <li>分指数(iaqi)
	 * <li>首要污染物(primaryPollutant)
	 * <li>aqi
	 * <li>空气质量指数级别(level)
	 * <li>空气质量指数类别(cls)
	 * <li>空气质量指数类别表示颜色(color)
	 * </ul>
	 */
	public Map<String, Object> getAllData() {
		// 分指数
		allData.put("iaqi", indexMap);
		// 首要污染物
		allData.put("primaryPollutant", getPrimaryPollutant());
		// aqi
		int aqi = indexMap.get(primaryPollutant.get(0));
		allData.put("aqi", aqi);
		// 空气质量指数级别
		allData.put("level", getLevel(aqi));
		// 空气质量指数类别
		allData.put("cls", getCls(aqi));
		// 空气质量指数类别表示颜色
		allData.put("color", getColor(aqi));

		return allData;
	}

	/**
	 * 首要污染物
	 * 
	 * @return list 可空 可并列
	 */
	public ArrayList<String> getPrimaryPollutant() {
		// 浓度值转存数组
		Iterator<Entry<String, Integer>> CpIt = indexMap.entrySet().iterator();
		int[] Cp = new int[indexMap.size()];
		for (int i = 0; CpIt.hasNext(); i++) {
			Entry<String, Integer> CpEntry = CpIt.next();
			Cp[i] = CpEntry.getValue();
		}

		int max = Cp[0];
		CpIt = indexMap.entrySet().iterator();
		while (CpIt.hasNext()) {
			Entry<String, Integer> CpEntry = CpIt.next();
			int value = CpEntry.getValue();
			for (int i = 0; i < Cp.length; i++) {
				if (value < max) {
					break;
				} else {
					if (Cp[i] < max) {
						continue;
					} else {
						max = Cp[i];
						if (value < Cp[i]) {
							primaryPollutant.clear();
							break;
						} else {
							if (!primaryPollutant.contains(CpEntry.getKey())) {
								primaryPollutant.add(CpEntry.getKey());
							}
						}
					}
				}
			}
		}

		return primaryPollutant;
	}

	/**
	 * 空气质量指数级别
	 * 
	 * @param aqi
	 * @return 一至六级 or NA
	 */
	public String getLevel(int aqi) {
		if ((aqi > IAQI.c0.getValue() || aqi == IAQI.c0.getValue()) && (aqi < IAQI.c1.getValue() || aqi == IAQI.c1.getValue())) {
			return "一级";
		} else if (aqi > IAQI.c1.getValue() && (aqi < IAQI.c2.getValue() || aqi == IAQI.c2.getValue())) {
			return "二级";
		} else if (aqi > IAQI.c2.getValue() && (aqi < IAQI.c3.getValue() || aqi == IAQI.c3.getValue())) {
			return "三级";
		} else if (aqi > IAQI.c3.getValue() && (aqi < IAQI.c4.getValue() || aqi == IAQI.c4.getValue())) {
			return "四级";
		} else if (aqi > IAQI.c4.getValue() && (aqi < IAQI.c5.getValue() || aqi == IAQI.c5.getValue())) {
			return "五级";
		} else if (aqi > IAQI.c5.getValue()) {
			return "六级";
		} else {
			return "NA";
		}
	}

	/**
	 * 空气质量指数类别
	 * 
	 * @param aqi
	 * @return 优 良 轻度污染 中度污染 重度污染 严重污染 NA
	 */
	public String getCls(int aqi) {
		if ((aqi > IAQI.c0.getValue() || aqi == IAQI.c0.getValue()) && (aqi < IAQI.c1.getValue() || aqi == IAQI.c1.getValue())) {
			return "优";
		} else if (aqi > IAQI.c1.getValue() && (aqi < IAQI.c2.getValue() || aqi == IAQI.c2.getValue())) {
			return "良";
		} else if (aqi > IAQI.c2.getValue() && (aqi < IAQI.c3.getValue() || aqi == IAQI.c3.getValue())) {
			return "轻度污染";
		} else if (aqi > IAQI.c3.getValue() && (aqi < IAQI.c4.getValue() || aqi == IAQI.c4.getValue())) {
			return "中度污染";
		} else if (aqi > IAQI.c4.getValue() && (aqi < IAQI.c5.getValue() || aqi == IAQI.c5.getValue())) {
			return "重度污染";
		} else if (aqi > IAQI.c5.getValue()) {
			return "严重污染";
		} else {
			return "NA";
		}
	}

	/**
	 * 空气质量指数类别表示颜色
	 * 
	 * @param aqi
	 * @return 16色 or NA
	 */
	public String getColor(int aqi) {
		if ((aqi > IAQI.c0.getValue() || aqi == IAQI.c0.getValue()) && (aqi < IAQI.c1.getValue() || aqi == IAQI.c1.getValue())) {
			return "#00E400";
		} else if (aqi > IAQI.c1.getValue() && (aqi < IAQI.c2.getValue() || aqi == IAQI.c2.getValue())) {
			return "#FFFF00";
		} else if (aqi > IAQI.c2.getValue() && (aqi < IAQI.c3.getValue() || aqi == IAQI.c3.getValue())) {
			return "#FF7E00";
		} else if (aqi > IAQI.c3.getValue() && (aqi < IAQI.c4.getValue() || aqi == IAQI.c4.getValue())) {
			return "#FF0000";
		} else if (aqi > IAQI.c4.getValue() && (aqi < IAQI.c5.getValue() || aqi == IAQI.c5.getValue())) {
			return "#99004C";
		} else if (aqi > IAQI.c5.getValue()) {
			return "#7E0023";
		} else {
			return "NA";
		}
	}

}
