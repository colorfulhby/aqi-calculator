package com.colorfulhby.aqi.constant;

public enum IAQI {

	c0(0), c1(50), c2(100), c3(150), c4(200), c5(300), c6(400), c7(500);

	private final int index;

	IAQI(int index) {
		this.index = index;
	}

	public int getValue() {
		return index;
	}

}
