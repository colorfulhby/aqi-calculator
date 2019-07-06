package com.colorfulhby.aqi.constant;

public enum Pm10 {

	c0(0), c1(50), c2(150), c3(250), c4(350), c5(420), c6(500), c7(600);

	private final int index;

	Pm10(int index) {
		this.index = index;
	}

	public int getValue() {
		return index;
	}

	public String getCls(int value) {
		String cls = null;
		if (value == Pm10.c0.getValue()) {
			cls = Pm10.c0.name();
		} else if (value == Pm10.c1.getValue()) {
			cls = Pm10.c1.name();
		} else if (value == Pm10.c2.getValue()) {
			cls = Pm10.c2.name();
		} else if (value == Pm10.c3.getValue()) {
			cls = Pm10.c3.name();
		} else if (value == Pm10.c4.getValue()) {
			cls = Pm10.c4.name();
		} else if (value == Pm10.c5.getValue()) {
			cls = Pm10.c5.name();
		} else if (value == Pm10.c6.getValue()) {
			cls = Pm10.c6.name();
		} else if (value == Pm10.c7.getValue()) {
			cls = Pm10.c7.name();
		}
		return cls;
	}

	public int getBpH(float Cp) {
		int bpH = -1;
		if (Cp < Pm10.c1.getValue() || Cp == Pm10.c1.getValue()) {
			bpH = Pm10.c1.getValue();
		} else if (Cp < Pm10.c2.getValue() || Cp == Pm10.c2.getValue()) {
			bpH = Pm10.c2.getValue();
		} else if (Cp < Pm10.c3.getValue() || Cp == Pm10.c3.getValue()) {
			bpH = Pm10.c3.getValue();
		} else if (Cp < Pm10.c4.getValue() || Cp == Pm10.c4.getValue()) {
			bpH = Pm10.c4.getValue();
		} else if (Cp < Pm10.c5.getValue() || Cp == Pm10.c5.getValue()) {
			bpH = Pm10.c5.getValue();
		} else if (Cp < Pm10.c6.getValue() || Cp == Pm10.c6.getValue()) {
			bpH = Pm10.c6.getValue();
		} else if (Cp < Pm10.c7.getValue() || Cp == Pm10.c7.getValue()) {
			bpH = Pm10.c7.getValue();
		}
		return bpH;
	}

	public int getBpL(float Cp) {
		int bpH = -1;
		if (Cp < Pm10.c1.getValue() || Cp == Pm10.c1.getValue()) {
			bpH = Pm10.c0.getValue();
		} else if (Cp < Pm10.c2.getValue() || Cp == Pm10.c2.getValue()) {
			bpH = Pm10.c1.getValue();
		} else if (Cp < Pm10.c3.getValue() || Cp == Pm10.c3.getValue()) {
			bpH = Pm10.c2.getValue();
		} else if (Cp < Pm10.c4.getValue() || Cp == Pm10.c4.getValue()) {
			bpH = Pm10.c3.getValue();
		} else if (Cp < Pm10.c5.getValue() || Cp == Pm10.c5.getValue()) {
			bpH = Pm10.c4.getValue();
		} else if (Cp < Pm10.c6.getValue() || Cp == Pm10.c6.getValue()) {
			bpH = Pm10.c5.getValue();
		} else if (Cp < Pm10.c7.getValue() || Cp == Pm10.c7.getValue()) {
			bpH = Pm10.c6.getValue();
		}
		return bpH;
	}

	public int calcIAqiH(int bpH) {
		int iAqiH = IAQI.valueOf(Pm10.c0.getCls(bpH)).getValue();
		return iAqiH;
	}

}
