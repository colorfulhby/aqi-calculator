package com.colorfulhby.aqi.constant;

public enum O3_1 {

	c0(0), c1(160), c2(200), c3(300), c4(400), c5(800), c6(1000), c7(1200);

	private final int index;

	O3_1(int index) {
		this.index = index;
	}

	public int getValue() {
		return index;
	}

	public String getCls(int value) {
		String cls = null;
		if (value == O3_1.c0.getValue()) {
			cls = O3_1.c0.name();
		} else if (value == O3_1.c1.getValue()) {
			cls = O3_1.c1.name();
		} else if (value == O3_1.c2.getValue()) {
			cls = O3_1.c2.name();
		} else if (value == O3_1.c3.getValue()) {
			cls = O3_1.c3.name();
		} else if (value == O3_1.c4.getValue()) {
			cls = O3_1.c4.name();
		} else if (value == O3_1.c5.getValue()) {
			cls = O3_1.c5.name();
		} else if (value == O3_1.c6.getValue()) {
			cls = O3_1.c6.name();
		} else if (value == O3_1.c7.getValue()) {
			cls = O3_1.c7.name();
		}
		return cls;
	}

	public int getBpH(float Cp) {
		int bpH = -1;
		if (Cp < O3_1.c1.getValue() || Cp == O3_1.c1.getValue()) {
			bpH = O3_1.c1.getValue();
		} else if (Cp < O3_1.c2.getValue() || Cp == O3_1.c2.getValue()) {
			bpH = O3_1.c2.getValue();
		} else if (Cp < O3_1.c3.getValue() || Cp == O3_1.c3.getValue()) {
			bpH = O3_1.c3.getValue();
		} else if (Cp < O3_1.c4.getValue() || Cp == O3_1.c4.getValue()) {
			bpH = O3_1.c4.getValue();
		} else if (Cp < O3_1.c5.getValue() || Cp == O3_1.c5.getValue()) {
			bpH = O3_1.c5.getValue();
		} else if (Cp < O3_1.c6.getValue() || Cp == O3_1.c6.getValue()) {
			bpH = O3_1.c6.getValue();
		} else if (Cp < O3_1.c7.getValue() || Cp == O3_1.c7.getValue()) {
			bpH = O3_1.c7.getValue();
		}
		return bpH;
	}

	public int getBpL(float Cp) {
		int bpH = -1;
		if (Cp < O3_1.c1.getValue() || Cp == O3_1.c1.getValue()) {
			bpH = O3_1.c0.getValue();
		} else if (Cp < O3_1.c2.getValue() || Cp == O3_1.c2.getValue()) {
			bpH = O3_1.c1.getValue();
		} else if (Cp < O3_1.c3.getValue() || Cp == O3_1.c3.getValue()) {
			bpH = O3_1.c2.getValue();
		} else if (Cp < O3_1.c4.getValue() || Cp == O3_1.c4.getValue()) {
			bpH = O3_1.c3.getValue();
		} else if (Cp < O3_1.c5.getValue() || Cp == O3_1.c5.getValue()) {
			bpH = O3_1.c4.getValue();
		} else if (Cp < O3_1.c6.getValue() || Cp == O3_1.c6.getValue()) {
			bpH = O3_1.c5.getValue();
		} else if (Cp < O3_1.c7.getValue() || Cp == O3_1.c7.getValue()) {
			bpH = O3_1.c6.getValue();
		}
		return bpH;
	}

	public int calcIAqiH(int bpH) {
		int iAqiH = IAQI.valueOf(O3_1.c0.getCls(bpH)).getValue();
		return iAqiH;
	}

}
