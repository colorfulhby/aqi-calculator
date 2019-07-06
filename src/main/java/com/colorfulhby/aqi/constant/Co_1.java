package com.colorfulhby.aqi.constant;

public enum Co_1 {

	c0(0), c1(5000), c2(10000), c3(35000), c4(60000), c5(90000), c6(120000), c7(150000);

	private final int index;

	Co_1(int index) {
		this.index = index;
	}

	public int getValue() {
		return index;
	}

	public String getCls(int value) {
		String cls = null;
		if (value == Co_1.c0.getValue()) {
			cls = Co_1.c0.name();
		} else if (value == Co_1.c1.getValue()) {
			cls = Co_1.c1.name();
		} else if (value == Co_1.c2.getValue()) {
			cls = Co_1.c2.name();
		} else if (value == Co_1.c3.getValue()) {
			cls = Co_1.c3.name();
		} else if (value == Co_1.c4.getValue()) {
			cls = Co_1.c4.name();
		} else if (value == Co_1.c5.getValue()) {
			cls = Co_1.c5.name();
		} else if (value == Co_1.c6.getValue()) {
			cls = Co_1.c6.name();
		} else if (value == Co_1.c7.getValue()) {
			cls = Co_1.c7.name();
		}
		return cls;
	}

	public int getBpH(float Cp) {
		int bpH = -1;
		if (Cp < Co_1.c1.getValue() || Cp == Co_1.c1.getValue()) {
			bpH = Co_1.c1.getValue();
		} else if (Cp < Co_1.c2.getValue() || Cp == Co_1.c2.getValue()) {
			bpH = Co_1.c2.getValue();
		} else if (Cp < Co_1.c3.getValue() || Cp == Co_1.c3.getValue()) {
			bpH = Co_1.c3.getValue();
		} else if (Cp < Co_1.c4.getValue() || Cp == Co_1.c4.getValue()) {
			bpH = Co_1.c4.getValue();
		} else if (Cp < Co_1.c5.getValue() || Cp == Co_1.c5.getValue()) {
			bpH = Co_1.c5.getValue();
		} else if (Cp < Co_1.c6.getValue() || Cp == Co_1.c6.getValue()) {
			bpH = Co_1.c6.getValue();
		} else if (Cp < Co_1.c7.getValue() || Cp == Co_1.c7.getValue()) {
			bpH = Co_1.c7.getValue();
		}
		return bpH;
	}

	public int getBpL(float Cp) {
		int bpH = -1;
		if (Cp < Co_1.c1.getValue() || Cp == Co_1.c1.getValue()) {
			bpH = Co_1.c0.getValue();
		} else if (Cp < Co_1.c2.getValue() || Cp == Co_1.c2.getValue()) {
			bpH = Co_1.c1.getValue();
		} else if (Cp < Co_1.c3.getValue() || Cp == Co_1.c3.getValue()) {
			bpH = Co_1.c2.getValue();
		} else if (Cp < Co_1.c4.getValue() || Cp == Co_1.c4.getValue()) {
			bpH = Co_1.c3.getValue();
		} else if (Cp < Co_1.c5.getValue() || Cp == Co_1.c5.getValue()) {
			bpH = Co_1.c4.getValue();
		} else if (Cp < Co_1.c6.getValue() || Cp == Co_1.c6.getValue()) {
			bpH = Co_1.c5.getValue();
		} else if (Cp < Co_1.c7.getValue() || Cp == Co_1.c7.getValue()) {
			bpH = Co_1.c6.getValue();
		}
		return bpH;
	}

	public int calcIAqiH(int bpH) {
		int iAqiH = IAQI.valueOf(Co_1.c0.getCls(bpH)).getValue();
		return iAqiH;
	}

}
