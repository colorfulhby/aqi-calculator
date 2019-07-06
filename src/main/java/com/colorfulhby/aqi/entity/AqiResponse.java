package com.colorfulhby.aqi.entity;
/**
 * @Description:
 * @author:hongby
 * @version:V1.0
 * @Date:2019/7/6 16:48
 */

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName:AqiResponse
 * @Description:
 * @author:hongby
 * @date:2019/7/6 16:48
 *
 *
 */
public class AqiResponse implements Serializable {

    private static final long serialVersionUID = 5879137132448591823L;

    private List<String> primaryPollutant;

    private Integer aqi;

    private String level;

    //空气污染指数级别
    private String cls;

    //污染程度表示颜色
    private String color;

    public Integer getAqi() {
        return aqi;
    }

    public String getLevel() {
        return level;
    }

    public String getCls() {
        return cls;
    }

    public String getColor() {
        return color;
    }

    public List<String> getPrimaryPollutant() {
        return primaryPollutant;
    }

    public void setPrimaryPollutant(List<String> primaryPollutant) {
        this.primaryPollutant = primaryPollutant;
    }

    public void setAqi(Integer aqi) {
        this.aqi = aqi;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "AqiResponse{" +
                "primaryPollutant=" + primaryPollutant +
                ", aqi=" + aqi +
                ", level='" + level + '\'' +
                ", cls='" + cls + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
