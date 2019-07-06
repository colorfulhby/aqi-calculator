package com.colorfulhby.aqi.constant;

public enum No2_24 {

	c0(0), c1(40), c2(80), c3(180), c4(280), c5(565), c6(750), c7(940);

	private final int index;

	No2_24(int index) {
		this.index = index;
	}

	public int getValue() {
		return index;
	}

	public String getCls(int value) {
		String cls = null;
		if (value == No2_24.c0.getValue()) {
			cls = No2_24.c0.name();
		} else if (value == No2_24.c1.getValue()) {
			cls = No2_24.c1.name();
		} else if (value == No2_24.c2.getValue()) {
			cls = No2_24.c2.name();
		} else if (value == No2_24.c3.getValue()) {
			cls = No2_24.c3.name();
		} else if (value == No2_24.c4.getValue()) {
			cls = No2_24.c4.name();
		} else if (value == No2_24.c5.getValue()) {
			cls = No2_24.c5.name();
		} else if (value == No2_24.c6.getValue()) {
			cls = No2_24.c6.name();
		} else if (value == No2_24.c7.getValue()) {
			cls = No2_24.c7.name();
		}
		return cls;
	}

	public int getBpH(float Cp) {
		int bpH = -1;
		if (Cp < No2_24.c1.getValue() || Cp == No2_24.c1.getValue()) {
			bpH = No2_24.c1.getValue();
		} else if (Cp < No2_24.c2.getValue() || Cp == No2_24.c2.getValue()) {
			bpH = No2_24.c2.getValue();
		} else if (Cp < No2_24.c3.getValue() || Cp == No2_24.c3.getValue()) {
			bpH = No2_24.c3.getValue();
		} else if (Cp < No2_24.c4.getValue() || Cp == No2_24.c4.getValue()) {
			bpH = No2_24.c4.getValue();
		} else if (Cp < No2_24.c5.getValue() || Cp == No2_24.c5.getValue()) {
			bpH = No2_24.c5.getValue();
		} else if (Cp < No2_24.c6.getValue() || Cp == No2_24.c6.getValue()) {
			bpH = No2_24.c6.getValue();
		} else if (Cp < No2_24.c7.getValue() || Cp == No2_24.c7.getValue()) {
			bpH = No2_24.c7.getValue();
		}
		return bpH;
	}

	public int getBpL(float Cp) {
		int bpH = -1;
		if (Cp < No2_24.c1.getValue() || Cp == No2_24.c1.getValue()) {
			bpH = No2_24.c0.getValue();
		} else if (Cp < No2_24.c2.getValue() || Cp == No2_24.c2.getValue()) {
			bpH = No2_24.c1.getValue();
		} else if (Cp < No2_24.c3.getValue() || Cp == No2_24.c3.getValue()) {
			bpH = No2_24.c2.getValue();
		} else if (Cp < No2_24.c4.getValue() || Cp == No2_24.c4.getValue()) {
			bpH = No2_24.c3.getValue();
		} else if (Cp < No2_24.c5.getValue() || Cp == No2_24.c5.getValue()) {
			bpH = No2_24.c4.getValue();
		} else if (Cp < No2_24.c6.getValue() || Cp == No2_24.c6.getValue()) {
			bpH = No2_24.c5.getValue();
		} else if (Cp < No2_24.c7.getValue() || Cp == No2_24.c7.getValue()) {
			bpH = No2_24.c6.getValue();
		}
		return bpH;
	}

	public int calcIAqiH(int bpH) {
		int iAqiH = IAQI.valueOf(No2_24.c0.getCls(bpH)).getValue();
		return iAqiH;
	}

}
