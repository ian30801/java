package testDemo;

public class Gogoro extends Motor implements Vehicle {

	public void show() {
		super.brand = "Gogoro";
		super.model = "Gogoro VIVA MIX BASIC";
		super.launchVolume = 0;
//		super.launch = "PUSH START";
		super.chargeType = "充電";
		super.wheelNum = "2輪";
		super.velocity = "0~100km";
		super.show();
	}

	@Override
	public void launch(String s) {
		System.out.println("發動方式:" + s);
	}

	@Override
	public void move(int m) {
		System.out.println("當前里程數:" + m + "km");
		kilometer += m;
		System.out.println("總里程數=" + kilometer + "km");
		energy = (115.38 - (kilometer / 1.3)) / 115.38 * 100; // 剩餘電量%數
		// 1.3km/AH $2.3/AH 充飽可跑150KM 150/1.3=115.38AH
		if (kilometer > 134.995) {
			System.out.println("電動車能源剩餘量" + (Math.round(energy * 100) / 100.0) + "% " + "該換電池了");
		} else {
			System.out.println("電動車能源充足");

		}
	}

}
