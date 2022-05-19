package testDemo;

public class Telsa extends Car implements Vehicle {
	double i = 0;
	double energy = 100;
	double m = 0;

	public void show() {
		super.brand = "特斯拉";
		super.model = "telsa model 3";
		super.launchVolume = 0;
		super.launch = "PUSH START";
		super.chargeType = "充電";
		super.wheelNum = "4輪";
		super.velocity = "0~233km";
		super.fullEnergy = 100;
		super.show();
	}

	@Override
	public void launch(String s) {
		System.out.println("發動方式:" + s);
	}

	@Override
	public void addEnergy(String a) {
		// System.out.println((Math.round(energy * 100.0) / 100.0));
		// 一度電跑七公里,充飽75度電,總共525公里,一小時7.5度電
		// kilometer += m;
		energy = 100 - (kilometer / 525 * 100);
		double c = kilometer / 7;
		if (m > 472.5) {
			System.out.println("電動車能源剩餘量" + (Math.round(energy * 100) / 100.0) + "% ");
			// 耗電量(度)
			
			System.out.println((Math.round(c * 100) / 100.0) + "度");
			while (c >= 7.5) {
				if (c >= 7.5) { // 電量小於100%
					energy += 10; // 每小時充10%
					i++;
					c -= 7.5;
				}
			}
			if (c <= 7.5) {
				i += c / 7.5;
			}
			System.out.println("電量已經充滿,總共充了" + (Math.round(i * 100) / 100.0) + "小時");
		} else if (kilometer > 472.5) {
			System.out.println("電動車能源剩餘量" + (Math.round(energy * 100) / 100.0) + "% ");
			// 耗電量(度)
			System.out.println((Math.round(c * 100) / 100.0) + "度");
			while (c >= 7.5) {
				if (c >= 7.5) { // 電量小於100%
					energy += 10; // 每小時充10%
					i++;
					c -= 7.5;
				}
			}
			if (c <= 7.5) {
				i += c / 7.5;
			}
			System.out.println("電量已經充滿,總共充了" + (Math.round(i * 100) / 100.0) + "小時");
		} else {
			System.out.println("電量充足");
		}
	}

	@Override
	public void stop(String s) {
		if (m > 472.5) {
			System.out.println("電量不足,引擎無法發動");
		} else if (kilometer > 472.5) {
			System.out.println("電量不足,引擎無法發動");
		} else {
			System.out.println("電量充足,引擎已發動");
		}
	};

	@Override
	public void move(int m) {
		System.out.println("當前里程數:" + m + "km");
		kilometer += m;
		System.out.println("總里程數=" + kilometer + "km");
	};

}
