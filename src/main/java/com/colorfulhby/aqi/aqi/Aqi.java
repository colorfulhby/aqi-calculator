package com.colorfulhby.aqi.aqi;



import com.colorfulhby.aqi.entity.AqiReques;
import com.colorfulhby.aqi.entity.AqiResponse;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @ClassName:Aqi
 * @Description:获取aqi计算结果
 * @author:hongby
 * @date:2019/7/6 16:43
 *
 *
 */
public class Aqi {

    public AqiResponse dailyAQI(AqiReques aqiReques) {

        AqiResponse aqiResponse = new AqiResponse();

        // 分指数
        HashMap<String, Integer> indexMap = new HashMap<String, Integer>();
        DailyCalc dailyCalc = new DailyCalc();
        int iAqi_so2 = dailyCalc.getIAqi("so2", aqiReques.getSo2());
        indexMap.put("so2", iAqi_so2);
        int iAqi_no2 = dailyCalc.getIAqi("no2", aqiReques.getNo2());
        indexMap.put("no2", iAqi_no2);
        int iAqi_pm10 = dailyCalc.getIAqi("pm10", aqiReques.getPm10());
        indexMap.put("pm10", iAqi_pm10);
        int iAqi_co = dailyCalc.getIAqi("co", aqiReques.getCo());
        indexMap.put("co", iAqi_co);
        int iAqi_o3 = dailyCalc.getIAqi("o3", aqiReques.getO3());
        indexMap.put("o3", iAqi_o3);
        int iAqi_pm25 = dailyCalc.getIAqi("pm25", aqiReques.getPm25());
        indexMap.put("pm25", iAqi_pm25);

        AqiCalc aqiCalc = new AqiCalc(indexMap);
        // 首要污染物
        ArrayList<String> primaryPollutant = aqiCalc.getPrimaryPollutant();
        aqiResponse.setPrimaryPollutant(primaryPollutant);

        // aqi
        int aqi = indexMap.get(primaryPollutant.get(0));
        aqiResponse.setAqi(aqi);

        // 空气质量指数级别
        String level = aqiCalc.getLevel(aqi);
        aqiResponse.setLevel(level);


        // 空气质量指数类别
        String cls = aqiCalc.getCls(aqi);
        aqiResponse.setCls(cls);

        // 空气质量指数类别表示颜色
        String color = aqiCalc.getColor(aqi);
        aqiResponse.setColor(color);

        // 全部AQI数据
        //System.out.println(aqiResponse.toString());

        return aqiResponse;

    }

    private AqiResponse hoursAQI(AqiReques aqiReques) {

        AqiResponse aqiResponse = new AqiResponse();

        // 分指数
        HashMap<String, Integer> indexMap = new HashMap<String, Integer>();
        RealTimeCalc realTimeCalc = new RealTimeCalc();
        int iAqi_so2 = realTimeCalc.getIAqi("so2", aqiReques.getSo2());
        indexMap.put("so2", iAqi_so2);
        int iAqi_no2 = realTimeCalc.getIAqi("no2", aqiReques.getNo2());
        indexMap.put("no2", iAqi_no2);
        int iAqi_pm10 = realTimeCalc.getIAqi("pm10", aqiReques.getPm10());
        indexMap.put("pm10", iAqi_pm10);
        int iAqi_co = realTimeCalc.getIAqi("co", aqiReques.getCo());
        indexMap.put("co", iAqi_co);
        int iAqi_o3 = realTimeCalc.getIAqi("o3", aqiReques.getO3());
        indexMap.put("o3", iAqi_o3);
        int iAqi_pm25 = realTimeCalc.getIAqi("pm25", aqiReques.getPm25());
        indexMap.put("pm25", iAqi_pm25);

        AqiCalc aqiCalc = new AqiCalc(indexMap);
        // 首要污染物
        ArrayList<String> primaryPollutant = aqiCalc.getPrimaryPollutant();
        aqiResponse.setPrimaryPollutant(primaryPollutant);

        // aqi
        int aqi = indexMap.get(primaryPollutant.get(0));
        aqiResponse.setAqi(aqi);

        // 空气质量指数级别
        String level = aqiCalc.getLevel(aqi);
        aqiResponse.setLevel(level);


        // 空气质量指数类别
        String cls = aqiCalc.getCls(aqi);
        aqiResponse.setCls(cls);

        // 空气质量指数类别表示颜色
        String color = aqiCalc.getColor(aqi);
        aqiResponse.setColor(color);

        // 全部AQI数据
        //System.out.println(aqiResponse.toString());

        return aqiResponse;
    }

}
