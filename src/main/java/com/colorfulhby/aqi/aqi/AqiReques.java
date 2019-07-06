package com.colorfulhby.aqi.aqi;


import java.io.Serializable;

/**
 * @ClassName:AqiReques
 * @Description:
 * @author:hongby
 * @date:2019/7/6 16:48
 *
 *
 */
public class AqiReques implements Serializable {

    private static final long serialVersionUID = -7728527299619514787L;

    private float so2;

    private float no2;

    private float co;

    private float o3;

    private float pm10;

    private float pm25;

    public void setSo2(float so2) {
        this.so2 = so2;
    }

    public void setNo2(float no2) {
        this.no2 = no2;
    }

    public void setCo(float co) {
        this.co = co;
    }

    public void setPm10(float pm10) {
        this.pm10 = pm10;
    }

    public void setPm25(float pm25) {
        this.pm25 = pm25;
    }

    public float getO3() {
        return o3;
    }

    public void setO3(float o3) {
        this.o3 = o3;
    }

    public float getSo2() {
        return so2;
    }

    public float getNo2() {
        return no2;
    }

    public float getCo() {
        return co;
    }

    public float getPm10() {
        return pm10;
    }

    public float getPm25() {
        return pm25;
    }

    public AqiReques(float so2, float no2, float co, float pm10, float pm25) {
        this.so2 = so2;
        this.no2 = no2;
        this.co = co;
        this.pm10 = pm10;
        this.pm25 = pm25;
    }
}
