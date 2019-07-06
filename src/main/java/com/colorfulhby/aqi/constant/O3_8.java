package com.colorfulhby.aqi.constant;

public enum O3_8 {

	c0(0), c1(100), c2(160), c3(215), c4(265), c5(800), c6(1000), c7(1200);

	private final int index;

	O3_8(int index) {
		this.index = index;
	}

	public int getValue() {
		return index;
	}

	public String getCls(int value) {
		String cls = null;
		if (value == O3_8.c0.getValue()) {
			cls = O3_8.c0.name();
		} else if (value == O3_8.c1.getValue()) {
			cls = O3_8.c1.name();
		} else if (value == O3_8.c2.getValue()) {
			cls = O3_8.c2.name();
		} else if (value == O3_8.c3.getValue()) {
			cls = O3_8.c3.name();
		} else if (value == O3_8.c4.getValue()) {
			cls = O3_8.c4.name();
		} else if (value == O3_8.c5.getValue()) {
			cls = O3_8.c5.name();
		} else if (value == O3_8.c6.getValue()) {
			cls = O3_8.c6.name();
		} else if (value == O3_8.c7.getValue()) {
			cls = O3_8.c7.name();
		}
		return cls;
	}

	public int getBpH(float Cp) {
		int bpH = -1;
		if (Cp < O3_8.c1.getValue() || Cp == O3_8.c1.getValue()) {
			bpH = O3_8.c1.getValue();
		} else if (Cp < O3_8.c2.getValue() || Cp == O3_8.c2.getValue()) {
			bpH = O3_8.c2.getValue();
		} else if (Cp < O3_8.c3.getValue() || Cp == O3_8.c3.getValue()) {
			bpH = O3_8.c3.getValue();
		} else if (Cp < O3_8.c4.getValue() || Cp == O3_8.c4.getValue()) {
			bpH = O3_8.c4.getValue();
		} else if (Cp < O3_8.c5.getValue() || Cp == O3_8.c5.getValue()) {
			bpH = O3_8.c5.getValue();
		} else if (Cp < O3_8.c6.getValue() || Cp == O3_8.c6.getValue()) {
			bpH = O3_8.c6.getValue();
		} else if (Cp < O3_8.c7.getValue() || Cp == O3_8.c7.getValue()) {
			bpH = O3_8.c7.getValue();
		}
		return bpH;
	}

	public int getBpL(float Cp) {
		int bpH = -1;
		if (Cp < O3_8.c1.getValue() || Cp == O3_8.c1.getValue()) {
			bpH = O3_8.c0.getValue();
		} else if (Cp < O3_8.c2.getValue() || Cp == O3_8.c2.getValue()) {
			bpH = O3_8.c1.getValue();
		} else if (Cp < O3_8.c3.getValue() || Cp == O3_8.c3.getValue()) {
			bpH = O3_8.c2.getValue();
		} else if (Cp < O3_8.c4.getValue() || Cp == O3_8.c4.getValue()) {
			bpH = O3_8.c3.getValue();
		} else if (Cp < O3_8.c5.getValue() || Cp == O3_8.c5.getValue()) {
			bpH = O3_8.c4.getValue();
		} else if (Cp < O3_8.c6.getValue() || Cp == O3_8.c6.getValue()) {
			bpH = O3_8.c5.getValue();
		} else if (Cp < O3_8.c7.getValue() || Cp == O3_8.c7.getValue()) {
			bpH = O3_8.c6.getValue();
		}
		return bpH;
	}

	public int calcIAqiH(int bpH) {
		int iAqiH = IAQI.valueOf(O3_8.c0.getCls(bpH)).getValue();
		return iAqiH;
	}

}
